package org.json;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes5.dex */
public class XMLParserConfiguration {
    private String cDataTagName;
    private boolean convertNilAttributeToNull;
    private Set<String> forceList;
    private boolean keepStrings;
    private Map<String, XMLXsiTypeConverter<?>> xsiTypeMap;
    public static final XMLParserConfiguration ORIGINAL = new XMLParserConfiguration();
    public static final XMLParserConfiguration KEEP_STRINGS = new XMLParserConfiguration().withKeepStrings(true);

    public XMLParserConfiguration() {
        this.keepStrings = false;
        this.cDataTagName = FirebaseAnalytics.Param.CONTENT;
        this.convertNilAttributeToNull = false;
        this.xsiTypeMap = Collections.emptyMap();
        this.forceList = Collections.emptySet();
    }

    @Deprecated
    public XMLParserConfiguration(boolean z) {
        this(z, FirebaseAnalytics.Param.CONTENT, false);
    }

    @Deprecated
    public XMLParserConfiguration(String str) {
        this(false, str, false);
    }

    @Deprecated
    public XMLParserConfiguration(boolean z, String str) {
        this.keepStrings = z;
        this.cDataTagName = str;
        this.convertNilAttributeToNull = false;
    }

    @Deprecated
    public XMLParserConfiguration(boolean z, String str, boolean z2) {
        this.keepStrings = z;
        this.cDataTagName = str;
        this.convertNilAttributeToNull = z2;
    }

    private XMLParserConfiguration(boolean z, String str, boolean z2, Map<String, XMLXsiTypeConverter<?>> map, Set<String> set) {
        this.keepStrings = z;
        this.cDataTagName = str;
        this.convertNilAttributeToNull = z2;
        this.xsiTypeMap = Collections.unmodifiableMap(map);
        this.forceList = Collections.unmodifiableSet(set);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public XMLParserConfiguration clone() {
        return new XMLParserConfiguration(this.keepStrings, this.cDataTagName, this.convertNilAttributeToNull, this.xsiTypeMap, this.forceList);
    }

    public boolean isKeepStrings() {
        return this.keepStrings;
    }

    public XMLParserConfiguration withKeepStrings(boolean z) {
        XMLParserConfiguration clone = clone();
        clone.keepStrings = z;
        return clone;
    }

    public String getcDataTagName() {
        return this.cDataTagName;
    }

    public XMLParserConfiguration withcDataTagName(String str) {
        XMLParserConfiguration clone = clone();
        clone.cDataTagName = str;
        return clone;
    }

    public boolean isConvertNilAttributeToNull() {
        return this.convertNilAttributeToNull;
    }

    public XMLParserConfiguration withConvertNilAttributeToNull(boolean z) {
        XMLParserConfiguration clone = clone();
        clone.convertNilAttributeToNull = z;
        return clone;
    }

    public Map<String, XMLXsiTypeConverter<?>> getXsiTypeMap() {
        return this.xsiTypeMap;
    }

    public XMLParserConfiguration withXsiTypeMap(Map<String, XMLXsiTypeConverter<?>> map) {
        XMLParserConfiguration clone = clone();
        clone.xsiTypeMap = Collections.unmodifiableMap(new HashMap(map));
        return clone;
    }

    public Set<String> getForceList() {
        return this.forceList;
    }

    public XMLParserConfiguration withForceList(Set<String> set) {
        XMLParserConfiguration clone = clone();
        clone.forceList = Collections.unmodifiableSet(new HashSet(set));
        return clone;
    }
}
