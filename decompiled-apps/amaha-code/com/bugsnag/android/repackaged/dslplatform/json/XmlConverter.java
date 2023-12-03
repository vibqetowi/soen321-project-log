package com.bugsnag.android.repackaged.dslplatform.json;

import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
/* loaded from: classes.dex */
public abstract class XmlConverter {
    private static final String CDATA_NODE_TAG = "#cdata-section";
    private static final String COMMENT_NODE_TAG = "#comment";
    private static final String TEXT_NODE_TAG = "#text";
    private static final DocumentBuilder documentBuilder;
    static final JsonReader.ReadObject<Element> Reader = new JsonReader.ReadObject<Element>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.XmlConverter.1
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Element read(JsonReader jsonReader) {
            if (jsonReader.wasNull()) {
                return null;
            }
            return XmlConverter.deserialize(jsonReader);
        }
    };
    static final JsonWriter.WriteObject<Element> Writer = new JsonWriter.WriteObject<Element>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.XmlConverter.2
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, Element element) {
            XmlConverter.serializeNullable(element, jsonWriter);
        }
    };

    static {
        try {
            documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void buildCDataList(Document document, Node node, List<String> list) {
        for (String str : list) {
            node.appendChild(document.createCDATASection(str));
        }
    }

    private static void buildCommentList(Document document, Node node, List<String> list) {
        for (String str : list) {
            node.appendChild(document.createComment(str));
        }
    }

    private static void buildTextNodeList(Document document, Node node, List<String> list) {
        StringBuilder sb2 = new StringBuilder();
        for (String str : list) {
            sb2.append(str);
        }
        node.appendChild(document.createTextNode(sb2.toString()));
    }

    private static void buildXmlFromHashMap(Document document, Element element, Object obj) {
        if (obj instanceof HashMap) {
            for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                String str = (String) entry.getKey();
                if (str.startsWith("@")) {
                    element.setAttribute(str.substring(1), entry.getValue().toString());
                } else if (str.startsWith("#")) {
                    if (str.equals(TEXT_NODE_TAG)) {
                        if (entry.getValue() instanceof List) {
                            buildTextNodeList(document, element, (List) entry.getValue());
                        } else {
                            element.appendChild(document.createTextNode(entry.getValue().toString()));
                        }
                    } else if (str.equals(CDATA_NODE_TAG)) {
                        if (entry.getValue() instanceof List) {
                            buildCDataList(document, element, (List) entry.getValue());
                        } else {
                            element.appendChild(document.createCDATASection(entry.getValue().toString()));
                        }
                    } else if (str.equals(COMMENT_NODE_TAG)) {
                        if (entry.getValue() instanceof List) {
                            buildCommentList(document, element, (List) entry.getValue());
                        } else {
                            element.appendChild(document.createComment(entry.getValue().toString()));
                        }
                    }
                } else {
                    Element createElement = document.createElement(str);
                    element.appendChild(createElement);
                    buildXmlFromHashMap(document, createElement, entry.getValue());
                }
            }
        } else if (obj instanceof List) {
            buildXmlFromJsonArray(document, element, (List) obj);
        } else if (obj != null) {
            element.setTextContent(obj.toString());
        }
    }

    private static void buildXmlFromJsonArray(Document document, Node node, List<Object> list) {
        Node parentNode = node.getParentNode();
        buildXmlFromHashMap(document, (Element) node, list.get(0));
        for (Object obj : list.subList(1, list.size())) {
            Element createElement = document.createElement(node.getNodeName());
            parentNode.appendChild(createElement);
            buildXmlFromHashMap(document, createElement, obj);
        }
    }

    private static synchronized Document createDocument() {
        Document newDocument;
        synchronized (XmlConverter.class) {
            try {
                newDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            } catch (ParserConfigurationException e10) {
                throw new ConfigurationException(e10);
            }
        }
        return newDocument;
    }

    public static Element deserialize(JsonReader jsonReader) {
        if (jsonReader.last() == 34) {
            try {
                return documentBuilder.parse(new InputSource(new StringReader(jsonReader.readString()))).getDocumentElement();
            } catch (SAXException e10) {
                throw jsonReader.newParseErrorAt("Invalid XML value", 0, e10);
            }
        }
        return mapToXml(ObjectConverter.deserializeMap(jsonReader));
    }

    public static ArrayList<Element> deserializeCollection(JsonReader jsonReader) {
        return jsonReader.deserializeCollection(Reader);
    }

    public static ArrayList<Element> deserializeNullableCollection(JsonReader jsonReader) {
        return jsonReader.deserializeNullableCollection(Reader);
    }

    public static Element mapToXml(Map<String, Object> map) {
        Set<String> keySet = map.keySet();
        if (keySet.size() <= 1) {
            String next = keySet.iterator().next();
            Document createDocument = createDocument();
            Element createElement = createDocument.createElement(next);
            createDocument.appendChild(createElement);
            buildXmlFromHashMap(createDocument, createElement, map.get(next));
            return createElement;
        }
        throw ParsingException.create("Invalid XML. Expecting root element", true);
    }

    public static void serialize(Element element, JsonWriter jsonWriter) {
        Document ownerDocument = element.getOwnerDocument();
        DOMImplementationLS dOMImplementationLS = (DOMImplementationLS) ownerDocument.getImplementation();
        LSSerializer createLSSerializer = dOMImplementationLS.createLSSerializer();
        LSOutput createLSOutput = dOMImplementationLS.createLSOutput();
        createLSOutput.setEncoding("UTF-8");
        StringWriter stringWriter = new StringWriter();
        createLSOutput.setCharacterStream(stringWriter);
        createLSSerializer.write(ownerDocument, createLSOutput);
        StringConverter.serialize(stringWriter.toString(), jsonWriter);
    }

    public static void serializeNullable(Element element, JsonWriter jsonWriter) {
        if (element == null) {
            jsonWriter.writeNull();
        } else {
            serialize(element, jsonWriter);
        }
    }

    public static void deserializeCollection(JsonReader jsonReader, Collection<Element> collection) {
        jsonReader.deserializeCollection(Reader, collection);
    }

    public static void deserializeNullableCollection(JsonReader jsonReader, Collection<Element> collection) {
        jsonReader.deserializeNullableCollection(Reader, collection);
    }
}
