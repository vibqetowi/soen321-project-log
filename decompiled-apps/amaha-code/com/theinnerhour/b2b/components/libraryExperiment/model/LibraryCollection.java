package com.theinnerhour.b2b.components.libraryExperiment.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import fe.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import pl.a;
/* compiled from: LibraryCollection.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B£\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\n\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\fj\b\u0012\u0004\u0012\u00020\u0004`\r\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\fj\b\u0012\u0004\u0012\u00020\u0004`\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00140\fj\b\u0012\u0004\u0012\u00020\u0014`\r¢\u0006\u0002\u0010\u0015J\u000b\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0019\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u00140\fj\b\u0012\u0004\u0012\u00020\u0014`\rHÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0004HÆ\u0003J%\u00107\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\nHÆ\u0003J\u0019\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u00040\fj\b\u0012\u0004\u0012\u00020\u0004`\rHÆ\u0003J\u0019\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u00040\fj\b\u0012\u0004\u0012\u00020\u0004`\rHÆ\u0003J\t\u0010:\u001a\u00020\u0004HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0012HÆ\u0003J»\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042$\b\u0002\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\n2\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\fj\b\u0012\u0004\u0012\u00020\u0004`\r2\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\fj\b\u0012\u0004\u0012\u00020\u0004`\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0018\b\u0002\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00140\fj\b\u0012\u0004\u0012\u00020\u0014`\rHÆ\u0001J\u0013\u0010>\u001a\u00020\u00062\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\u0012HÖ\u0001J\t\u0010B\u001a\u00020\u0004HÖ\u0001R6\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\fj\b\u0012\u0004\u0012\u00020\u0004`\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001e\u0010\u0005\u001a\u00020\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010$\"\u0004\b%\u0010&R*\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00140\fj\b\u0012\u0004\u0012\u00020\u0014`\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!R\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&R*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\fj\b\u0012\u0004\u0012\u00020\u0004`\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u0010!¨\u0006C"}, d2 = {"Lcom/theinnerhour/b2b/components/libraryExperiment/model/LibraryCollection;", "Ljava/io/Serializable;", "()V", "id", "", "isFree", "", "collectionType", "assets", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "strings", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "config", "language", "published", Constants.DAYMODEL_POSITION, "", "itemList", "Lcom/theinnerhour/b2b/components/libraryExperiment/model/LibraryCollectionItem;", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/HashMap;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;ZILjava/util/ArrayList;)V", "getAssets", "()Ljava/util/HashMap;", "setAssets", "(Ljava/util/HashMap;)V", "getCollectionType", "()Ljava/lang/String;", "setCollectionType", "(Ljava/lang/String;)V", "getConfig", "()Ljava/util/ArrayList;", "setConfig", "(Ljava/util/ArrayList;)V", "getId", "setId", "()Z", "setFree", "(Z)V", "getItemList", "setItemList", "getLanguage", "setLanguage", "getPosition", "()I", "setPosition", "(I)V", "getPublished", "setPublished", "getStrings", "setStrings", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class LibraryCollection implements Serializable {
    private HashMap<String, String> assets;
    private String collectionType;
    private ArrayList<String> config;

    /* renamed from: id  reason: collision with root package name */
    private String f11296id;
    private boolean isFree;
    private ArrayList<LibraryCollectionItem> itemList;
    private String language;
    private int position;
    private boolean published;
    private ArrayList<String> strings;

    public LibraryCollection(String str, boolean z10, String collectionType, HashMap<String, String> assets, ArrayList<String> strings, ArrayList<String> config, String language, boolean z11, int i6, ArrayList<LibraryCollectionItem> itemList) {
        i.g(collectionType, "collectionType");
        i.g(assets, "assets");
        i.g(strings, "strings");
        i.g(config, "config");
        i.g(language, "language");
        i.g(itemList, "itemList");
        this.f11296id = str;
        this.isFree = z10;
        this.collectionType = collectionType;
        this.assets = assets;
        this.strings = strings;
        this.config = config;
        this.language = language;
        this.published = z11;
        this.position = i6;
        this.itemList = itemList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LibraryCollection copy$default(LibraryCollection libraryCollection, String str, boolean z10, String str2, HashMap hashMap, ArrayList arrayList, ArrayList arrayList2, String str3, boolean z11, int i6, ArrayList arrayList3, int i10, Object obj) {
        String str4;
        boolean z12;
        String str5;
        HashMap<String, String> hashMap2;
        ArrayList<String> arrayList4;
        ArrayList<String> arrayList5;
        String str6;
        boolean z13;
        int i11;
        ArrayList<LibraryCollectionItem> arrayList6;
        if ((i10 & 1) != 0) {
            str4 = libraryCollection.f11296id;
        } else {
            str4 = str;
        }
        if ((i10 & 2) != 0) {
            z12 = libraryCollection.isFree;
        } else {
            z12 = z10;
        }
        if ((i10 & 4) != 0) {
            str5 = libraryCollection.collectionType;
        } else {
            str5 = str2;
        }
        if ((i10 & 8) != 0) {
            hashMap2 = libraryCollection.assets;
        } else {
            hashMap2 = hashMap;
        }
        if ((i10 & 16) != 0) {
            arrayList4 = libraryCollection.strings;
        } else {
            arrayList4 = arrayList;
        }
        if ((i10 & 32) != 0) {
            arrayList5 = libraryCollection.config;
        } else {
            arrayList5 = arrayList2;
        }
        if ((i10 & 64) != 0) {
            str6 = libraryCollection.language;
        } else {
            str6 = str3;
        }
        if ((i10 & 128) != 0) {
            z13 = libraryCollection.published;
        } else {
            z13 = z11;
        }
        if ((i10 & 256) != 0) {
            i11 = libraryCollection.position;
        } else {
            i11 = i6;
        }
        if ((i10 & 512) != 0) {
            arrayList6 = libraryCollection.itemList;
        } else {
            arrayList6 = arrayList3;
        }
        return libraryCollection.copy(str4, z12, str5, hashMap2, arrayList4, arrayList5, str6, z13, i11, arrayList6);
    }

    public final String component1() {
        return this.f11296id;
    }

    public final ArrayList<LibraryCollectionItem> component10() {
        return this.itemList;
    }

    public final boolean component2() {
        return this.isFree;
    }

    public final String component3() {
        return this.collectionType;
    }

    public final HashMap<String, String> component4() {
        return this.assets;
    }

    public final ArrayList<String> component5() {
        return this.strings;
    }

    public final ArrayList<String> component6() {
        return this.config;
    }

    public final String component7() {
        return this.language;
    }

    public final boolean component8() {
        return this.published;
    }

    public final int component9() {
        return this.position;
    }

    public final LibraryCollection copy(String str, boolean z10, String collectionType, HashMap<String, String> assets, ArrayList<String> strings, ArrayList<String> config, String language, boolean z11, int i6, ArrayList<LibraryCollectionItem> itemList) {
        i.g(collectionType, "collectionType");
        i.g(assets, "assets");
        i.g(strings, "strings");
        i.g(config, "config");
        i.g(language, "language");
        i.g(itemList, "itemList");
        return new LibraryCollection(str, z10, collectionType, assets, strings, config, language, z11, i6, itemList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryCollection)) {
            return false;
        }
        LibraryCollection libraryCollection = (LibraryCollection) obj;
        if (i.b(this.f11296id, libraryCollection.f11296id) && this.isFree == libraryCollection.isFree && i.b(this.collectionType, libraryCollection.collectionType) && i.b(this.assets, libraryCollection.assets) && i.b(this.strings, libraryCollection.strings) && i.b(this.config, libraryCollection.config) && i.b(this.language, libraryCollection.language) && this.published == libraryCollection.published && this.position == libraryCollection.position && i.b(this.itemList, libraryCollection.itemList)) {
            return true;
        }
        return false;
    }

    public final HashMap<String, String> getAssets() {
        return this.assets;
    }

    public final String getCollectionType() {
        return this.collectionType;
    }

    public final ArrayList<String> getConfig() {
        return this.config;
    }

    @p("_id")
    public final String getId() {
        return this.f11296id;
    }

    public final ArrayList<LibraryCollectionItem> getItemList() {
        return this.itemList;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final int getPosition() {
        return this.position;
    }

    public final boolean getPublished() {
        return this.published;
    }

    public final ArrayList<String> getStrings() {
        return this.strings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        String str = this.f11296id;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i6 = hashCode * 31;
        boolean z10 = this.isFree;
        int i10 = 1;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int c10 = a.c(this.collectionType, (i6 + i11) * 31, 31);
        int c11 = a.c(this.language, c.j(this.config, c.j(this.strings, (this.assets.hashCode() + c10) * 31, 31), 31), 31);
        boolean z11 = this.published;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        return this.itemList.hashCode() + ((((c11 + i10) * 31) + this.position) * 31);
    }

    @p("isFree")
    public final boolean isFree() {
        return this.isFree;
    }

    public final void setAssets(HashMap<String, String> hashMap) {
        i.g(hashMap, "<set-?>");
        this.assets = hashMap;
    }

    public final void setCollectionType(String str) {
        i.g(str, "<set-?>");
        this.collectionType = str;
    }

    public final void setConfig(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.config = arrayList;
    }

    @p("isFree")
    public final void setFree(boolean z10) {
        this.isFree = z10;
    }

    @p("_id")
    public final void setId(String str) {
        this.f11296id = str;
    }

    public final void setItemList(ArrayList<LibraryCollectionItem> arrayList) {
        i.g(arrayList, "<set-?>");
        this.itemList = arrayList;
    }

    public final void setLanguage(String str) {
        i.g(str, "<set-?>");
        this.language = str;
    }

    public final void setPosition(int i6) {
        this.position = i6;
    }

    public final void setPublished(boolean z10) {
        this.published = z10;
    }

    public final void setStrings(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.strings = arrayList;
    }

    public String toString() {
        return "LibraryCollection(id=" + this.f11296id + ", isFree=" + this.isFree + ", collectionType=" + this.collectionType + ", assets=" + this.assets + ", strings=" + this.strings + ", config=" + this.config + ", language=" + this.language + ", published=" + this.published + ", position=" + this.position + ", itemList=" + this.itemList + ')';
    }

    public LibraryCollection() {
        this(null, false, "", new HashMap(), new ArrayList(), new ArrayList(), "", false, 0, new ArrayList());
    }
}
