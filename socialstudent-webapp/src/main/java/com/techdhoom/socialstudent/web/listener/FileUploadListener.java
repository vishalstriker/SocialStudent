/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.listener;

import com.techdhoom.socialstudent.web.databean.MessageDataBean;
import com.techdhoom.socialstudent.web.util.SystemPropertyUtil;
import com.techdhoom.socialstudent.web.util.SystemResultSessionUtil;
import com.techdhoom.socialstudent.web.util.SystemResultViewUtil;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import org.richfaces.event.FileUploadEvent;
import org.richfaces.model.UploadedFile;

/**
 *
 * @author ncontractor
 */
@ManagedBean(name = "fileUploadListener")
@RequestScoped
public class FileUploadListener implements Serializable {

    @ManagedProperty(value = "#{systemResultViewUtil}")
    private SystemResultViewUtil systemResultViewUtil;
    @ManagedProperty(value = "#{systemResultSessionUtil}")
    private SystemResultSessionUtil systemResultSessionUtil;
    @ManagedProperty(value = "#{systemPropertyUtil}")
    private SystemPropertyUtil systemPropertyUtil;
    @ManagedProperty(value = "#{messageDataBean}")
    private MessageDataBean messageDataBean;

    public MessageDataBean getMessageDataBean() {
        return messageDataBean;
    }

    public void setMessageDataBean(MessageDataBean messageDataBean) {
        this.messageDataBean = messageDataBean;
    }

    public SystemPropertyUtil getSystemPropertyUtil() {
        return systemPropertyUtil;
    }

    public void setSystemPropertyUtil(SystemPropertyUtil systemPropertyUtil) {
        this.systemPropertyUtil = systemPropertyUtil;
    }

    public SystemResultSessionUtil getSystemResultSessionUtil() {
        return systemResultSessionUtil;
    }

    public void setSystemResultSessionUtil(SystemResultSessionUtil systemResultSessionUtil) {
        this.systemResultSessionUtil = systemResultSessionUtil;
    }

    public SystemResultViewUtil getSystemResultViewUtil() {
        return systemResultViewUtil;
    }

    public void setSystemResultViewUtil(SystemResultViewUtil systemResultViewUtil) {
        this.systemResultViewUtil = systemResultViewUtil;
    }
    public void imageUploadListener(FileUploadEvent event) throws Exception {
        UploadedFile item = event.getUploadedFile();
        systemResultViewUtil.setImageData(item.getData(),item.getName());
        systemResultViewUtil.setImageName(item.getName());
        systemResultSessionUtil.setImageData(item.getData());
        systemResultSessionUtil.setImageName(item.getName());
        String name = item.getName();
        System.out.println("uploaded file name is " + name);
       // systemResultViewUtil.setIsImageUploaded(true);
    }
//
//    public void imageUploadListener1(FileUploadEvent event) throws Exception {
//        UploadedFile item = event.getUploadedFile();
//        systemResultSessionUtil.setImgData(item.getData());
//        systemResultSessionUtil.setImgName(item.getName());
//        String name = item.getName();
////        System.out.println("uploaded file name is " + name);
//        systemResultViewUtil.setIsFileUploaded(true);
//    }
//
//    public void pdfUploadListener(FileUploadEvent event) throws Exception {
//        UploadedFile item = event.getUploadedFile();
//        systemResultViewUtil.setFileData(item.getData());
//        systemResultViewUtil.setFileName(item.getName());
//        String name = item.getName();
////        System.out.println("uploaded file name is " + name);
//    }
//
//    public void videoUploadListener(FileUploadEvent event) throws Exception {
//        UploadedFile item = event.getUploadedFile();
//        systemResultViewUtil.setFileData(item.getData());
//        systemResultViewUtil.setFileName(item.getName());
//        String name = item.getName();
////        System.out.println("uploaded file name is " + name);
//        systemResultViewUtil.setIsFileUploaded(Boolean.TRUE);
//    }
}
