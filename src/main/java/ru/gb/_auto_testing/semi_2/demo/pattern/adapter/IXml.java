package ru.gb._auto_testing.semi_2.demo.pattern.adapter;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Интерфейс обработчика XML
 */
public interface IXml {

    public void openXML();

    public Integer countXMLRow();

    public String findObjectInXML(String searchString);

    public Integer getSizeXML();

    public LocalDate getCreateDate();
}
