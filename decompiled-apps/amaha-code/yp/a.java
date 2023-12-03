package yp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: ActivityBotPwaBinding.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f38704a;

    /* renamed from: b  reason: collision with root package name */
    public final View f38705b;

    /* renamed from: c  reason: collision with root package name */
    public final RobertoButton f38706c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatImageView f38707d;

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f38708e;
    public final RobertoTextView f;

    /* renamed from: g  reason: collision with root package name */
    public final WebView f38709g;

    public /* synthetic */ a(ConstraintLayout constraintLayout, View view, RobertoButton robertoButton, AppCompatImageView appCompatImageView, ProgressBar progressBar, RobertoTextView robertoTextView, WebView webView, int i6) {
        this.f38704a = constraintLayout;
        this.f38705b = view;
        this.f38706c = robertoButton;
        this.f38707d = appCompatImageView;
        this.f38708e = progressBar;
        this.f = robertoTextView;
        this.f38709g = webView;
    }

    public static a b(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.activity_communities_pwa, (ViewGroup) null, false);
        int i6 = R.id.bgCommunitiesPwa;
        View w10 = hc.d.w(R.id.bgCommunitiesPwa, inflate);
        if (w10 != null) {
            i6 = R.id.btnCommunitiesPwaError;
            RobertoButton robertoButton = (RobertoButton) hc.d.w(R.id.btnCommunitiesPwaError, inflate);
            if (robertoButton != null) {
                i6 = R.id.ivCommunitiesPwaError;
                AppCompatImageView appCompatImageView = (AppCompatImageView) hc.d.w(R.id.ivCommunitiesPwaError, inflate);
                if (appCompatImageView != null) {
                    i6 = R.id.pbCommunitiesPwa;
                    ProgressBar progressBar = (ProgressBar) hc.d.w(R.id.pbCommunitiesPwa, inflate);
                    if (progressBar != null) {
                        i6 = R.id.tvCommunitiesPwaError;
                        RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.tvCommunitiesPwaError, inflate);
                        if (robertoTextView != null) {
                            i6 = R.id.wvCommunitiesPwa;
                            WebView webView = (WebView) hc.d.w(R.id.wvCommunitiesPwa, inflate);
                            if (webView != null) {
                                return new a((ConstraintLayout) inflate, w10, robertoButton, appCompatImageView, progressBar, robertoTextView, webView, 1);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }

    public final ConstraintLayout a() {
        return this.f38704a;
    }

    public a(ConstraintLayout constraintLayout, View view, RobertoButton robertoButton, AppCompatImageView appCompatImageView, RobertoTextView robertoTextView, ProgressBar progressBar, WebView webView) {
        this.f38704a = constraintLayout;
        this.f38705b = view;
        this.f38706c = robertoButton;
        this.f38707d = appCompatImageView;
        this.f = robertoTextView;
        this.f38708e = progressBar;
        this.f38709g = webView;
    }

    public a(ConstraintLayout constraintLayout, RobertoButton robertoButton, AppCompatImageView appCompatImageView, ProgressBar progressBar, View view, RobertoTextView robertoTextView, WebView webView) {
        this.f38704a = constraintLayout;
        this.f38706c = robertoButton;
        this.f38707d = appCompatImageView;
        this.f38708e = progressBar;
        this.f38705b = view;
        this.f = robertoTextView;
        this.f38709g = webView;
    }
}
