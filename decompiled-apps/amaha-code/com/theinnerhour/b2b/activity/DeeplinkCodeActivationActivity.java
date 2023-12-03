package com.theinnerhour.b2b.activity;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.res.ColorStateList;
import android.graphics.Color;
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
import java.util.LinkedHashMap;
import kc.f;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import qr.b;
import ss.l;
import ta.v;
import w5.i0;
/* compiled from: DeeplinkCodeActivationActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/DeeplinkCodeActivationActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DeeplinkCodeActivationActivity extends rr.a {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f10355z = 0;

    /* renamed from: w  reason: collision with root package name */
    public b f10356w;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f10358y = new LinkedHashMap();

    /* renamed from: x  reason: collision with root package name */
    public final String f10357x = LogHelper.INSTANCE.makeLogTag(DeeplinkCodeActivationActivity.class);

    /* compiled from: DeeplinkCodeActivationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<SingleUseEvent<? extends DeeplinkCodeResponse>, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends DeeplinkCodeResponse> singleUseEvent) {
            boolean z10;
            boolean z11;
            boolean z12;
            String str;
            String errorText;
            boolean z13;
            int i6;
            boolean z14;
            DeeplinkCodeResponse contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            if (contentIfNotHandled != null) {
                Bundle bundle = new Bundle();
                bundle.putString("code", contentIfNotHandled.getCode());
                Payload payload = contentIfNotHandled.getPayload();
                if (payload != null) {
                    z10 = i.b(payload.getShowInfoPage(), Boolean.TRUE);
                } else {
                    z10 = false;
                }
                String str2 = null;
                DeeplinkCodeActivationActivity deeplinkCodeActivationActivity = DeeplinkCodeActivationActivity.this;
                if (z10) {
                    bundle.putString(Constants.NOTIFICATION_URL, contentIfNotHandled.getLink());
                    Payload payload2 = contentIfNotHandled.getPayload();
                    if (payload2 != null) {
                        int i10 = DeeplinkCodeActivationActivity.f10355z;
                        int i11 = 8;
                        ((RobertoTextView) deeplinkCodeActivationActivity.u0(R.id.tvDeepLinkLoading)).setVisibility(8);
                        LoadingDots loadingDots = (LoadingDots) deeplinkCodeActivationActivity.u0(R.id.loadingIntroDots);
                        ValueAnimator valueAnimator = loadingDots.f11840v;
                        if (valueAnimator != null) {
                            valueAnimator.end();
                            loadingDots.f11840v = null;
                        }
                        ((LoadingDots) deeplinkCodeActivationActivity.u0(R.id.loadingIntroDots)).setVisibility(8);
                        ((AppCompatImageView) deeplinkCodeActivationActivity.u0(R.id.ivDeepLinkBanner)).setVisibility(0);
                        RobertoTextView robertoTextView = (RobertoTextView) deeplinkCodeActivationActivity.u0(R.id.tvDeepLinkTitle);
                        String title = payload2.getTitle();
                        if (title != null && title.length() != 0) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        if (!z13) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        robertoTextView.setVisibility(i6);
                        RobertoTextView robertoTextView2 = (RobertoTextView) deeplinkCodeActivationActivity.u0(R.id.tvDeepLinkMessageTitle);
                        String subtitle = payload2.getSubtitle();
                        if (subtitle != null && subtitle.length() != 0) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (!z14) {
                            i11 = 0;
                        }
                        robertoTextView2.setVisibility(i11);
                        ((RobertoTextView) deeplinkCodeActivationActivity.u0(R.id.tvDeepLinkMessageBody)).setVisibility(0);
                        ((RobertoButton) deeplinkCodeActivationActivity.u0(R.id.btnDeepLinkCTA)).setVisibility(0);
                        ((RobertoTextView) deeplinkCodeActivationActivity.u0(R.id.tvDeepLinkTitle)).setText(payload2.getTitle());
                        ((RobertoTextView) deeplinkCodeActivationActivity.u0(R.id.tvDeepLinkMessageTitle)).setText(payload2.getSubtitle());
                        ((RobertoTextView) deeplinkCodeActivationActivity.u0(R.id.tvDeepLinkMessageBody)).setText(payload2.getBody());
                        ((RobertoButton) deeplinkCodeActivationActivity.u0(R.id.btnDeepLinkCTA)).setText(payload2.getCta());
                        ((RobertoButton) deeplinkCodeActivationActivity.u0(R.id.btnDeepLinkCTA)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(payload2.getColor())));
                        Glide.c(deeplinkCodeActivationActivity).d(deeplinkCodeActivationActivity).p(payload2.getBannerImage()).B((AppCompatImageView) deeplinkCodeActivationActivity.u0(R.id.ivDeepLinkBanner));
                    }
                    bundle.putBoolean("success", true);
                    ApplicationPersistence.getInstance().resetSubscriptionPrefs(Boolean.TRUE);
                    ApplicationPersistence.getInstance().setStringValue(Constants.PR_COUPON_CODE, "");
                } else {
                    Payload payload3 = contentIfNotHandled.getPayload();
                    if (payload3 != null) {
                        z11 = i.b(payload3.getShowError(), Boolean.TRUE);
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        Payload payload4 = contentIfNotHandled.getPayload();
                        if (payload4 != null) {
                            z12 = i.b(payload4.getValidDeepLink(), Boolean.TRUE);
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            ApplicationPersistence.getInstance().setStringValue(Constants.PR_COUPON_CODE, "");
                        }
                        Payload payload5 = contentIfNotHandled.getPayload();
                        if (payload5 != null) {
                            str = payload5.getErrorText();
                        } else {
                            str = null;
                        }
                        Payload payload6 = contentIfNotHandled.getPayload();
                        if (payload6 != null) {
                            str2 = payload6.getCta();
                        }
                        int i12 = DeeplinkCodeActivationActivity.f10355z;
                        deeplinkCodeActivationActivity.getClass();
                        try {
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_error, deeplinkCodeActivationActivity, R.style.Theme_Dialog_Fullscreen);
                            styledDialog.setCancelable(false);
                            View findViewById = styledDialog.findViewById(R.id.errorText);
                            i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                            RobertoTextView robertoTextView3 = (RobertoTextView) findViewById;
                            if (str == null) {
                                str = deeplinkCodeActivationActivity.getString(R.string.something_went_wrong);
                            }
                            robertoTextView3.setText(str);
                            View findViewById2 = styledDialog.findViewById(R.id.okButton);
                            i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                            RobertoTextView robertoTextView4 = (RobertoTextView) findViewById2;
                            if (str2 == null) {
                                str2 = deeplinkCodeActivationActivity.getString(R.string.continue_text);
                            }
                            robertoTextView4.setText(str2);
                            View findViewById3 = styledDialog.findViewById(R.id.okButton);
                            i.e(findViewById3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                            ((RobertoTextView) findViewById3).setOnClickListener(new defpackage.a(styledDialog, 3, deeplinkCodeActivationActivity));
                            Window window = styledDialog.getWindow();
                            if (window != null) {
                                window.setLayout(-1, -2);
                            }
                            styledDialog.show();
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(deeplinkCodeActivationActivity.f10357x, e10);
                        }
                        bundle.putBoolean("success", false);
                        Payload payload7 = contentIfNotHandled.getPayload();
                        if (payload7 != null && (errorText = payload7.getErrorText()) != null) {
                            bundle.putString("errorMessage ", errorText);
                        }
                    } else {
                        bundle.putBoolean("success", false);
                        deeplinkCodeActivationActivity.finish();
                    }
                }
                gk.a.b(bundle, "deeplink_check");
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(4:2|3|(1:5)(1:34)|6)|7|(5:9|(2:11|(1:13)(1:15))|16|17|(2:19|20)(2:22|23))|24|25|26|(3:28|17|(0)(0))(2:29|30)) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0097, code lost:
        if (r1 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e(r0, r8);
        finish();
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        b bVar;
        boolean z10;
        String str = this.f10357x;
        super.onCreate(bundle);
        setContentView(R.layout.activity_coupon_code_activation);
        ((RobertoButton) u0(R.id.btnDeepLinkCTA)).setOnClickListener(new i0(8, this));
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
        String couponCode = ApplicationPersistence.getInstance().getStringValue(Constants.PR_COUPON_CODE);
        this.f10356w = (b) new o0(this).a(b.class);
        if (!b.u(SessionManager.KEY_USERTYPE, "patient")) {
            Boolean booleanValue = SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED);
            i.f(booleanValue, "getInstance()\n          …ager.KEY_B2B_IS_VERIFIED)");
            if (booleanValue.booleanValue()) {
                i.f(couponCode, "couponCode");
                if (couponCode.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            finish();
            bVar = this.f10356w;
            if (bVar == null) {
                bVar.f30102y.e(this, new dk.a(2, new a()));
                return;
            } else {
                i.q("viewModel");
                throw null;
            }
        }
        i.f(couponCode, "couponCode");
        b bVar2 = this.f10356w;
        if (bVar2 != null) {
            v.H(f.H(bVar2), null, 0, new qr.a(null, bVar2, couponCode, null), 3);
            bVar = this.f10356w;
            if (bVar == null) {
            }
        } else {
            i.q("viewModel");
            throw null;
        }
    }

    public final View u0(int i6) {
        LinkedHashMap linkedHashMap = this.f10358y;
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
