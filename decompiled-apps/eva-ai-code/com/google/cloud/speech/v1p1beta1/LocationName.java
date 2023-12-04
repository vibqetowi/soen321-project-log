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
public class LocationName implements ResourceName {
    private static final PathTemplate PROJECT_LOCATION = PathTemplate.createWithoutUrlEncoding("projects/{project}/locations/{location}");
    private volatile Map<String, String> fieldValuesMap;
    private final String location;
    private final String project;

    @Deprecated
    protected LocationName() {
        this.project = null;
        this.location = null;
    }

    private LocationName(Builder builder) {
        this.project = (String) Preconditions.checkNotNull(builder.getProject());
        this.location = (String) Preconditions.checkNotNull(builder.getLocation());
    }

    public String getProject() {
        return this.project;
    }

    public String getLocation() {
        return this.location;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder();
    }

    public static LocationName of(String str, String str2) {
        return newBuilder().setProject(str).setLocation(str2).build();
    }

    public static String format(String str, String str2) {
        return newBuilder().setProject(str).setLocation(str2).build().toString();
    }

    public static LocationName parse(String str) {
        if (str.isEmpty()) {
            return null;
        }
        Map<String, String> validatedMatch = PROJECT_LOCATION.validatedMatch(str, "LocationName.parse: formattedString not in valid format");
        return of(validatedMatch.get("project"), validatedMatch.get(FirebaseAnalytics.Param.LOCATION));
    }

    public static List<LocationName> parseList(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(parse(str));
        }
        return arrayList;
    }

    public static List<String> toStringList(List<LocationName> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (LocationName locationName : list) {
            if (locationName == null) {
                arrayList.add("");
            } else {
                arrayList.add(locationName.toString());
            }
        }
        return arrayList;
    }

    public static boolean isParsableFrom(String str) {
        return PROJECT_LOCATION.matches(str);
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
        return PROJECT_LOCATION.instantiate("project", this.project, FirebaseAnalytics.Param.LOCATION, this.location);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null || getClass() == obj.getClass()) {
            LocationName locationName = (LocationName) obj;
            return Objects.equals(this.project, locationName.project) && Objects.equals(this.location, locationName.location);
        }
        return false;
    }

    public int hashCode() {
        return ((Objects.hashCode(this.project) ^ 1000003) * 1000003) ^ Objects.hashCode(this.location);
    }

    /* loaded from: classes7.dex */
    public static class Builder {
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

        public Builder setProject(String str) {
            this.project = str;
            return this;
        }

        public Builder setLocation(String str) {
            this.location = str;
            return this;
        }

        private Builder(LocationName locationName) {
            this.project = locationName.project;
            this.location = locationName.location;
        }

        public LocationName build() {
            return new LocationName(this);
        }
    }
}
