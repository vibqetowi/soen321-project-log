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
import v.g;
/* compiled from: LibraryCollectionItem.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\rj\b\u0012\u0004\u0012\u00020\u0004`\u000e\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\rj\b\u0012\u0004\u0012\u00020\u0004`\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0014J\t\u00105\u001a\u00020\u0004HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00107\u001a\u00020\u0004HÆ\u0003J%\u00108\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\"J\u0019\u0010;\u001a\u0012\u0012\u0004\u0012\u00020\u00040\rj\b\u0012\u0004\u0012\u00020\u0004`\u000eHÆ\u0003J\u0019\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u00040\rj\b\u0012\u0004\u0012\u00020\u0004`\u000eHÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\u0012HÆ\u0003J´\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042$\b\u0002\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\rj\b\u0012\u0004\u0012\u00020\u0004`\u000e2\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\rj\b\u0012\u0004\u0012\u00020\u0004`\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\u00122\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020\u000bHÖ\u0001J\t\u0010E\u001a\u00020\u0004HÖ\u0001R6\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\rj\b\u0012\u0004\u0012\u00020\u0004`\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001e\"\u0004\b'\u0010 R\u001e\u0010\u0011\u001a\u00020\u00128\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\rj\b\u0012\u0004\u0012\u00020\u0004`\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001c¨\u0006F"}, d2 = {"Lcom/theinnerhour/b2b/components/libraryExperiment/model/LibraryCollectionItem;", "Ljava/io/Serializable;", "()V", "id", "", "itemType", "assets", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "parentItem", "fillerPosition", "", "strings", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "chips", Constants.DAYMODEL_POSITION, "isFree", "", "dynamicVariant", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;IZLjava/lang/String;)V", "getAssets", "()Ljava/util/HashMap;", "setAssets", "(Ljava/util/HashMap;)V", "getChips", "()Ljava/util/ArrayList;", "setChips", "(Ljava/util/ArrayList;)V", "getDynamicVariant", "()Ljava/lang/String;", "setDynamicVariant", "(Ljava/lang/String;)V", "getFillerPosition", "()Ljava/lang/Integer;", "setFillerPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getId", "setId", "()Z", "setFree", "(Z)V", "getItemType", "setItemType", "getParentItem", "setParentItem", "getPosition", "()I", "setPosition", "(I)V", "getStrings", "setStrings", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;IZLjava/lang/String;)Lcom/theinnerhour/b2b/components/libraryExperiment/model/LibraryCollectionItem;", "equals", "other", "", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class LibraryCollectionItem implements Serializable {
    private HashMap<String, String> assets;
    private ArrayList<String> chips;
    private String dynamicVariant;
    private Integer fillerPosition;

    /* renamed from: id  reason: collision with root package name */
    private String f11297id;
    private boolean isFree;
    private String itemType;
    private String parentItem;
    private int position;
    private ArrayList<String> strings;

    public LibraryCollectionItem(String id2, String itemType, HashMap<String, String> assets, String str, Integer num, ArrayList<String> strings, ArrayList<String> chips, int i6, boolean z10, String str2) {
        i.g(id2, "id");
        i.g(itemType, "itemType");
        i.g(assets, "assets");
        i.g(strings, "strings");
        i.g(chips, "chips");
        this.f11297id = id2;
        this.itemType = itemType;
        this.assets = assets;
        this.parentItem = str;
        this.fillerPosition = num;
        this.strings = strings;
        this.chips = chips;
        this.position = i6;
        this.isFree = z10;
        this.dynamicVariant = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LibraryCollectionItem copy$default(LibraryCollectionItem libraryCollectionItem, String str, String str2, HashMap hashMap, String str3, Integer num, ArrayList arrayList, ArrayList arrayList2, int i6, boolean z10, String str4, int i10, Object obj) {
        String str5;
        String str6;
        HashMap<String, String> hashMap2;
        String str7;
        Integer num2;
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        int i11;
        boolean z11;
        String str8;
        if ((i10 & 1) != 0) {
            str5 = libraryCollectionItem.f11297id;
        } else {
            str5 = str;
        }
        if ((i10 & 2) != 0) {
            str6 = libraryCollectionItem.itemType;
        } else {
            str6 = str2;
        }
        if ((i10 & 4) != 0) {
            hashMap2 = libraryCollectionItem.assets;
        } else {
            hashMap2 = hashMap;
        }
        if ((i10 & 8) != 0) {
            str7 = libraryCollectionItem.parentItem;
        } else {
            str7 = str3;
        }
        if ((i10 & 16) != 0) {
            num2 = libraryCollectionItem.fillerPosition;
        } else {
            num2 = num;
        }
        if ((i10 & 32) != 0) {
            arrayList3 = libraryCollectionItem.strings;
        } else {
            arrayList3 = arrayList;
        }
        if ((i10 & 64) != 0) {
            arrayList4 = libraryCollectionItem.chips;
        } else {
            arrayList4 = arrayList2;
        }
        if ((i10 & 128) != 0) {
            i11 = libraryCollectionItem.position;
        } else {
            i11 = i6;
        }
        if ((i10 & 256) != 0) {
            z11 = libraryCollectionItem.isFree;
        } else {
            z11 = z10;
        }
        if ((i10 & 512) != 0) {
            str8 = libraryCollectionItem.dynamicVariant;
        } else {
            str8 = str4;
        }
        return libraryCollectionItem.copy(str5, str6, hashMap2, str7, num2, arrayList3, arrayList4, i11, z11, str8);
    }

    public final String component1() {
        return this.f11297id;
    }

    public final String component10() {
        return this.dynamicVariant;
    }

    public final String component2() {
        return this.itemType;
    }

    public final HashMap<String, String> component3() {
        return this.assets;
    }

    public final String component4() {
        return this.parentItem;
    }

    public final Integer component5() {
        return this.fillerPosition;
    }

    public final ArrayList<String> component6() {
        return this.strings;
    }

    public final ArrayList<String> component7() {
        return this.chips;
    }

    public final int component8() {
        return this.position;
    }

    public final boolean component9() {
        return this.isFree;
    }

    public final LibraryCollectionItem copy(String id2, String itemType, HashMap<String, String> assets, String str, Integer num, ArrayList<String> strings, ArrayList<String> chips, int i6, boolean z10, String str2) {
        i.g(id2, "id");
        i.g(itemType, "itemType");
        i.g(assets, "assets");
        i.g(strings, "strings");
        i.g(chips, "chips");
        return new LibraryCollectionItem(id2, itemType, assets, str, num, strings, chips, i6, z10, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryCollectionItem)) {
            return false;
        }
        LibraryCollectionItem libraryCollectionItem = (LibraryCollectionItem) obj;
        if (i.b(this.f11297id, libraryCollectionItem.f11297id) && i.b(this.itemType, libraryCollectionItem.itemType) && i.b(this.assets, libraryCollectionItem.assets) && i.b(this.parentItem, libraryCollectionItem.parentItem) && i.b(this.fillerPosition, libraryCollectionItem.fillerPosition) && i.b(this.strings, libraryCollectionItem.strings) && i.b(this.chips, libraryCollectionItem.chips) && this.position == libraryCollectionItem.position && this.isFree == libraryCollectionItem.isFree && i.b(this.dynamicVariant, libraryCollectionItem.dynamicVariant)) {
            return true;
        }
        return false;
    }

    public final HashMap<String, String> getAssets() {
        return this.assets;
    }

    public final ArrayList<String> getChips() {
        return this.chips;
    }

    public final String getDynamicVariant() {
        return this.dynamicVariant;
    }

    public final Integer getFillerPosition() {
        return this.fillerPosition;
    }

    public final String getId() {
        return this.f11297id;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final String getParentItem() {
        return this.parentItem;
    }

    public final int getPosition() {
        return this.position;
    }

    public final ArrayList<String> getStrings() {
        return this.strings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.assets.hashCode() + a.c(this.itemType, this.f11297id.hashCode() * 31, 31)) * 31;
        String str = this.parentItem;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode3 + hashCode) * 31;
        Integer num = this.fillerPosition;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int j10 = (c.j(this.chips, c.j(this.strings, (i10 + hashCode2) * 31, 31), 31) + this.position) * 31;
        boolean z10 = this.isFree;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (j10 + i11) * 31;
        String str2 = this.dynamicVariant;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return i12 + i6;
    }

    @p("isFree")
    public final boolean isFree() {
        return this.isFree;
    }

    public final void setAssets(HashMap<String, String> hashMap) {
        i.g(hashMap, "<set-?>");
        this.assets = hashMap;
    }

    public final void setChips(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.chips = arrayList;
    }

    public final void setDynamicVariant(String str) {
        this.dynamicVariant = str;
    }

    public final void setFillerPosition(Integer num) {
        this.fillerPosition = num;
    }

    @p("isFree")
    public final void setFree(boolean z10) {
        this.isFree = z10;
    }

    public final void setId(String str) {
        i.g(str, "<set-?>");
        this.f11297id = str;
    }

    public final void setItemType(String str) {
        i.g(str, "<set-?>");
        this.itemType = str;
    }

    public final void setParentItem(String str) {
        this.parentItem = str;
    }

    public final void setPosition(int i6) {
        this.position = i6;
    }

    public final void setStrings(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.strings = arrayList;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryCollectionItem(id=");
        sb2.append(this.f11297id);
        sb2.append(", itemType=");
        sb2.append(this.itemType);
        sb2.append(", assets=");
        sb2.append(this.assets);
        sb2.append(", parentItem=");
        sb2.append(this.parentItem);
        sb2.append(", fillerPosition=");
        sb2.append(this.fillerPosition);
        sb2.append(", strings=");
        sb2.append(this.strings);
        sb2.append(", chips=");
        sb2.append(this.chips);
        sb2.append(", position=");
        sb2.append(this.position);
        sb2.append(", isFree=");
        sb2.append(this.isFree);
        sb2.append(", dynamicVariant=");
        return g.c(sb2, this.dynamicVariant, ')');
    }

    public LibraryCollectionItem() {
        this("", "", new HashMap(), "", 0, new ArrayList(), new ArrayList(), 0, false, null);
    }
}
