package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: MiniCourseInfoMeta.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R*\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\b\"\u0004\b!\u0010\nR*\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\b\"\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/theinnerhour/b2b/model/MiniCourseInfoMeta;", "Ljava/io/Serializable;", "()V", "assets", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getAssets", "()Ljava/util/ArrayList;", "setAssets", "(Ljava/util/ArrayList;)V", "domains", "getDomains", "setDomains", "inDomainPos", "", "getInDomainPos", "()I", "setInDomainPos", "(I)V", SessionManager.KEY_NAME, "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", Constants.DAYMODEL_POSITION, "getPosition", "setPosition", "slug", "getSlug", "setSlug", "userVersions", "getUserVersions", "setUserVersions", "welcomeStrings", "getWelcomeStrings", "setWelcomeStrings", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class MiniCourseInfoMeta implements Serializable {
    private int inDomainPos;
    private int position;
    private ArrayList<String> domains = new ArrayList<>();
    private String name = "";
    private String slug = "";
    private ArrayList<String> welcomeStrings = new ArrayList<>();
    private ArrayList<String> assets = new ArrayList<>();
    private ArrayList<String> userVersions = new ArrayList<>();

    public final ArrayList<String> getAssets() {
        return this.assets;
    }

    public final ArrayList<String> getDomains() {
        return this.domains;
    }

    public final int getInDomainPos() {
        return this.inDomainPos;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPosition() {
        return this.position;
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

    public final void setAssets(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.assets = arrayList;
    }

    public final void setDomains(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.domains = arrayList;
    }

    public final void setInDomainPos(int i6) {
        this.inDomainPos = i6;
    }

    public final void setName(String str) {
        i.g(str, "<set-?>");
        this.name = str;
    }

    public final void setPosition(int i6) {
        this.position = i6;
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
}
