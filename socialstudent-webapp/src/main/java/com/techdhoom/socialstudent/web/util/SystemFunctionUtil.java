/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.util;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.servlet.http.HttpServletRequest;
import org.springframework.util.StringUtils;

/**
 *
 * @author mpritmani
 */
public class SystemFunctionUtil {
    
    public static Date convertToStartDate(Date date) {
        Calendar calDate = Calendar.getInstance();
        if(date != null) {       
            calDate.setTime(date);             
        }
        calDate.set(Calendar.HOUR_OF_DAY, 0);
        calDate.set(Calendar.MINUTE, 0);
        calDate.set(Calendar.SECOND, 0);
        calDate.set(Calendar.MILLISECOND, 0);
        return calDate.getTime();
    }
    
     public static Date convertToEndDate(Date date) {
        Calendar calDate = Calendar.getInstance();
        if(date != null) {       
            calDate.setTime(date);             
        }
        calDate.set(Calendar.HOUR_OF_DAY, 23);
        calDate.set(Calendar.MINUTE, 59);
        calDate.set(Calendar.SECOND, 59);
        calDate.set(Calendar.MILLISECOND, 999);
        return calDate.getTime();
    }

    public static Date convertDateTimeToUserTimezone(Date inputDate, String userTimeZone) {
        try {
            if (userTimeZone.equalsIgnoreCase(SystemConstantUtil.TIMEZONE_PDT)) {
                userTimeZone = "GMT-7:00";
            }
            inputDate.setTime(inputDate.getTime() - TimeZone.getTimeZone(SystemConstantUtil.SERVER_TIMEZONE).getRawOffset() + TimeZone.getTimeZone(userTimeZone).getRawOffset());
        } catch (Exception e) {
            inputDate = null;
        }
        return inputDate;
    }

    public static Date convertDateTimeToServerTimeZone(Date inputDate, String userTimeZone) {
        try {
            if (userTimeZone.equalsIgnoreCase(SystemConstantUtil.TIMEZONE_PDT)) {
                userTimeZone = "GMT-7:00";
            }
            inputDate.setTime(inputDate.getTime() - TimeZone.getTimeZone(userTimeZone).getRawOffset() + TimeZone.getTimeZone(SystemConstantUtil.SERVER_TIMEZONE).getRawOffset());
        } catch (Exception e) {
            inputDate = null;
        }
        return inputDate;
    }

    public static Date convertDateTime(Date inputDate, String sourceTimeZone, String destinationTimeZone) {
        try {
            if (sourceTimeZone.equalsIgnoreCase(SystemConstantUtil.TIMEZONE_PDT)) {
                sourceTimeZone = "GMT-7:00";
            }
            if (destinationTimeZone.equalsIgnoreCase(SystemConstantUtil.TIMEZONE_PDT)) {
                destinationTimeZone = "GMT-7:00";
            }
            if (!sourceTimeZone.equalsIgnoreCase(destinationTimeZone)) {
                inputDate.setTime(inputDate.getTime() - TimeZone.getTimeZone(sourceTimeZone).getRawOffset() + TimeZone.getTimeZone(destinationTimeZone).getRawOffset());
            }
        } catch (Exception e) {
            inputDate = null;
        }
        return inputDate;
    }

    public static Flash getFlashScope() {
        return (FacesContext.getCurrentInstance().getExternalContext().getFlash());
    }

    public static String[] getStringToArray(String value, String tokenizer) {
        StringTokenizer stringTokenizer = new StringTokenizer(value, tokenizer);
        String values[] = new String[stringTokenizer.countTokens()];
        int cntr = 0;
        while (stringTokenizer.hasMoreTokens()) {
            values[cntr++] = stringTokenizer.nextToken();
        }
        return values;
    }

    public static String getLabelMessage(String key) {
        String message = null;
        String orgMessage = key;

        if (key != null) {
            key = key.trim();
            key = key.replace(" ", "");

            Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
            ResourceBundle bundle = ResourceBundle.getBundle("ValidationMessages", locale);

            if (bundle != null) {
                try {
                    message = bundle.getString(key);
                } catch (MissingResourceException ex) {
                }
            }

            if (message == null) {
                message = orgMessage;
            }
        }

        return message;
    }

