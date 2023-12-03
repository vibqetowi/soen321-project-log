package oi;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import hh.g;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import pi.h;
/* compiled from: InAppWebViewClient.kt */
/* loaded from: classes.dex */
public final class c extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final String f27580a;

    /* renamed from: b  reason: collision with root package name */
    public final String f27581b;

    /* compiled from: InAppWebViewClient.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27583v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f27584w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f27585x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i6, String str2) {
            super(0);
            this.f27583v = str;
            this.f27584w = i6;
            this.f27585x = str2;
        }

        @Override // ss.a
        public final String invoke() {
            return c.this.f27580a + " onReceivedError() : description : " + this.f27583v + ", errorCode: " + this.f27584w + " , failingUrl: " + this.f27585x;
        }
    }

    /* compiled from: InAppWebViewClient.kt */
    /* loaded from: classes.dex */
    public static final class b extends k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ WebResourceError f27587v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ WebResourceRequest f27588w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WebResourceError webResourceError, WebResourceRequest webResourceRequest) {
            super(0);
            this.f27587v = webResourceError;
            this.f27588w = webResourceRequest;
        }

        @Override // ss.a
        public final String invoke() {
            CharSequence description;
            int errorCode;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c.this.f27580a);
            sb2.append(" onReceivedError() : description : ");
            WebResourceError webResourceError = this.f27587v;
            description = webResourceError.getDescription();
            sb2.append((Object) description);
            sb2.append(", errorCode: ");
            errorCode = webResourceError.getErrorCode();
            sb2.append(errorCode);
            sb2.append(" , failingUrl: ");
            sb2.append(this.f27588w.getUrl());
            return sb2.toString();
        }
    }

    public c(h htmlCampaignPayload) {
        i.g(htmlCampaignPayload, "htmlCampaignPayload");
        this.f27580a = "InApp_6.5.0_InAppWebViewClient";
        this.f27581b = "javascript:";
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url) {
        i.g(view, "view");
        i.g(url, "url");
        view.loadUrl(i.n("var moengage = {\n    trackEvent: \n    function(eventName, generalAttrJson, locationAttrJson, dateAttrJson, isNonInteractive, shouldAttachCampaignMeta) {\n        moengageInternal.trackEvent(eventName, JSON.stringify(generalAttrJson), JSON.stringify(locationAttrJson), JSON.stringify(dateAttrJson), isNonInteractive, shouldAttachCampaignMeta);\n    },\n    trackClick: function(widgetId) { \n         var payload = {\"widgetId\": widgetId };\n        moengageInternal.trackClick(JSON.stringify(payload)); \n    },\n    trackDismiss: function() { moengageInternal.trackDismiss(); },\n    setAlias: function(alias) { moengageInternal.setAlias(alias); },\n    setUniqueId: function(uniqueId) { moengageInternal.setUniqueId(uniqueId); },\n    setUserName: function(userName) { moengageInternal.setUserName(userName); },\n    setFirstName: function(firstName) { moengageInternal.setFirstName(firstName); },\n    setLastName: function(lastName) { moengageInternal.setLastName(lastName); },\n    setEmailId: function(emailId) { moengageInternal.setEmailId(emailId); },\n    setMobileNumber: function(mobileNumber) { moengageInternal.setMobileNumber(mobileNumber); },\n    setGender: function(gender) { moengageInternal.setGender(gender); },\n    setBirthDate: function(isoDate) { moengageInternal.setBirthDate(isoDate); },\n    setUserLocation: function(latitude, longitude) {\n        var payload = {\"latitude\": latitude, \"longitude\": longitude};\n        moengageInternal.setUserLocation(JSON.stringify(payload)); \n    },\n    trackRating: function(rating) { \n        var payload = {\"rating\": rating };\n        moengageInternal.trackRating(JSON.stringify(payload)); \n    },\n    setUserAttribute: function(name, value) {\n        var attrJson = { \"name\" : name, \"value\": value };\n        moengageInternal.setUserAttribute(JSON.stringify(attrJson)); \n    },\n    setUserAttributeDate: function(name, isoDate) { moengageInternal.setUserAttributeDate(name, isoDate); },\n    setUserAttributeLocation: function(name, latitude, longitude) {\n         var payload = { \"name\" : name, \"latitude\": latitude, \"longitude\": longitude};\n        moengageInternal.setUserAttributeLocation(JSON.stringify(payload)); \n    },\n    navigateToScreen: function(screenName, dataJson) { moengageInternal.navigateToScreen(screenName, JSON.stringify(dataJson)); },\n    openDeepLink: function(deepLinkUrl, dataJson) { moengageInternal.openDeepLink(deepLinkUrl, JSON.stringify(dataJson)); },\n    openRichLanding: function(url, dataJson) { moengageInternal.openRichLanding(url, JSON.stringify(dataJson)); },\n    openWebURL: function(webUrl, dataJson) { moengageInternal.openWebURL(webUrl, JSON.stringify(dataJson)); },\n    dismissMessage: function() { moengageInternal.dismissMessage(); },\n    copyText: function(textToCopy, message) { moengageInternal.copyText(textToCopy, message); },\n    call: function(mobileNumber) { moengageInternal.call(mobileNumber); },\n    sms: function(mobileNumber, message) { moengageInternal.sms(mobileNumber, message); },\n    share: function(shareContent) { moengageInternal.share(shareContent); },\n    customAction: function(dataJson) { moengageInternal.customAction(JSON.stringify(dataJson)); },\n    handleNotificationPopUp: function() { console.log(\"MoEngage: handleNotificationPopUp() : notsupported on Android\"); },\n    navigateToSettings: function() { console.log(\"MoEngage: handleNotificationPopUp() : notsupported on Android\"); },\n    requestNotificationPermission: function() { moengageInternal.requestNotificationPermission(); },\n    navigateToNotificationSettings: function() { \n        moengageInternal.navigateToNotificationSettings();\n     },\n}", this.f27581b));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i6, String description, String failingUrl) {
        i.g(view, "view");
        i.g(description, "description");
        i.g(failingUrl, "failingUrl");
        hh.a aVar = g.f17610d;
        g.a.b(1, new a(description, i6, failingUrl), 2);
        super.onReceivedError(view, i6, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        i.g(view, "view");
        i.g(request, "request");
        i.g(error, "error");
        hh.a aVar = g.f17610d;
        g.a.b(1, new b(error, request), 2);
        super.onReceivedError(view, request, error);
    }
}
