package com.google.cloud.speech.v1p1beta1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes7.dex */
public class CustomClassName implements ResourceName {
    private static final PathTemplate PROJECT_LOCATION_CUSTOM_CLASS = PathTemplate.createWithoutUrlEncoding("projects/{project}/locations/{location}/customClasses/{custom_class}");
    private final String customClass;
    private volatile Map<String, String> fieldValuesMap;
    private final String location;
    private final String project;

    @Deprecated
    protected CustomClassName() {
        this.project = null;
        this.location = null;
        this.customClass = null;
    }

    private CustomClassName(Builder builder) {
        this.project = (String) Preconditions.checkNotNull(builder.getProject());
        this.location = (String) Preconditions.checkNotNull(builder.getLocation());
        this.customClass = (String) Preconditions.checkNotNull(builder.getCustomClass());
    }

    public String getProject() {
        return this.project;
    }

    public String getLocation() {
        return this.location;
    }

    public String getCustomClass() {
        return this.customClass;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder();
    }

    public static CustomClassName of(String str, String str2, String str3) {
        return newBuilder().setProject(str).setLocation(str2).setCustomClass(str3).build();
    }

    public static String format(String str, String str2, String str3) {
        return newBuilder().setProject(str).setLocation(str2).setCustomClass(str3).build().toString();
    }

    public static CustomClassName parse(String str) {
        if (str.isEmpty()) {
            return null;
        }
        Map<String, String> validatedMatch = PROJECT_LOCATION_CUSTOM_CLASS.validatedMatch(str, "CustomClassName.parse: formattedString not in valid format");
        return of(validatedMatch.get("project"), validatedMatch.get(FirebaseAnalytics.Param.LOCATION), validatedMatch.get("custom_class"));
    }

    public static List<CustomClassName> parseList(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(parse(str));
        }
        return arrayList;
    }

    public static List<String> toStringList(List<CustomClassName> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (CustomClassName customClassName : list) {
            if (customClassName == null) {
                arrayList.add("");
            } else {
                arrayList.add(customClassName.toString());
            }
        }
        return arrayList;
    }

    public static boolean isParsableFrom(String str) {
        return PROJECT_LOCATION_CUSTOM_CLASS.matches(str);
    }

    @Override // com.google.api.resourcenames.ResourceName
    public Map<String, String> getFieldValuesMap() {
        if (this.fieldValuesMap == null) {
            synchronized (this) {
                if (this.fieldValuesMap == null) {
                    ImmutableMap.Builder builder = ImmutableMap.builder();
                    String str = this.project;
                    if (str != null) {
                        builder.put("project", str);
                    }
                    String str2 = this.location;
                    if (str2 != null) {
                        builder.put(FirebaseAnalytics.Param.LOCATION, str2);
                    }
                    String str3 = this.customClass;
                    if (str3 != null) {
                        builder.put("custom_class", str3);
                    }
                    this.fieldValuesMap = builder.build();
                }
            }
        }
        return this.fieldValuesMap;
    }

    @Override // com.google.api.resourcenames.ResourceName
    public String getFieldValue(String str) {
        return getFieldValuesMap().get(str);
    }

    public String toString() {
        return PROJECT_LOCATION_CUSTOM_CLASS.instantiate("project", this.project, FirebaseAnalytics.Param.LOCATION, this.location, "custom_class", this.customClass);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null || getClass() == obj.getClass()) {
            CustomClassName customClassName = (CustomClassName) obj;
            return Objects.equals(this.project, customClassName.project) && Objects.equals(this.location, customClassName.location) && Objects.equals(this.customClass, customClassName.customClass);
        }
        return false;
    }

    public int hashCode() {
        return ((((Objects.hashCode(this.project) ^ 1000003) * 1000003) ^ Objects.hashCode(this.location)) * 1000003) ^ Objects.hashCode(this.customClass);
    }

    /* loaded from: classes7.dex */
    public static class Builder {
        private String customClass;
        private String location;
        private String project;

        protected Builder() {
        }

        public String getProject() {
            return this.project;
        }

        public String getLocation() {
            return this.location;
        }

        public String getCustomClass() {
            return this.customClass;
        }

        public Builder setProject(String str) {
            this.project = str;
            return this;
        }

        public Builder setLocation(String str) {
            this.location = str;
            return this;
        }

        public Builder setCustomClass(String str) {
            this.customClass = str;
            return this;
        }

        private Builder(CustomClassName customClassName) {
            this.project = customClassName.project;
            this.location = customClassName.location;
            this.customClass = customClassName.customClass;
        }

        public CustomClassName build() {
            return new CustomClassName(this);
        }
    }
}
