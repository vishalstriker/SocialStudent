/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package  com.techdhoom.socialstudent.web.util;

/**
 *
 * @author dmoteria
 */
import javax.faces.convert.FacesConverter;
import javax.faces.convert.LongConverter;

@FacesConverter(value="userRoleConverter")
public class UserRoleConverter extends LongConverter {

    public UserRoleConverter() {
        super();
    }
    

}