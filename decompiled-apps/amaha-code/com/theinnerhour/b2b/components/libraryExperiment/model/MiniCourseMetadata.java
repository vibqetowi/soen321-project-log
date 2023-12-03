package com.theinnerhour.b2b.components.libraryExperiment.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import fe.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import pl.a;
/* compiled from: MiniCourseMetadata.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b>\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0006\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0006\u0012 \b\u0002\u0010\u000f\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u0006\u0012(\b\u0002\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0018J\t\u0010@\u001a\u00020\u0003HÆ\u0003J!\u0010A\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u0006HÆ\u0003J)\u0010B\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010D\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010E\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010*J\u0019\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006HÆ\u0003J\u0019\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010&J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010&J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\u001d\u0010L\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0006HÆ\u0003J\u001d\u0010M\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0006HÆ\u0003J¤\u0002\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u00062\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u00062 \b\u0002\u0010\u000f\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u00062(\b\u0002\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010OJ\u0013\u0010P\u001a\u00020\u00162\b\u0010Q\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010R\u001a\u00020\tHÖ\u0001J\t\u0010S\u001a\u00020\u0003HÖ\u0001R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR2\u0010\u000f\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0007@\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b\u0015\u0010*\"\u0004\b+\u0010,R:\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b2\u0010&\"\u0004\b3\u0010(R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\"\"\u0004\b5\u0010$R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b6\u0010&\"\u0004\b7\u0010(R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b8\u0010*\"\u0004\b9\u0010,R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\"\"\u0004\b;\u0010$R.\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001a\"\u0004\b=\u0010\u001cR.\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u0010\u001c¨\u0006T"}, d2 = {"Lcom/theinnerhour/b2b/components/libraryExperiment/model/MiniCourseMetadata;", "Ljava/io/Serializable;", "id", "", "assets", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "domains", "inDomainPos", "", SessionManager.KEY_NAME, Constants.DAYMODEL_POSITION, "slug", "userVersions", "welcomeStrings", "chips", "libraryContent", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "libraryRank", "isFree", "", "published", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAssets", "()Ljava/util/ArrayList;", "setAssets", "(Ljava/util/ArrayList;)V", "getChips", "setChips", "getDomains", "setDomains", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getInDomainPos", "()Ljava/lang/Integer;", "setInDomainPos", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "setFree", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLibraryContent", "()Ljava/util/HashMap;", "setLibraryContent", "(Ljava/util/HashMap;)V", "getLibraryRank", "setLibraryRank", "getName", "setName", "getPosition", "setPosition", "getPublished", "setPublished", "getSlug", "setSlug", "getUserVersions", "setUserVersions", "getWelcomeStrings", "setWelcomeStrings", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/theinnerhour/b2b/components/libraryExperiment/model/MiniCourseMetadata;", "equals", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class MiniCourseMetadata implements Serializable {
    private ArrayList<String> assets;
    private ArrayList<String> chips;
    private ArrayList<String> domains;

    /* renamed from: id  reason: collision with root package name */
    private String f11299id;
    private Integer inDomainPos;
    private Boolean isFree;
    private HashMap<String, Object> libraryContent;
    private Integer libraryRank;
    private String name;
    private Integer position;
    private Boolean published;
    private String slug;
    private ArrayList<String> userVersions;
    private ArrayList<String> welcomeStrings;

    public MiniCourseMetadata() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final String component1() {
        return this.f11299id;
    }

    public final ArrayList<String> component10() {
        return this.chips;
    }

    public final HashMap<String, Object> component11() {
        return this.libraryContent;
    }

    public final Integer component12() {
        return this.libraryRank;
    }

    public final Boolean component13() {
        return this.isFree;
    }

    public final Boolean component14() {
        return this.published;
    }

    public final ArrayList<String> component2() {
        return this.assets;
    }

    public final ArrayList<String> component3() {
        return this.domains;
    }

    public final Integer component4() {
        return this.inDomainPos;
    }

    public final String component5() {
        return this.name;
    }

    public final Integer component6() {
        return this.position;
    }

    public final String component7() {
        return this.slug;
    }

    public final ArrayList<String> component8() {
        return this.userVersions;
    }

    public final ArrayList<String> component9() {
        return this.welcomeStrings;
    }

    public final MiniCourseMetadata copy(String id2, ArrayList<String> assets, ArrayList<String> domains, Integer num, String name, Integer num2, String slug, ArrayList<String> userVersions, ArrayList<String> welcomeStrings, ArrayList<String> arrayList, HashMap<String, Object> hashMap, Integer num3, Boolean bool, Boolean bool2) {
        i.g(id2, "id");
        i.g(assets, "assets");
        i.g(domains, "domains");
        i.g(name, "name");
        i.g(slug, "slug");
        i.g(userVersions, "userVersions");
        i.g(welcomeStrings, "welcomeStrings");
        return new MiniCourseMetadata(id2, assets, domains, num, name, num2, slug, userVersions, welcomeStrings, arrayList, hashMap, num3, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniCourseMetadata)) {
            return false;
        }
        MiniCourseMetadata miniCourseMetadata = (MiniCourseMetadata) obj;
        if (i.b(this.f11299id, miniCourseMetadata.f11299id) && i.b(this.assets, miniCourseMetadata.assets) && i.b(this.domains, miniCourseMetadata.domains) && i.b(this.inDomainPos, miniCourseMetadata.inDomainPos) && i.b(this.name, miniCourseMetadata.name) && i.b(this.position, miniCourseMetadata.position) && i.b(this.slug, miniCourseMetadata.slug) && i.b(this.userVersions, miniCourseMetadata.userVersions) && i.b(this.welcomeStrings, miniCourseMetadata.welcomeStrings) && i.b(this.chips, miniCourseMetadata.chips) && i.b(this.libraryContent, miniCourseMetadata.libraryContent) && i.b(this.libraryRank, miniCourseMetadata.libraryRank) && i.b(this.isFree, miniCourseMetadata.isFree) && i.b(this.published, miniCourseMetadata.published)) {
            return true;
        }
        return false;
    }

    public final ArrayList<String> getAssets() {
        return this.assets;
    }

    public final ArrayList<String> getChips() {
        return this.chips;
    }

    public final ArrayList<String> getDomains() {
        return this.domains;
    }

    public final String getId() {
        return this.f11299id;
    }

    public final Integer getInDomainPos() {
        return this.inDomainPos;
    }

    public final HashMap<String, Object> getLibraryContent() {
        return this.libraryContent;
    }

    public final Integer getLibraryRank() {
        return this.libraryRank;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getPosition() {
        return this.position;
    }

    public final Boolean getPublished() {
        return this.published;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final ArrayList<String> getUserVersions() {
        return this.userVersions;
    }

    public final ArrayList<String> getWelcomeStrings() {
        return this.welcomeStrings;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int j10 = c.j(this.domains, c.j(this.assets, this.f11299id.hashCode() * 31, 31), 31);
        Integer num = this.inDomainPos;
        int i6 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int c10 = a.c(this.name, (j10 + hashCode) * 31, 31);
        Integer num2 = this.position;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int j11 = c.j(this.welcomeStrings, c.j(this.userVersions, a.c(this.slug, (c10 + hashCode2) * 31, 31), 31), 31);
        ArrayList<String> arrayList = this.chips;
        if (arrayList == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = arrayList.hashCode();
        }
        int i10 = (j11 + hashCode3) * 31;
        HashMap<String, Object> hashMap = this.libraryContent;
        if (hashMap == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = hashMap.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        Integer num3 = this.libraryRank;
        if (num3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num3.hashCode();
        }
        int i12 = (i11 + hashCode5) * 31;
        Boolean bool = this.isFree;
        if (bool == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bool.hashCode();
        }
        int i13 = (i12 + hashCode6) * 31;
        Boolean bool2 = this.published;
        if (bool2 != null) {
            i6 = bool2.hashCode();
        }
        return i13 + i6;
    }

    @p("isFree")
    public final Boolean isFree() {
        return this.isFree;
    }

    public final void setAssets(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.assets = arrayList;
    }

    public final void setChips(ArrayList<String> arrayList) {
        this.chips = arrayList;
    }

    public final void setDomains(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.domains = arrayList;
    }

    @p("isFree")
    public final void setFree(Boolean bool) {
        this.isFree = bool;
    }

    public final void setId(String str) {
        i.g(str, "<set-?>");
        this.f11299id = str;
    }

    public final void setInDomainPos(Integer num) {
        this.inDomainPos = num;
    }

    public final void setLibraryContent(HashMap<String, Object> hashMap) {
        this.libraryContent = hashMap;
    }

    public final void setLibraryRank(Integer num) {
        this.libraryRank = num;
    }

    public final void setName(String str) {
        i.g(str, "<set-?>");
        this.name = str;
    }

    public final void setPosition(Integer num) {
        this.position = num;
    }

    public final void setPublished(Boolean bool) {
        this.published = bool;
    }

    public final void setSlug(String str) {
        i.g(str, "<set-?>");
        this.slug = str;
    }

    public final void setUserVersions(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.userVersions = arrayList;
    }

    public final void setWelcomeStrings(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.welcomeStrings = arrayList;
    }

    public String toString() {
        return "MiniCourseMetadata(id=" + this.f11299id + ", assets=" + this.assets + ", domains=" + this.domains + ", inDomainPos=" + this.inDomainPos + ", name=" + this.name + ", position=" + this.position + ", slug=" + this.slug + ", userVersions=" + this.userVersions + ", welcomeStrings=" + this.welcomeStrings + ", chips=" + this.chips + ", libraryContent=" + this.libraryContent + ", libraryRank=" + this.libraryRank + ", isFree=" + this.isFree + ", published=" + this.published + ')';
    }

    public MiniCourseMetadata(String id2, ArrayList<String> assets, ArrayList<String> domains, Integer num, String name, Integer num2, String slug, ArrayList<String> userVersions, ArrayList<String> welcomeStrings, ArrayList<String> arrayList, HashMap<String, Object> hashMap, Integer num3, Boolean bool, Boolean bool2) {
        i.g(id2, "id");
        i.g(assets, "assets");
        i.g(domains, "domains");
        i.g(name, "name");
        i.g(slug, "slug");
        i.g(userVersions, "userVersions");
        i.g(welcomeStrings, "welcomeStrings");
        this.f11299id = id2;
        this.assets = assets;
        this.domains = domains;
        this.inDomainPos = num;
        this.name = name;
        this.position = num2;
        this.slug = slug;
        this.userVersions = userVersions;
        this.welcomeStrings = welcomeStrings;
        this.chips = arrayList;
        this.libraryContent = hashMap;
        this.libraryRank = num3;
        this.isFree = bool;
        this.published = bool2;
    }

    public /* synthetic */ MiniCourseMetadata(String str, ArrayList arrayList, ArrayList arrayList2, Integer num, String str2, Integer num2, String str3, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, HashMap hashMap, Integer num3, Boolean bool, Boolean bool2, int i6, d dVar) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? new ArrayList() : arrayList, (i6 & 4) != 0 ? new ArrayList() : arrayList2, (i6 & 8) != 0 ? 0 : num, (i6 & 16) != 0 ? "" : str2, (i6 & 32) != 0 ? 0 : num2, (i6 & 64) == 0 ? str3 : "", (i6 & 128) != 0 ? new ArrayList() : arrayList3, (i6 & 256) != 0 ? new ArrayList() : arrayList4, (i6 & 512) != 0 ? new ArrayList() : arrayList5, (i6 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? new HashMap() : hashMap, (i6 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? 0 : num3, (i6 & 4096) != 0 ? Boolean.FALSE : bool, (i6 & 8192) != 0 ? Boolean.FALSE : bool2);
    }
}
