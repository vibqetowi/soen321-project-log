package com.theinnerhour.b2b.components.monetization.models;

import com.appsflyer.R;
import fe.p;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: CampaignModel.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fRF\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0010j\b\u0012\u0004\u0012\u00020\u0004`\u00112\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0010j\b\u0012\u0004\u0012\u00020\u0004`\u00118G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00048G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bRN\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u00112\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u00118G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016R&\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0010j\b\u0012\u0004\u0012\u00020\u0004`\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bRN\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u00112\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u00118G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R&\u0010.\u001a\u00020-2\u0006\u0010\t\u001a\u00020-8G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102RN\u00103\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u00112\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u00118G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010\u0016R\u001a\u00106\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\r\"\u0004\b8\u0010\u000fRF\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0010j\b\u0012\u0004\u0012\u00020\u0004`\u00112\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0010j\b\u0012\u0004\u0012\u00020\u0004`\u00118G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0014\"\u0004\b;\u0010\u0016R&\u0010<\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010!\"\u0004\b>\u0010#R&\u0010?\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00048G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001a\u0010B\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bRF\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0010j\b\u0012\u0004\u0012\u00020\u0004`\u00112\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0010j\b\u0012\u0004\u0012\u00020\u0004`\u00118G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0014\"\u0004\bG\u0010\u0016¨\u0006H"}, d2 = {"Lcom/theinnerhour/b2b/components/monetization/models/CampaignModel;", "Ljava/io/Serializable;", "()V", "_id", "", "get_id", "()Ljava/lang/String;", "set_id", "(Ljava/lang/String;)V", "<set-?>", "", "androidCampaign", "getAndroidCampaign", "()Z", "setAndroidCampaign", "(Z)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "assetsUsed", "getAssetsUsed", "()Ljava/util/ArrayList;", "setAssetsUsed", "(Ljava/util/ArrayList;)V", "campaignType", "getCampaignType", "setCampaignType", "Lcom/theinnerhour/b2b/components/monetization/models/CampaignElementModel;", "dashboardCard", "getDashboardCard", "setDashboardCard", "", "endDate", "getEndDate", "()J", "setEndDate", "(J)V", "geographies", "getGeographies", "setGeographies", "language", "getLanguage", "setLanguage", "mainSellingScreen", "getMainSellingScreen", "setMainSellingScreen", "", "minAppVersion", "getMinAppVersion", "()I", "setMinAppVersion", "(I)V", "miniSellingScreen", "getMiniSellingScreen", "setMiniSellingScreen", "published", "getPublished", "setPublished", "skuListAndroid", "getSkuListAndroid", "setSkuListAndroid", "startDate", "getStartDate", "setStartDate", "templateColor", "getTemplateColor", "setTemplateColor", "title", "getTitle", "setTitle", "userVersion", "getUserVersion", "setUserVersion", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class CampaignModel implements Serializable {
    private long endDate;
    private int minAppVersion;
    private long startDate;
    private String _id = "";
    private boolean androidCampaign = true;
    private String language = "en";
    private ArrayList<String> assetsUsed = new ArrayList<>();
    private boolean published = true;
    private String templateColor = "";
    private String title = "";
    private ArrayList<String> skuListAndroid = new ArrayList<>();
    private ArrayList<CampaignElementModel> dashboardCard = new ArrayList<>();
    private ArrayList<CampaignElementModel> mainSellingScreen = new ArrayList<>();
    private ArrayList<CampaignElementModel> miniSellingScreen = new ArrayList<>();
    private String campaignType = "";
    private ArrayList<String> geographies = new ArrayList<>();
    private ArrayList<String> userVersion = new ArrayList<>();

    @p("android_campaign")
    public final boolean getAndroidCampaign() {
        return this.androidCampaign;
    }

    @p("assets_used")
    public final ArrayList<String> getAssetsUsed() {
        return this.assetsUsed;
    }

    @p("campaign_type")
    public final String getCampaignType() {
        return this.campaignType;
    }

    @p("dashboard_card")
    public final ArrayList<CampaignElementModel> getDashboardCard() {
        return this.dashboardCard;
    }

    @p("end_date")
    public final long getEndDate() {
        return this.endDate;
    }

    public final ArrayList<String> getGeographies() {
        return this.geographies;
    }

    public final String getLanguage() {
        return this.language;
    }

    @p("main_selling_screen")
    public final ArrayList<CampaignElementModel> getMainSellingScreen() {
        return this.mainSellingScreen;
    }

    @p("min_app_version_android")
    public final int getMinAppVersion() {
        return this.minAppVersion;
    }

    @p("mini_selling_screen")
    public final ArrayList<CampaignElementModel> getMiniSellingScreen() {
        return this.miniSellingScreen;
    }

    public final boolean getPublished() {
        return this.published;
    }

    @p("sku_list_android")
    public final ArrayList<String> getSkuListAndroid() {
        return this.skuListAndroid;
    }

    @p("start_date")
    public final long getStartDate() {
        return this.startDate;
    }

    @p("template_color")
    public final String getTemplateColor() {
        return this.templateColor;
    }

    public final String getTitle() {
        return this.title;
    }

    @p("user_version")
    public final ArrayList<String> getUserVersion() {
        return this.userVersion;
    }

    public final String get_id() {
        return this._id;
    }

    @p("android_campaign")
    public final void setAndroidCampaign(boolean z10) {
        this.androidCampaign = z10;
    }

    @p("assets_used")
    public final void setAssetsUsed(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.assetsUsed = arrayList;
    }

    @p("campaign_type")
    public final void setCampaignType(String str) {
        i.g(str, "<set-?>");
        this.campaignType = str;
    }

    @p("dashboard_card")
    public final void setDashboardCard(ArrayList<CampaignElementModel> arrayList) {
        this.dashboardCard = arrayList;
    }

    @p("end_date")
    public final void setEndDate(long j10) {
        this.endDate = j10;
    }

    public final void setGeographies(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.geographies = arrayList;
    }

    public final void setLanguage(String str) {
        i.g(str, "<set-?>");
        this.language = str;
    }

    @p("main_selling_screen")
    public final void setMainSellingScreen(ArrayList<CampaignElementModel> arrayList) {
        this.mainSellingScreen = arrayList;
    }

    @p("min_app_version_android")
    public final void setMinAppVersion(int i6) {
        this.minAppVersion = i6;
    }

    @p("mini_selling_screen")
    public final void setMiniSellingScreen(ArrayList<CampaignElementModel> arrayList) {
        this.miniSellingScreen = arrayList;
    }

    public final void setPublished(boolean z10) {
        this.published = z10;
    }

    @p("sku_list_android")
    public final void setSkuListAndroid(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.skuListAndroid = arrayList;
    }

    @p("start_date")
    public final void setStartDate(long j10) {
        this.startDate = j10;
    }

    @p("template_color")
    public final void setTemplateColor(String str) {
        i.g(str, "<set-?>");
        this.templateColor = str;
    }

    public final void setTitle(String str) {
        i.g(str, "<set-?>");
        this.title = str;
    }

    @p("user_version")
    public final void setUserVersion(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.userVersion = arrayList;
    }

    public final void set_id(String str) {
        i.g(str, "<set-?>");
        this._id = str;
    }
}