    public static String mailFormatForHeader(String webSiteURL, boolean addMsgOfEnsuredDelivery) {
        FacesContext faces = FacesContext.getCurrentInstance();
        String contextPath = null;
        if (faces != null) {
            HttpServletRequest request = (HttpServletRequest) faces.getExternalContext().getRequest();
            String requestURL = null;
            String requestURI = null;
            if (request != null) {
                requestURI = request.getRequestURI();
                requestURL = request.getRequestURL().toString();
            }
            if (requestURI == null) {
                requestURI = "";
            }
            contextPath = requestURL.replaceAll(requestURI, "");
        } else {
            contextPath = webSiteURL;
        }

        StringBuilder msg = new StringBuilder();
        msg.append("<html xmlns='http://www.w3.org/1999/xhtml'>");
        msg.append("<head>");
        msg.append("<meta http-equiv='Content-Type' content='text/html; charset=iso-8859-1' />");
        msg.append("<title>Untitled Document</title>");
        msg.append("</head>");
        msg.append("<body>");
        if (addMsgOfEnsuredDelivery) {
            msg.append("<center style='font-family: Arial, Helvetica, sans-serif; font-size:9px;'>To ensure you receive future emails, please add noreply@pbalance.com to your Safe Sender list.</center><br/>");
        }
        msg.append("<div style='margin:0 auto; font-family: Arial, Helvetica, sans-serif; font-size:12px;' > <img src = '").append(contextPath).append("/images/email-header.png' alt = 'Perfect Balance' /> <hr style='border-bottom:solid 1px #9e0709; border-top:none; border-left:none; border-right:none; margin-bottom:5px;'/>");
//        msg.append("<center style='font-family: Arial, Helvetica, sans-serif; font-size:9px;'>To ensure you receive future emails, please add noreply@pbalance.com to your Safe Sender list.</center> <div  style='margin:0 auto; font-family: Arial, Helvetica, sans-serif; font-size:12px;' > <img src = '" + contextPath + "/images/perfect-balance-logo.png' alt = 'PBalance' width = '162' height = '57' /> <hr style='border-bottom:solid 2px #26B7ED; border-top:none; border-left:none; border-right:none; margin-bottom:5px;'/>");
        return msg.toString();
    }

    public static String mailFormatForFooter(String websiteURL, String copyrightYear) {
        StringBuilder msg = new StringBuilder();
//        msg.append("<br/><br/>Please do not reply to this email. This mailbox is not monitored and you will not receive a response.<br />");
//        msg.append("If you have any queries, please visit our website and check the FAQs.<br />");
//        msg.append("OR<br />");
//        msg.append("<strong>Contact Us at:<br />");
        //msg.append("Phone: " + phoneNo + "<br />");
//        msg.append("Email:&nbsp;<a href='mailto:support@pbalance.com' target='_blank'>" + adminUserId + "</a></strong><br /><br />");
//        msg.append("<hr style='border-bottom:solid 2px #26B7ED; border-top:none; border-left:none; border-right:none; margin-bottom:5px;'/>");
        msg.append("<hr style='border-bottom:solid 1px #9e0709; border-top:none; border-left:none; border-right:none; margin-bottom:5px;'/>");
        msg.append("<br/><div>With Best Wishes, <br/>Team Perfect Balance.</div>");
//        msg.append("<br/><div>Best Regards,<br />");
//        msg.append("PBalance Team.<br />");
//        msg.append("<a href='http://").append(websiteURL).append("' target='_blank'>").append(websiteURL).append("</a><br />");
//        msg.append("Copyright &copy; ").append(copyrightYear).append(" PBalance. All rights reserved.<br /> </div>");
        msg.append("</body>");
        msg.append("</html>");
        return msg.toString();
    }

