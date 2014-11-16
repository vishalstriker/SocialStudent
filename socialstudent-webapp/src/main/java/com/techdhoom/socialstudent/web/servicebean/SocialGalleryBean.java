
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.servicebean;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author tapan
 */
@ManagedBean
@RequestScoped
public class SocialGalleryBean {

    public List<String> imagePathList;

    public List<String> getImagePathList() {
        return imagePathList;
    }

    public void setImagePathList(List<String> imagePath) {
        this.imagePathList = imagePath;
    }

    public void showGallery() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String realPath = facesContext.getExternalContext().getRealPath("/images/gallery");
        System.out.println("\n\t--- real path "+realPath);
        File folder = new File(realPath);
        File[] listOfFiles = folder.listFiles();
        imagePathList = new ArrayList<String>();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
                imagePathList.add(realPath+"\\"+listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }
    }
}
