package yp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import j$.util.concurrent.ConcurrentHashMap;
/* compiled from: DialogResetCourseBinding.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f38756a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f38757b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f38758c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f38759d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f38760e;
    public final Object f;

    public /* synthetic */ d(CardView cardView, RobertoTextView robertoTextView, AppCompatImageView appCompatImageView, RobertoTextView robertoTextView2, RobertoTextView robertoTextView3, RobertoTextView robertoTextView4) {
        this.f38759d = cardView;
        this.f38757b = robertoTextView;
        this.f38756a = appCompatImageView;
        this.f38758c = robertoTextView2;
        this.f38760e = robertoTextView3;
        this.f = robertoTextView4;
    }

    public static d a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.dialog_reset_course, (ViewGroup) null, false);
        int i6 = R.id.f39931no;
        RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.f39931no, inflate);
        if (robertoTextView != null) {
            i6 = R.id.resetBanner;
            AppCompatImageView appCompatImageView = (AppCompatImageView) hc.d.w(R.id.resetBanner, inflate);
            if (appCompatImageView != null) {
                i6 = R.id.resetDialogTitle;
                RobertoTextView robertoTextView2 = (RobertoTextView) hc.d.w(R.id.resetDialogTitle, inflate);
                if (robertoTextView2 != null) {
                    i6 = R.id.resetQuestion;
                    RobertoTextView robertoTextView3 = (RobertoTextView) hc.d.w(R.id.resetQuestion, inflate);
                    if (robertoTextView3 != null) {
                        i6 = R.id.yes;
                        RobertoTextView robertoTextView4 = (RobertoTextView) hc.d.w(R.id.yes, inflate);
                        if (robertoTextView4 != null) {
                            return new d((CardView) inflate, robertoTextView, appCompatImageView, robertoTextView2, robertoTextView3, robertoTextView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }

    public /* synthetic */ d(ConstraintLayout constraintLayout, RobertoButton robertoButton, RecyclerView recyclerView, AppCompatImageView appCompatImageView, RobertoTextView robertoTextView, RobertoTextView robertoTextView2) {
        this.f38759d = constraintLayout;
        this.f38760e = robertoButton;
        this.f = recyclerView;
        this.f38756a = appCompatImageView;
        this.f38757b = robertoTextView;
        this.f38758c = robertoTextView2;
    }

    public /* synthetic */ d(gd.d dVar) {
        this.f = new ConcurrentHashMap();
        this.f38756a = new ConcurrentHashMap();
        this.f38759d = "/io/michaelrocks/libphonenumber/android/data/PhoneNumberMetadataProto";
        this.f38757b = "/io/michaelrocks/libphonenumber/android/data/PhoneNumberAlternateFormatsProto";
        this.f38758c = "/io/michaelrocks/libphonenumber/android/data/ShortNumberMetadataProto";
        this.f38760e = new ds.b(dVar);
    }
}
