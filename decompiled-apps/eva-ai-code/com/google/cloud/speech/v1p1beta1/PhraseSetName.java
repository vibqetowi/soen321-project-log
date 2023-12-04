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
public class PhraseSetName implements ResourceName {
    private static final PathTemplate PROJECT_LOCATION_PHRASE_SET = PathTemplate.createWithoutUrlEncoding("projects/{project}/locations/{location}/phraseSets/{phrase_set}");
    private volatile Map<String, String> fieldValuesMap;
    private final String location;
    private final String phraseSet;
    private final String project;

    @Deprecated
    protected PhraseSetName() {
        this.project = null;
        this.location = null;
        this.phraseSet = null;
    }

    private PhraseSetName(Builder builder) {
        this.project = (String) Preconditions.checkNotNull(builder.getProject());
        this.location = (String) Preconditions.checkNotNull(builder.getLocation());
        this.phraseSet = (String) Preconditions.checkNotNull(builder.getPhraseSet());
    }

    public String getProject() {
        return this.project;
    }

    public String getLocation() {
        return this.location;
    }

    public String getPhraseSet() {
        return this.phraseSet;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder();
    }

    public static PhraseSetName of(String str, String str2, String str3) {
        return newBuilder().setProject(str).setLocation(str2).setPhraseSet(str3).build();
    }

    public static String format(String str, String str2, String str3) {
        return newBuilder().setProject(str).setLocation(str2).setPhraseSet(str3).build().toString();
    }

    public static PhraseSetName parse(String str) {
        if (str.isEmpty()) {
            return null;
        }
        Map<String, String> validatedMatch = PROJECT_LOCATION_PHRASE_SET.validatedMatch(str, "PhraseSetName.parse: formattedString not in valid format");
        return of(validatedMatch.get("project"), validatedMatch.get(FirebaseAnalytics.Param.LOCATION), validatedMatch.get("phrase_set"));
    }

    public static List<PhraseSetName> parseList(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(parse(str));
        }
        return arrayList;
    }

    public static List<String> toStringList(List<PhraseSetName> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (PhraseSetName phraseSetName : list) {
            if (phraseSetName == null) {
                arrayList.add("");
            } else {
                arrayList.add(phraseSetName.toString());
            }
        }
        return arrayList;
    }

    public static boolean isParsableFrom(String str) {
        return PROJECT_LOCATION_PHRASE_SET.matches(str);
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
                    String str3 = this.phraseSet;
                    if (str3 != null) {
                        builder.put("phrase_set", str3);
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
        return PROJECT_LOCATION_PHRASE_SET.instantiate("project", this.project, FirebaseAnalytics.Param.LOCATION, this.location, "phrase_set", this.phraseSet);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null || getClass() == obj.getClass()) {
            PhraseSetName phraseSetName = (PhraseSetName) obj;
            return Objects.equals(this.project, phraseSetName.project) && Objects.equals(this.location, phraseSetName.location) && Objects.equals(this.phraseSet, phraseSetName.phraseSet);
        }
        return false;
    }

    public int hashCode() {
        return ((((Objects.hashCode(this.project) ^ 1000003) * 1000003) ^ Objects.hashCode(this.location)) * 1000003) ^ Objects.hashCode(this.phraseSet);
    }

    /* loaded from: classes7.dex */
    public static class Builder {
        private String location;
        private String phraseSet;
        private String project;

        protected Builder() {
        }

        public String getProject() {
            return this.project;
        }

        public String getLocation() {
            return this.location;
        }

        public String getPhraseSet() {
            return this.phraseSet;
        }

        public Builder setProject(String str) {
            this.project = str;
            return this;
        }

        public Builder setLocation(String str) {
            this.location = str;
            return this;
        }

        public Builder setPhraseSet(String str) {
            this.phraseSet = str;
            return this;
        }

        private Builder(PhraseSetName phraseSetName) {
            this.project = phraseSetName.project;
            this.location = phraseSetName.location;
            this.phraseSet = phraseSetName.phraseSet;
        }

        public PhraseSetName build() {
            return new PhraseSetName(this);
        }
    }
}