    public static String getUserTypeDescription(String type) {
        String typeStr = "Website Member";

        if (StringUtils.hasText(type)) {
//            if (type.equalsIgnoreCase(SystemConstantUtil.ROLE_ADMIN)) {
//                typeStr = "Admin";
//            } else if (type.equalsIgnoreCase(SystemConstantUtil.ROLE_SUPER_ADMIN)) {
//                typeStr = "Super Admin";
//            } else if (type.equalsIgnoreCase(SystemConstantUtil.ROLE_CHIEF_TRAINER)) {
//                typeStr = "Chief PB Specialist";
//            } else if (type.equalsIgnoreCase(SystemConstantUtil.ROLE_TRAINER)) {
//                typeStr = "PB Specialist";
//            } else if (type.equalsIgnoreCase(SystemConstantUtil.ROLE_STUDIO_MEMBER)) {
//                typeStr = "PBer";
//            } else if (type.equalsIgnoreCase(SystemConstantUtil.ROLE_MEMBER)) {
//                typeStr = "Website Member";
//            }
        }

        return typeStr;
    }

    public static int calculateAge(Date date) {
        if (date == null) {
            return 0;
        }
        int day = 0, month = 0, year = 0, ageYears, ageMonths, ageDays;
        Calendar cd = Calendar.getInstance();

        Calendar bd = Calendar.getInstance();
        bd.setTime(date);

        ageYears = cd.get(Calendar.YEAR) - bd.get(Calendar.YEAR);
        day = bd.get(Calendar.DAY_OF_MONTH);
        month = bd.get(Calendar.MONTH);
        year = bd.get(Calendar.YEAR);
        if (cd.before(new GregorianCalendar(year, month, day))) {
            ageYears--;

            ageMonths = (12 - (bd.get(Calendar.MONTH))) + (bd.get(Calendar.MONTH));
            if (day > cd.get(Calendar.DAY_OF_MONTH)) {
                ageDays = day - cd.get(Calendar.DAY_OF_MONTH);
            } else if (day < cd.get(Calendar.DAY_OF_MONTH)) {
                ageDays = day - cd.get(Calendar.DAY_OF_MONTH);
            } else {
                ageDays = 0;
            }
        } else if (cd.after(new GregorianCalendar(year, month,
                day))) {
            ageMonths = (cd.get(Calendar.MONTH) - (bd.get(Calendar.MONTH)));
            if (day > cd.get(Calendar.DAY_OF_MONTH)) {
                ageDays = cd.get(Calendar.DAY_OF_MONTH) - day;
            } else if (day < cd.get(Calendar.DAY_OF_MONTH)) {
                ageDays = cd.get(Calendar.DAY_OF_MONTH) - day;
            } else {
                ageDays = 0;
            }
        } else {
            ageYears = cd.get(Calendar.YEAR) - bd.get(Calendar.YEAR);
            ageMonths = 0;
            ageDays = 0;
        }

        if (ageDays < 0) {
            ageMonths--;

        }

        if (ageMonths < 0) {
            ageYears--;
        }

        return ageYears;
    }

    public static String generateFullAddress(String street1, String street2, String city, String state, String zipCode) {
        StringBuilder fullAddress = new StringBuilder();
        fullAddress.append((street1 != null) ? street1 : "");
        fullAddress.append((street2 != null && !street2.trim().isEmpty()) ? ",<br/>" + street2 : "");
        fullAddress.append((city != null) ? ",<br/>" + city : "");
        fullAddress.append((state != null) ? ",<br/> " + state : "");
        fullAddress.append((zipCode != null) ? ", " + zipCode : "");
        return fullAddress.toString();
    }

    /**
     * 
     * @param content
     * @return name of the created file, if could not be created, returns null
     */
    public static String createFile(byte[] content, String filePath, String extension) {
        System.out.println("time is " + new Date().getTime());
        String fileName = null;
        if (filePath != null) {
            try {
                fileName = new Date().getTime() + extension;
                filePath += fileName;
                File newFile = new File(filePath);
//                System.out.println("file path is " + filePath);
                System.out.println("exists " + newFile.exists());
                if (newFile.exists()) {
                }
                newFile.createNewFile();
                if (newFile.exists()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(newFile);
                    fileOutputStream.write(content);
                    fileOutputStream.close();
                } else {
                    fileName = null;
                }
            } catch (Exception exception) {
                System.out.println("Exception is " + exception.getMessage());
                exception.printStackTrace();
                fileName = null;
            }
        } else {
            System.out.println("path v got is null");
        }
        return fileName;
    }

    public static void deleteFile(String file) {
        if (file != null && !file.isEmpty()) {
            File f1 = new File(file);
            boolean success = f1.delete();
        }
    }
}
