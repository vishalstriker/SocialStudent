/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.util;

//import com.techdhoom.socialstudent.model.SystemConfiguration;
import com.argusoft.usermanagement.common.core.FeatureService;
import com.argusoft.usermanagement.common.core.RoleService;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author ncontractor
 */
@ManagedBean(name = "systemPropertyUtil")
@ApplicationScoped
public class SystemPropertyUtil {

//    @ManagedProperty(value = "#{systemConfigurationService}")
//    private SystemConfigurationService systemConfigurationService;
//    @ManagedProperty(value = "#{internationalizationService}")
//    private InternationalizationService internationalizationService;
    @ManagedProperty(value = "#{featureService}")
    private FeatureService featureService;
    @ManagedProperty(value = "#{roleService}")
    private RoleService roleService;

//    public SystemConfigurationService getSystemConfigurationService() {
//        return systemConfigurationService;
//    }
//
//    public void setSystemConfigurationService(SystemConfigurationService systemConfigurationService) {
//        this.systemConfigurationService = systemConfigurationService;
//    }

    public FeatureService getFeatureService() {
        return featureService;
    }

    public void setFeatureService(FeatureService featureService) {
        this.featureService = featureService;
    }

    public RoleService getRoleService() {
        return roleService;
    }

    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    //Method called at deploy time to retrive and set the facebook application id and secret in the application scope.
    @PostConstruct
    public void propertyInit() {
        System.out.println("propertyInit called.....................");
        //Create entries in SystemConfiguration if it is empty
//        generateSystemConfigurationData();
        //Facebook application id initialization
//        Map<String, String> keyMap = this.systemConfigurationService.retrieveAllSystemConfigurations();
//        if (keyMap != null) {
//            this.fbApplicationId = keyMap.get(SystemConstantUtil.FB_APPLICATION_ID);
//            this.fbApplicationSecret = keyMap.get(SystemConstantUtil.FB_APPLICATION_SECRET);
//            this.contactUsEmail = keyMap.get(SystemConstantUtil.CONTACT_US_EMAIL);
//            this.wlcEmail = keyMap.get(SystemConstantUtil.WLC_EMAIL);
//            this.copyrightYear = keyMap.get(SystemConstantUtil.COPYRIGHT_YEAR);
//            this.websiteUrl = keyMap.get(SystemConstantUtil.PBALANCE_WEBSITE_URL);
//            this.fbUrl = keyMap.get(SystemConstantUtil.FB_URL);
//            this.filePath = keyMap.get(SystemConstantUtil.FILE_PATH);
//            this.paypalActionUrl = keyMap.get(SystemConstantUtil.PAYPAL_ACTION_URL);
//            this.paypalPixelImageUrl = keyMap.get(SystemConstantUtil.PAYPAL_STANDARD_PIXELIMAGE);
//            this.businessName = keyMap.get(SystemConstantUtil.PAYPAL_BUSINESS_NAME);
//            this.adminContact = keyMap.get(SystemConstantUtil.ADMIN_CONTACT);
//            this.latestVideoId = keyMap.get(SystemConstantUtil.LATEST_VIDEO_ID);
//            //this.maxTestimonial = keyMap.get(SystemConstantUtil.MAX_TESTIMONIAL);
//            String cancelSessionHourStr = keyMap.get(SystemConstantUtil.CANCEL_SESSION_HOUR);
//            
//            if (cancelSessionHourStr != null) {
//                this.cancelSessionHour = Integer.parseInt(cancelSessionHourStr);
//            } else {
//                this.cancelSessionHour = 2;
//            }
//
//            this.newVideoDaysCount = 15;
//            if (keyMap.get(SystemConstantUtil.NEW_VIDEO_DAYS_COUNT) != null) {
//                newVideoDaysCount = Integer.parseInt(keyMap.get(SystemConstantUtil.NEW_VIDEO_DAYS_COUNT));
//            }
//
//            if (keyMap.get(SystemConstantUtil.RENEWAL_ALERT) != null) {
//                this.renewalAlert = Integer.parseInt(keyMap.get(SystemConstantUtil.RENEWAL_ALERT));
//            }
//            if (keyMap.get(SystemConstantUtil.MEASUREMENT_PERIOD_SESSION) != null) {
//                this.measurementPeriod = Integer.parseInt(keyMap.get(SystemConstantUtil.MEASUREMENT_PERIOD_SESSION));
//            } else {
//                this.measurementPeriod = SystemConstantUtil.MEASUREMENT_PERIOD_DAYS;
//            }
//
//            if (keyMap.get(SystemConstantUtil.MAX_TESTIMONIAL) != null) {
//                this.maxTestimonial = Integer.parseInt(keyMap.get(SystemConstantUtil.MAX_TESTIMONIAL));
//            } else {
//                this.maxTestimonial = 30;
//            }
//
//            String sesionBookPerDayStr = keyMap.get(SystemConstantUtil.SESSION_BOOK_DAY);
//            if (sesionBookPerDayStr != null) {
//                this.sessionPerDay = Integer.parseInt(sesionBookPerDayStr);
//            } else {
//                this.sessionPerDay = 2;
//            }
//
//            String sessionMarginStr = keyMap.get(SystemConstantUtil.SESSION_MARGIN);
//            if (sessionMarginStr != null) {
//                this.sessionMargin = Integer.parseInt(sessionMarginStr);
//            } else {
//                this.sessionMargin = 15;
//            }
//        }
        constructMessageBundle();

        generateMasterData();
    }

