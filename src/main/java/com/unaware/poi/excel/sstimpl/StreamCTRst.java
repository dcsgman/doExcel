package com.unaware.poi.excel.sstimpl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.xmlbeans.*;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.*;
import org.w3c.dom.Node;
import org.xml.sax.ContentHandler;
import org.xml.sax.ext.LexicalHandler;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamReader;
import java.io.*;
import java.util.List;

/**
 * @author Unaware
 * @Description: Extremely unfinished implementation of the CTRst interface.
 *               Provides enough data to callers that the unit tests pass, but it's very likely that advanced uses of POI datatypes will fail.
 * @Title: StreamCTRst
 * @ProjectName excel
 * @date 2018/7/13 14:18
 */
@JsonIgnoreProperties({"nil", "rlist", "rphList", "setT", "setPhoneticPr", "immutable", "domNode", "rarray", "rphArray", "phoneticPr"})
public class StreamCTRst implements CTRst {
    public static final CTRst EMPTY = new StreamCTRst("");

    private final String string;

    @JsonCreator
    public StreamCTRst(@JsonProperty("string") String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    @Override
    public String getT() {
        return string;
    }

    @Override
    public STXstring xgetT() {
        return null;
    }

    @Override
    public boolean isSetT() {
        return string != null;
    }

    @JsonIgnore
    @Override
    public void setT(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void xsetT(STXstring stXstring) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void unsetT() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<CTRElt> getRList() {
        return null;
    }

    @Override
    public CTRElt[] getRArray() {
        return new CTRElt[0];
    }

    @Override
    public CTRElt getRArray(int i) {
        return null;
    }

    @Override
    public int sizeOfRArray() {
        return 0;
    }

    @Override
    public void setRArray(CTRElt[] ctrElts) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setRArray(int i, CTRElt ctrElt) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CTRElt insertNewR(int i) {
        return null;
    }

    @Override
    public CTRElt addNewR() {
        return null;
    }

    @Override
    public void removeR(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<CTPhoneticRun> getRPhList() {
        return null;
    }

    @Override
    public CTPhoneticRun[] getRPhArray() {
        return new CTPhoneticRun[0];
    }

    @Override
    public CTPhoneticRun getRPhArray(int i) {
        return null;
    }

    @Override
    public int sizeOfRPhArray() {
        return 0;
    }

    @Override
    public void setRPhArray(CTPhoneticRun[] ctPhoneticRuns) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setRPhArray(int i, CTPhoneticRun ctPhoneticRun) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CTPhoneticRun insertNewRPh(int i) {
        return null;
    }

    @Override
    public CTPhoneticRun addNewRPh() {
        return null;
    }

    @Override
    public void removeRPh(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CTPhoneticPr getPhoneticPr() {
        return null;
    }

    @Override
    public boolean isSetPhoneticPr() {
        return false;
    }

    @Override
    public void setPhoneticPr(CTPhoneticPr ctPhoneticPr) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CTPhoneticPr addNewPhoneticPr() {
        return null;
    }

    @Override
    public void unsetPhoneticPr() {
        throw new UnsupportedOperationException();
    }

    @Override
    public SchemaType schemaType() {
        return null;
    }

    @Override
    public boolean validate() {
        return false;
    }

    @Override
    public boolean validate(XmlOptions xmlOptions) {
        return false;
    }

    @Override
    public XmlObject[] selectPath(String s) {
        return new XmlObject[0];
    }

    @Override
    public XmlObject[] selectPath(String s, XmlOptions xmlOptions) {
        return new XmlObject[0];
    }

    @Override
    public XmlObject[] execQuery(String s) {
        return new XmlObject[0];
    }

    @Override
    public XmlObject[] execQuery(String s, XmlOptions xmlOptions) {
        return new XmlObject[0];
    }

    @Override
    public XmlObject changeType(SchemaType schemaType) {
        return null;
    }

    @Override
    public XmlObject substitute(QName qName, SchemaType schemaType) {
        return null;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public void setNil() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isImmutable() {
        return false;
    }

    @Override
    public XmlObject set(XmlObject xmlObject) {
        return null;
    }

    @Override
    public XmlObject copy() {
        return null;
    }

    @Override
    public boolean valueEquals(XmlObject xmlObject) {
        return false;
    }

    @Override
    public int valueHashCode() {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int compareValue(XmlObject xmlObject) {
        return 0;
    }

    @Override
    public XmlObject[] selectChildren(QName qName) {
        return new XmlObject[0];
    }

    @Override
    public XmlObject[] selectChildren(String s, String s1) {
        return new XmlObject[0];
    }

    @Override
    public XmlObject[] selectChildren(QNameSet qNameSet) {
        return new XmlObject[0];
    }

    @Override
    public XmlObject selectAttribute(QName qName) {
        return null;
    }

    @Override
    public XmlObject selectAttribute(String s, String s1) {
        return null;
    }

    @Override
    public XmlObject[] selectAttributes(QNameSet qNameSet) {
        return new XmlObject[0];
    }

    @Override
    public Object monitor() {
        return null;
    }

    @Override
    public XmlDocumentProperties documentProperties() {
        return null;
    }

    @Override
    public XmlCursor newCursor() {
        return null;
    }

    /**
     * @deprecated
     */
    @Override
    public XMLInputStream newXMLInputStream() {
        return null;
    }

    @Override
    public XMLStreamReader newXMLStreamReader() {
        return null;
    }

    @Override
    public String xmlText() {
        return null;
    }

    @Override
    public InputStream newInputStream() {
        return null;
    }

    @Override
    public Reader newReader() {
        return null;
    }

    @Override
    public Node newDomNode() {
        return null;
    }

    @Override
    public Node getDomNode() {
        return null;
    }

    @Override
    public void save(ContentHandler contentHandler, LexicalHandler lexicalHandler) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void save(File file) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void save(OutputStream outputStream) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void save(Writer writer) {
        throw new UnsupportedOperationException();
    }

    /**
     * @param xmlOptions
     * @deprecated
     */
    @Override
    public XMLInputStream newXMLInputStream(XmlOptions xmlOptions) {
        return null;
    }

    @Override
    public XMLStreamReader newXMLStreamReader(XmlOptions xmlOptions) {
        return null;
    }

    @Override
    public String xmlText(XmlOptions xmlOptions) {
        return null;
    }

    @Override
    public InputStream newInputStream(XmlOptions xmlOptions) {
        return null;
    }

    @Override
    public Reader newReader(XmlOptions xmlOptions) {
        return null;
    }

    @Override
    public Node newDomNode(XmlOptions xmlOptions) {
        return null;
    }

    @Override
    public void save(ContentHandler contentHandler, LexicalHandler lexicalHandler, XmlOptions xmlOptions) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void save(File file, XmlOptions xmlOptions) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void save(OutputStream outputStream, XmlOptions xmlOptions) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void save(Writer writer, XmlOptions xmlOptions) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void dump() {
        throw new UnsupportedOperationException();
    }
}
