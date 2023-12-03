package com.theinnerhour.b2b.activity;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.o0;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.network.model.DeeplinkCodeResponse;
import com.theinnerhour.b2b.network.model.Payload;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.LoadingDots;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hs.f;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import qr.b;
import ss.l;
import ta.v;
import w5.i0;
/* compiled from: DeepLinkActivationActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/DeepLinkActivationActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DeepLinkActivationActivity extends rr.a {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f10350z = 0;

    /* renamed from: w  reason: collision with root package name */
    public b f10351w;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f10353y = new LinkedHashMap();

    /* renamed from: x  reason: collision with root package name */
    public final String f10352x = LogHelper.INSTANCE.makeLogTag(DeepLinkActivationActivity.class);

    /* compiled from: DeepLinkActivationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<SingleUseEvent<? extends f<? extends DeeplinkCodeResponse, ? extends Uri>>, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends f<? extends DeeplinkCodeResponse, ? extends Uri>> singleUseEvent) {
            String str;
            boolean z10;
            boolean z11;
            String str2;
            String str3;
            Payload payload;
            Payload payload2;
            List<String> pathSegments;
            f<? extends DeeplinkCodeResponse, ? extends Uri> contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            if (contentIfNotHandled != null) {
                Uri uri = (Uri) contentIfNotHandled.f19465v;
                DeeplinkCodeResponse deeplinkCodeResponse = (DeeplinkCodeResponse) contentIfNotHandled.f19464u;
                Bundle bundle = new Bundle();
                String str4 = null;
                if (uri != null && (pathSegments = uri.getPathSegments()) != null) {
                    str = pathSegments.get(1);
                } else {
                    str = null;
                }
                bundle.putString("code", str);
                bundle.putString(Constants.NOTIFICATION_URL, String.valueOf(uri));
                if (deeplinkCodeResponse != null && (payload2 = deeplinkCodeResponse.getPayload()) != null) {
                    z10 = i.b(payload2.getShowInfoPage(), Boolean.TRUE);
                } else {
                    z10 = false;
                }
                DeepLinkActivationActivity deepLinkActivationActivity = DeepLinkActivationActivity.this;
                if (z10) {
                    Payload payload3 = deeplinkCodeResponse.getPayload();
                    if (payload3 != null) {
                        int i6 = DeepLinkActivationActivity.f10350z;
                        ((RobertoTextView) deepLinkActivationActivity.u0(R.id.tvDeepLinkLoading)).setVisibility(8);
                        LoadingDots loadingDots = (LoadingDots) deepLinkActivationActivity.u0(R.id.loadingIntroDots);
                        ValueAnimator valueAnimator = loadingDots.f11840v;
                        if (valueAnimator != null) {
                            valueAnimator.end();
                            loadingDots.f11840v = null;
                        }
                        ((LoadingDots) deepLinkActivationActivity.u0(R.id.loadingIntroDots)).setVisibility(8);
                        ((AppCompatImageView) deepLinkActivationActivity.u0(R.id.ivDeepLinkBanner)).setVisibility(0);
                        ((RobertoTextView) deepLinkActivationActivity.u0(R.id.tvDeepLinkTitle)).setVisibility(0);
                        ((RobertoTextView) deepLinkActivationActivity.u0(R.id.tvDeepLinkMessageTitle)).setVisibility(0);
                        ((RobertoTextView) deepLinkActivationActivity.u0(R.id.tvDeepLinkMessageBody)).setVisibility(0);
                        ((RobertoButton) deepLinkActivationActivity.u0(R.id.btnDeepLinkCTA)).setVisibility(0);
                        ((RobertoTextView) deepLinkActivationActivity.u0(R.id.tvDeepLinkTitle)).setText(payload3.getTitle());
                        ((RobertoTextView) deepLinkActivationActivity.u0(R.id.tvDeepLinkMessageTitle)).setText(payload3.getSubtitle());
                        ((RobertoTextView) deepLinkActivationActivity.u0(R.id.tvDeepLinkMessageBody)).setText(payload3.getBody());
                        ((RobertoButton) deepLinkActivationActivity.u0(R.id.btnDeepLinkCTA)).setText(payload3.getCta());
                        ((RobertoButton) deepLinkActivationActivity.u0(R.id.btnDeepLinkCTA)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(payload3.getColor())));
                        Glide.c(deepLinkActivationActivity).d(deepLinkActivationActivity).p(payload3.getBannerImage()).B((AppCompatImageView) deepLinkActivationActivity.u0(R.id.ivDeepLinkBanner));
                    }
                    bundle.putBoolean("success", true);
                    ApplicationPersistence.getInstance().resetSubscriptionPrefs(Boolean.TRUE);
                    ApplicationPersistence.getInstance().setStringValue(Constants.PR_COUPON_CODE, "");
                } else {
                    if (deeplinkCodeResponse != null && (payload = deeplinkCodeResponse.getPayload()) != null) {
                        z11 = i.b(payload.getShowError(), Boolean.TRUE);
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        Payload payload4 = deeplinkCodeResponse.getPayload();
                        if (payload4 != null) {
                            str2 = payload4.getErrorText();
                        } else {
                            str2 = null;
                        }
                        Payload payload5 = deeplinkCodeResponse.getPayload();
                        if (payload5 != null) {
                            str3 = payload5.getCta();
                        } else {
                            str3 = null;
                        }
                        int i10 = DeepLinkActivationActivity.f10350z;
                        deepLinkActivationActivity.getClass();
                        try {
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_error, deepLinkActivationActivity, R.style.Theme_Dialog_Fullscreen);
                            styledDialog.setCancelable(false);
                            View findViewById = styledDialog.findViewById(R.id.errorText);
                            i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                            RobertoTextView robertoTextView = (RobertoTextView) findViewById;
                            if (str2 == null) {
                                str2 = deepLinkActivationActivity.getString(R.string.something_went_wrong);
                            }
                            robertoTextView.setText(str2);
                            View findViewById2 = styledDialog.findViewById(R.id.okButton);
                            i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                            RobertoTextView robertoTextView2 = (RobertoTextView) findViewById2;
                            if (str3 == null) {
                                str3 = deepLinkActivationActivity.getString(R.string.continue_text);
                            }
                            robertoTextView2.setText(str3);
                            View findViewById3 = styledDialog.findViewById(R.id.okButton);
                            i.e(findViewById3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                            ((RobertoTextView) findViewById3).setOnClickListener(new defpackage.a(styledDialog, 2, deepLinkActivationActivity));
                            Window window = styledDialog.getWindow();
                            if (window != null) {
                                window.setLayout(-1, -2);
                            }
                            styledDialog.show();
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(deepLinkActivationActivity.f10352x, e10);
                        }
                        bundle.putBoolean("success", false);
                        Payload payload6 = deeplinkCodeResponse.getPayload();
                        if (payload6 != null) {
                            str4 = payload6.getErrorText();
                        }
                        bundle.putString("errorMessage ", str4);
                    } else {
                        bundle.putBoolean("success", false);
                        deepLinkActivationActivity.finish();
                    }
                }
                gk.a.b(bundle, "deeplink_check");
            }
            return hs.k.f19476a;
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str = this.f10352x;
        super.onCreate(bundle);
        setContentView(R.layout.activity_deep_link_activation);
        ((RobertoButton) u0(R.id.btnDeepLinkCTA)).setOnClickListener(new i0(7, this));
        try {
            Window window = getWindow();
            if (Build.VERSION.SDK_INT >= 23) {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
            } else {
                window.setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str, "Error in setting custom status bar", e10);
        }
        this.f10351w = (b) new o0(this).a(b.class);
        Uri uri = Uri.parse(ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_SIGNUP_LINK));
        ApplicationPersistence.getInstance().setStringValue(Constants.DYNAMIC_SIGNUP_LINK, "");
        if (!i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") && i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) {
            finish();
        } else {
            i.f(uri, "uri");
            try {
                b bVar = this.f10351w;
                if (bVar != null) {
                    String str2 = uri.getPathSegments().get(1);
                    i.f(str2, "uri.pathSegments[1]");
                    v.H(kc.f.H(bVar), null, 0, new qr.a(uri, bVar, str2, null), 3);
                } else {
                    i.q("viewModel");
                    throw null;
                }
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(str, e11);
                finish();
            }
        }
        b bVar2 = this.f10351w;
        if (bVar2 != null) {
            bVar2.f30103z.e(this, new dk.a(1, new a()));
        } else {
            i.q("viewModel");
            throw null;
        }
    }

    public final View u0(int i6) {
        LinkedHashMap linkedHashMap = this.f10353y;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }
}
