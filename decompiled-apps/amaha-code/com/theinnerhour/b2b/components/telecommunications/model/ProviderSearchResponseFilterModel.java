package com.theinnerhour.b2b.components.telecommunications.model;

import com.appsflyer.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import tf.b;
/* compiled from: ProviderSearchResponseFilterModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR:\u0010\f\u001a\u001e\u0012\b\u0012\u00060\u000eR\u00020\u0000\u0018\u00010\rj\u000e\u0012\b\u0012\u00060\u000eR\u00020\u0000\u0018\u0001`\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderSearchResponseFilterModel;", "Ljava/io/Serializable;", "()V", "filterKey", "", "getFilterKey", "()Ljava/lang/String;", "setFilterKey", "(Ljava/lang/String;)V", "filterLabel", "getFilterLabel", "setFilterLabel", "filterOptions", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderSearchResponseFilterModel$FilterItem;", "Lkotlin/collections/ArrayList;", "getFilterOptions", "()Ljava/util/ArrayList;", "setFilterOptions", "(Ljava/util/ArrayList;)V", "filterType", "getFilterType", "setFilterType", "FilterItem", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ProviderSearchResponseFilterModel implements Serializable {
    @b("key")
    private String filterKey;
    @b("text")
    private String filterLabel;
    @b("options")
    private ArrayList<FilterItem> filterOptions;
    @b("type")
    private String filterType;

    /* compiled from: ProviderSearchResponseFilterModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderSearchResponseFilterModel$FilterItem;", "Ljava/io/Serializable;", "(Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderSearchResponseFilterModel;)V", "key", "", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "value", "getValue", "setValue", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public final class FilterItem implements Serializable {
        @b("key")
        private String key;
        @b("label")
        private String value;

        public FilterItem() {
        }

        public final String getKey() {
            return this.key;
        }

        public final String getValue() {
            return this.value;
        }

        public final void setKey(String str) {
            this.key = str;
        }

        public final void setValue(String str) {
            this.value = str;
        }
    }

    public final String getFilterKey() {
        return this.filterKey;
    }

    public final String getFilterLabel() {
        return this.filterLabel;
    }

    public final ArrayList<FilterItem> getFilterOptions() {
        return this.filterOptions;
    }

    public final String getFilterType() {
        return this.filterType;
    }

    public final void setFilterKey(String str) {
        this.filterKey = str;
    }

    public final void setFilterLabel(String str) {
        this.filterLabel = str;
    }

    public final void setFilterOptions(ArrayList<FilterItem> arrayList) {
        this.filterOptions = arrayList;
    }

    public final void setFilterType(String str) {
        this.filterType = str;
    }
}
