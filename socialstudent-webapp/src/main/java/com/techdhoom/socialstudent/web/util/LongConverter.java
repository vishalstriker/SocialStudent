/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.util;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Hemant
 */
@FacesConverter(value = "longConverter")
public class LongConverter implements Converter {

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return String.valueOf(value);
    }

    @Override
    @SuppressWarnings({"rawtypes", "unchecked"})
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return Long.parseLong(value);
    }
}