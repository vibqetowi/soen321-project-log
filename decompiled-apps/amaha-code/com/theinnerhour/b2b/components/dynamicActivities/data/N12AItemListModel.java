package com.theinnerhour.b2b.components.dynamicActivities.data;

import com.appsflyer.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import pl.a;
/* compiled from: N12AItemListModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\rHÆ\u0003Js\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006+"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/data/N12AItemListModel;", "Ljava/io/Serializable;", "id", "", "header", "subHeader", "imageHeader", "imageLink", "descriptionHeader", "descriptionText", "characteristicHeader", "characteristicList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getCharacteristicHeader", "()Ljava/lang/String;", "getCharacteristicList", "()Ljava/util/ArrayList;", "getDescriptionHeader", "getDescriptionText", "getHeader", "getId", "getImageHeader", "getImageLink", "getSubHeader", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class N12AItemListModel implements Serializable {
    private final String characteristicHeader;
    private final ArrayList<String> characteristicList;
    private final String descriptionHeader;
    private final String descriptionText;
    private final String header;

    /* renamed from: id  reason: collision with root package name */
    private final String f10910id;
    private final String imageHeader;
    private final String imageLink;
    private final String subHeader;

    public N12AItemListModel(String id2, String header, String subHeader, String imageHeader, String imageLink, String descriptionHeader, String descriptionText, String characteristicHeader, ArrayList<String> characteristicList) {
        i.g(id2, "id");
        i.g(header, "header");
        i.g(subHeader, "subHeader");
        i.g(imageHeader, "imageHeader");
        i.g(imageLink, "imageLink");
        i.g(descriptionHeader, "descriptionHeader");
        i.g(descriptionText, "descriptionText");
        i.g(characteristicHeader, "characteristicHeader");
        i.g(characteristicList, "characteristicList");
        this.f10910id = id2;
        this.header = header;
        this.subHeader = subHeader;
        this.imageHeader = imageHeader;
        this.imageLink = imageLink;
        this.descriptionHeader = descriptionHeader;
        this.descriptionText = descriptionText;
        this.characteristicHeader = characteristicHeader;
        this.characteristicList = characteristicList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ N12AItemListModel copy$default(N12AItemListModel n12AItemListModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ArrayList arrayList, int i6, Object obj) {
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        ArrayList<String> arrayList2;
        if ((i6 & 1) != 0) {
            str9 = n12AItemListModel.f10910id;
        } else {
            str9 = str;
        }
        if ((i6 & 2) != 0) {
            str10 = n12AItemListModel.header;
        } else {
            str10 = str2;
        }
        if ((i6 & 4) != 0) {
            str11 = n12AItemListModel.subHeader;
        } else {
            str11 = str3;
        }
        if ((i6 & 8) != 0) {
            str12 = n12AItemListModel.imageHeader;
        } else {
            str12 = str4;
        }
        if ((i6 & 16) != 0) {
            str13 = n12AItemListModel.imageLink;
        } else {
            str13 = str5;
        }
        if ((i6 & 32) != 0) {
            str14 = n12AItemListModel.descriptionHeader;
        } else {
            str14 = str6;
        }
        if ((i6 & 64) != 0) {
            str15 = n12AItemListModel.descriptionText;
        } else {
            str15 = str7;
        }
        if ((i6 & 128) != 0) {
            str16 = n12AItemListModel.characteristicHeader;
        } else {
            str16 = str8;
        }
        if ((i6 & 256) != 0) {
            arrayList2 = n12AItemListModel.characteristicList;
        } else {
            arrayList2 = arrayList;
        }
        return n12AItemListModel.copy(str9, str10, str11, str12, str13, str14, str15, str16, arrayList2);
    }

    public final String component1() {
        return this.f10910id;
    }

    public final String component2() {
        return this.header;
    }

    public final String component3() {
        return this.subHeader;
    }

    public final String component4() {
        return this.imageHeader;
    }

    public final String component5() {
        return this.imageLink;
    }

    public final String component6() {
        return this.descriptionHeader;
    }

    public final String component7() {
        return this.descriptionText;
    }

    public final String component8() {
        return this.characteristicHeader;
    }

    public final ArrayList<String> component9() {
        return this.characteristicList;
    }

    public final N12AItemListModel copy(String id2, String header, String subHeader, String imageHeader, String imageLink, String descriptionHeader, String descriptionText, String characteristicHeader, ArrayList<String> characteristicList) {
        i.g(id2, "id");
        i.g(header, "header");
        i.g(subHeader, "subHeader");
        i.g(imageHeader, "imageHeader");
        i.g(imageLink, "imageLink");
        i.g(descriptionHeader, "descriptionHeader");
        i.g(descriptionText, "descriptionText");
        i.g(characteristicHeader, "characteristicHeader");
        i.g(characteristicList, "characteristicList");
        return new N12AItemListModel(id2, header, subHeader, imageHeader, imageLink, descriptionHeader, descriptionText, characteristicHeader, characteristicList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N12AItemListModel)) {
            return false;
        }
        N12AItemListModel n12AItemListModel = (N12AItemListModel) obj;
        if (i.b(this.f10910id, n12AItemListModel.f10910id) && i.b(this.header, n12AItemListModel.header) && i.b(this.subHeader, n12AItemListModel.subHeader) && i.b(this.imageHeader, n12AItemListModel.imageHeader) && i.b(this.imageLink, n12AItemListModel.imageLink) && i.b(this.descriptionHeader, n12AItemListModel.descriptionHeader) && i.b(this.descriptionText, n12AItemListModel.descriptionText) && i.b(this.characteristicHeader, n12AItemListModel.characteristicHeader) && i.b(this.characteristicList, n12AItemListModel.characteristicList)) {
            return true;
        }
        return false;
    }

    public final String getCharacteristicHeader() {
        return this.characteristicHeader;
    }

    public final ArrayList<String> getCharacteristicList() {
        return this.characteristicList;
    }

    public final String getDescriptionHeader() {
        return this.descriptionHeader;
    }

    public final String getDescriptionText() {
        return this.descriptionText;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getId() {
        return this.f10910id;
    }

    public final String getImageHeader() {
        return this.imageHeader;
    }

    public final String getImageLink() {
        return this.imageLink;
    }

    public final String getSubHeader() {
        return this.subHeader;
    }

    public int hashCode() {
        return this.characteristicList.hashCode() + a.c(this.characteristicHeader, a.c(this.descriptionText, a.c(this.descriptionHeader, a.c(this.imageLink, a.c(this.imageHeader, a.c(this.subHeader, a.c(this.header, this.f10910id.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "N12AItemListModel(id=" + this.f10910id + ", header=" + this.header + ", subHeader=" + this.subHeader + ", imageHeader=" + this.imageHeader + ", imageLink=" + this.imageLink + ", descriptionHeader=" + this.descriptionHeader + ", descriptionText=" + this.descriptionText + ", characteristicHeader=" + this.characteristicHeader + ", characteristicList=" + this.characteristicList + ')';
    }
}