    /**
     * Method to be called once faces servlet is initialized. It creates the
     * property files for the active languages at deploy time. Called from the
     * above method which is called at post construct.
     */
    public void constructMessageBundle() {
//        SystemConfiguration labelModel = systemConfigurationService.retrieveSystemConfigurationByKey(SystemConstantUtil.LABEL_UPDATE_REQUIRED);
//        if (labelModel != null && labelModel.getKeyValue() != null && labelModel.getKeyValue().equalsIgnoreCase("true")) {
//            ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
//            String path = servletContext.getRealPath("");
//
//            if (path != null && path.charAt(path.length() - 1) != File.separatorChar) {
//                path = path + File.separator;
//            }
//            path = path + "WEB-INF" + File.separator + "classes" + File.separator;
//        }
    }

    private void generateMasterData() {
//        List<Feature> featureList = featureService.getAllFeatures(null);
//        List<String> features = new LinkedList<String>();
//        if (featureList != null && !featureList.isEmpty()) {
//            for (Feature feature : featureList) {
//                features.add(feature.getName());
//            }
//        }
//        if (!features.contains("Manage Users")) {
//            Feature feature = new Feature(null, "Manage Users", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Manage Roles")) {
//            Feature feature = new Feature(null, "Manage Roles", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Manage Roster")) {
//            Feature feature = new Feature(null, "Manage Roster", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Manage Testimonial")) {
//            Feature feature = new Feature(null, "Manage Testimonial", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Testimonial Posting")) {
//            Feature feature = new Feature(null, "Testimonial Posting", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Manage Inquiries")) {
//            Feature feature = new Feature(null, "Manage Inquiries", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Enroll PBers")) {
//            Feature feature = new Feature(null, "Enroll PBers", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Add Subscriptions")) {
//            Feature feature = new Feature(null, "Add Subscriptions", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Book Sessions")) {
//            Feature feature = new Feature(null, "Book Sessions", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Manage Programs")) {
//            Feature feature = new Feature(null, "Manage Programs", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Manage PBers")) {
//            Feature feature = new Feature(null, "Manage PBers", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Manage Medical Conditions")) {
//            Feature feature = new Feature(null, "Manage Medical Conditions", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Manage Recipes")) {
//            Feature feature = new Feature(null, "Manage Recipes", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Manage Meal Plans")) {
//            Feature feature = new Feature(null, "Manage Meal Plans", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("User Reports")) {
//            Feature feature = new Feature(null, "User Reports", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Financial Reports")) {
//            Feature feature = new Feature(null, "Financial Reports", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Manage Video")) {
//            Feature feature = new Feature(null, "Manage Video", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Manage Video Category")) {
//            Feature feature = new Feature(null, "Manage Video Category", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Video Forum")) {
//            Feature feature = new Feature(null, "Video Forum", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Take Measurements")) {
//            Feature feature = new Feature(null, "Take Measurements", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Update Medical Conditions")) {
//            Feature feature = new Feature(null, "Update Medical Conditions", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Session Roster")) {
//            Feature feature = new Feature(null, "Session Roster", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//        if (!features.contains("Manage Unit")) {
//            Feature feature = new Feature(null, "Manage Unit", true, "System", new Date(), true, false);
//            featureService.createFeature(feature);
//        }
//
//
//        if (!roleService.isRoleExist("Admin", null, null, null)) {
//            Role role = new Role(null, "Admin", "System", new Date(), true, false);
//            roleService.createRole(role);
//        }
//
//        if (!roleService.isRoleExist("Chief Admin", null, null, null)) {
//            Role role = new Role(null, "Chief Admin", "System", new Date(), true, false);
//            roleService.createRole(role);
//        }
//
//        if (!roleService.isRoleExist("PB Specialist", null, null, null)) {
//            Role role = new Role(null, "PB Specialist", "System", new Date(), true, false);
//            roleService.createRole(role);
//        }
//
//
//
//        //  create scheduler
//        List<Scheduler> schedulers = schedulerService.getActiveSchedulersOfUser(SystemConstantUtil.SYSTEM, Boolean.TRUE);
//        if (schedulers == null || schedulers.size() <= 0) {
//            try {
//                Calendar dateCal = Calendar.getInstance();
//                dateCal.set(Calendar.HOUR_OF_DAY, 0);
//                dateCal.set(Calendar.MINUTE, 0);
//                dateCal.set(Calendar.SECOND, 0);
//                dateCal.set(Calendar.MILLISECOND, 0);
//                Scheduler scheduler = new Scheduler();
//                scheduler.setCreatedBy(SystemConstantUtil.SYSTEM);
//                scheduler.setCreatedOn(dateCal.getTime());
//                scheduler.setFromDate(dateCal.getTime());
//                scheduler.setIsActive(Boolean.TRUE);
//                scheduler.setIsArchive(Boolean.FALSE);
//                scheduler.setIsTemporary(Boolean.FALSE);
//                scheduler.setSchedulerApproach(DAY);
//                scheduler.setUserId(SystemConstantUtil.SYSTEM);
//                Long schedulerId = schedulerService.createScheduler(scheduler);
//                if (schedulerId == null) {
//                    System.out.println("Scheduler creation failed..................... :(");
//                } else {
//                    scheduler.setId(schedulerId);
//                    this.scheduler = scheduler;
//                }
//            } catch (SchedulerException ex) {
//                java.util.logging.Logger.getLogger(SystemPropertyUtil.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } else {
//            this.scheduler = schedulers.get(0);
//        }
//
//    }
//
//    private void generateSystemConfigurationData() {
//        Map<String, String> systemConfigurationMap = null;
//        systemConfigurationMap = this.systemConfigurationService.retrieveAllSystemConfigurations();
//        if (systemConfigurationMap != null && !systemConfigurationMap.isEmpty()) {
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.ADMIN_CONTACT)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.ADMIN_CONTACT, SystemConstantUtil.ADMIN_CONTACT_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.CONTACT_US_EMAIL)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.CONTACT_US_EMAIL, SystemConstantUtil.CONTACT_US_EMAIL_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.COPYRIGHT_YEAR)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.COPYRIGHT_YEAR, SystemConstantUtil.COPYRIGHT_YEAR_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.FB_APPLICATION_ID)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.FB_APPLICATION_ID, SystemConstantUtil.FB_APPLICATION_ID_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.FB_APPLICATION_SECRET)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.FB_APPLICATION_SECRET, SystemConstantUtil.FB_APPLICATION_SECRET_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.FB_URL)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.FB_URL, SystemConstantUtil.FB_URL_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.FILE_PATH)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.FILE_PATH, SystemConstantUtil.FILE_PATH_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.LABEL_UPDATE_REQUIRED)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.LABEL_UPDATE_REQUIRED, SystemConstantUtil.LABEL_UPDATE_REQUIRED_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.MAX_TESTIMONIAL)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.MAX_TESTIMONIAL, SystemConstantUtil.MAX_TESTIMONIAL_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.MEASUREMENT_PERIOD_SESSION)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.MEASUREMENT_PERIOD_SESSION, SystemConstantUtil.MEASUREMENT_PERIOD_SESSION_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.NEW_VIDEO_DAYS_COUNT)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.NEW_VIDEO_DAYS_COUNT, SystemConstantUtil.NEW_VIDEO_DAYS_COUNT_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.PAYPAL_ACTION_URL)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.PAYPAL_ACTION_URL, SystemConstantUtil.PAYPAL_ACTION_URL_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.PAYPAL_BUSINESS_NAME)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.PAYPAL_BUSINESS_NAME, SystemConstantUtil.PAYPAL_BUSINESS_NAME_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.PAYPAL_STANDARD_BUYNOWIMAGE)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.PAYPAL_STANDARD_BUYNOWIMAGE, SystemConstantUtil.PAYPAL_STANDARD_BUYNOWIMAGE_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.PAYPAL_STANDARD_CANCEL_URL)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.PAYPAL_STANDARD_CANCEL_URL, SystemConstantUtil.PAYPAL_STANDARD_CANCEL_URL_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.PAYPAL_STANDARD_NOTIFIED_URL)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.PAYPAL_STANDARD_NOTIFIED_URL, SystemConstantUtil.PAYPAL_STANDARD_NOTIFIED_URL_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.PAYPAL_STANDARD_PIXELIMAGE)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.PAYPAL_STANDARD_PIXELIMAGE, SystemConstantUtil.PAYPAL_STANDARD_PIXELIMAGE_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.PAYPAL_STANDARD_RETURN_URL)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.PAYPAL_STANDARD_RETURN_URL, SystemConstantUtil.PAYPAL_STANDARD_RETURN_URL_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.PBALANCE_WEBSITE_URL)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.PBALANCE_WEBSITE_URL, SystemConstantUtil.PBALANCE_WEBSITE_URL_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.RENEWAL_ALERT)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.RENEWAL_ALERT, SystemConstantUtil.RENEWAL_ALERT_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.SYSTEM_VERSION)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.SYSTEM_VERSION, SystemConstantUtil.SYSTEM_VERSION_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.WLC_EMAIL)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.WLC_EMAIL, SystemConstantUtil.WLC_EMAIL_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.LATEST_VIDEO_ID)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.LATEST_VIDEO_ID, SystemConstantUtil.LATEST_VIDEO_ID_DEFAULT_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.SESSION_BOOK_DAY)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.SESSION_BOOK_DAY, SystemConstantUtil.SESSION_BOOK_DAY_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.SESSION_MARGIN)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.SESSION_MARGIN, SystemConstantUtil.SESSION_MARGIN_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//            if (!systemConfigurationMap.containsKey(SystemConstantUtil.CANCEL_SESSION_HOUR)) {
//                SystemConfiguration systemConfiguration = createSystemConfigurationObject(SystemConstantUtil.CANCEL_SESSION_HOUR, SystemConstantUtil.CANCEL_SESSION_HOUR_VALUE);
//                this.systemConfigurationService.createSystemConfiguration(systemConfiguration);
//            }
//
//        }
    }

//    private SystemConfiguration createSystemConfigurationObject(String key, String value) {
//        SystemConfiguration systemConfiguration = new SystemConfiguration();
//        systemConfiguration.setSystemKey(key);
//        systemConfiguration.setKeyValue(value);
//        systemConfiguration.setIsActive(Boolean.TRUE);
//        return systemConfiguration;
//    }
}
