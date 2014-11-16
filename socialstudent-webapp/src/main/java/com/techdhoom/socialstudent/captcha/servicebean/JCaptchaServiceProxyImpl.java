package com.techdhoom.socialstudent.captcha.servicebean;

import com.octo.captcha.service.CaptchaServiceException;
import com.octo.captcha.service.image.ImageCaptchaService;

/**
 * This class binds JCaptcha servlet to JSF implementation.
 * @author 
 */
public class JCaptchaServiceProxyImpl {
	private ImageCaptchaService jcaptchaService;
	
	/**
	 * This method called everytime when it need to validate JCaptcha varification code with 
	 * the code enter by user. 
	 */
	public boolean validateReponseForId(String id, Object response) {
		try {
			boolean validated = jcaptchaService.validateResponseForID(id, response);
			return validated;
		} catch (CaptchaServiceException cse) {
			// fixes known bug in JCaptcha
			cse.printStackTrace();
			return false;
		}
	}
	public void setJcaptchaService(ImageCaptchaService jcaptchaService) {
		this.jcaptchaService = jcaptchaService;
	}
}
