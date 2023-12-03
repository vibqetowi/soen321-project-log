package hr;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenNPSFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/y;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class y extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19399w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19401v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19400u = LogHelper.INSTANCE.makeLogTag(y.class);

    @Override // rr.b
    public final boolean I() {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        ((TemplateActivity) activity).o0();
        return false;
    }

    public final void J() {
        kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
        vVar.f23467u = -1;
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) _$_findCachedViewById(R.id.sbNPSSelector);
        if (appCompatSeekBar != null) {
            appCompatSeekBar.setThumbTintList(ColorStateList.valueOf(g0.a.b(requireActivity(), R.color.transparent)));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivNPSRatingImage);
        if (appCompatImageView != null) {
            appCompatImageView.setImageTintList(ColorStateList.valueOf(g0.a.b(requireActivity(), R.color.login_grey_background)));
        }
        AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar) _$_findCachedViewById(R.id.sbNPSSelector);
        if (appCompatSeekBar2 != null) {
            appCompatSeekBar2.setOnSeekBarChangeListener(new a(vVar));
        }
        RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.rbNPSSubmit1);
        if (robertoButton != null) {
            robertoButton.setOnClickListener(new sq.p(vVar, 2, this));
        }
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvNPSSeekLevel0);
        if (robertoTextView != null) {
            robertoTextView.setOnClickListener(new View.OnClickListener(this) { // from class: hr.x

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ y f19367v;

                {
                    this.f19367v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    y this$0 = this.f19367v;
                    switch (i6) {
                        case 0:
                            int i10 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar3 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar3 != null) {
                                appCompatSeekBar3.setProgress(9);
                                return;
                            }
                            return;
                        case 1:
                            int i11 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar4 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar4 != null) {
                                appCompatSeekBar4.setProgress(10);
                                return;
                            }
                            return;
                        case 2:
                            int i12 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar5 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar5 != null) {
                                appCompatSeekBar5.setProgress(0);
                                return;
                            }
                            return;
                        case 3:
                            int i13 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar6 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar6 != null) {
                                appCompatSeekBar6.setProgress(1);
                                return;
                            }
                            return;
                        case 4:
                            int i14 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar7 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar7 != null) {
                                appCompatSeekBar7.setProgress(2);
                                return;
                            }
                            return;
                        case 5:
                            int i15 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar8 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar8 != null) {
                                appCompatSeekBar8.setProgress(3);
                                return;
                            }
                            return;
                        case 6:
                            int i16 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar9 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar9 != null) {
                                appCompatSeekBar9.setProgress(4);
                                return;
                            }
                            return;
                        case 7:
                            int i17 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar10 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar10 != null) {
                                appCompatSeekBar10.setProgress(5);
                                return;
                            }
                            return;
                        case 8:
                            int i18 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar11 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar11 != null) {
                                appCompatSeekBar11.setProgress(6);
                                return;
                            }
                            return;
                        case 9:
                            int i19 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar12 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar12 != null) {
                                appCompatSeekBar12.setProgress(7);
                                return;
                            }
                            return;
                        default:
                            int i20 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar13 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar13 != null) {
                                appCompatSeekBar13.setProgress(8);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvNPSSeekLevel1);
        if (robertoTextView2 != null) {
            robertoTextView2.setOnClickListener(new View.OnClickListener(this) { // from class: hr.x

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ y f19367v;

                {
                    this.f19367v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    y this$0 = this.f19367v;
                    switch (i6) {
                        case 0:
                            int i10 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar3 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar3 != null) {
                                appCompatSeekBar3.setProgress(9);
                                return;
                            }
                            return;
                        case 1:
                            int i11 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar4 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar4 != null) {
                                appCompatSeekBar4.setProgress(10);
                                return;
                            }
                            return;
                        case 2:
                            int i12 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar5 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar5 != null) {
                                appCompatSeekBar5.setProgress(0);
                                return;
                            }
                            return;
                        case 3:
                            int i13 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar6 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar6 != null) {
                                appCompatSeekBar6.setProgress(1);
                                return;
                            }
                            return;
                        case 4:
                            int i14 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar7 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar7 != null) {
                                appCompatSeekBar7.setProgress(2);
                                return;
                            }
                            return;
                        case 5:
                            int i15 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar8 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar8 != null) {
                                appCompatSeekBar8.setProgress(3);
                                return;
                            }
                            return;
                        case 6:
                            int i16 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar9 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar9 != null) {
                                appCompatSeekBar9.setProgress(4);
                                return;
                            }
                            return;
                        case 7:
                            int i17 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar10 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar10 != null) {
                                appCompatSeekBar10.setProgress(5);
                                return;
                            }
                            return;
                        case 8:
                            int i18 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar11 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar11 != null) {
                                appCompatSeekBar11.setProgress(6);
                                return;
                            }
                            return;
                        case 9:
                            int i19 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar12 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar12 != null) {
                                appCompatSeekBar12.setProgress(7);
                                return;
                            }
                            return;
                        default:
                            int i20 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar13 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar13 != null) {
                                appCompatSeekBar13.setProgress(8);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvNPSSeekLevel2);
        if (robertoTextView3 != null) {
            robertoTextView3.setOnClickListener(new View.OnClickListener(this) { // from class: hr.x

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ y f19367v;

                {
                    this.f19367v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    y this$0 = this.f19367v;
                    switch (i6) {
                        case 0:
                            int i10 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar3 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar3 != null) {
                                appCompatSeekBar3.setProgress(9);
                                return;
                            }
                            return;
                        case 1:
                            int i11 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar4 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar4 != null) {
                                appCompatSeekBar4.setProgress(10);
                                return;
                            }
                            return;
                        case 2:
                            int i12 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar5 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar5 != null) {
                                appCompatSeekBar5.setProgress(0);
                                return;
                            }
                            return;
                        case 3:
                            int i13 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar6 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar6 != null) {
                                appCompatSeekBar6.setProgress(1);
                                return;
                            }
                            return;
                        case 4:
                            int i14 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar7 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar7 != null) {
                                appCompatSeekBar7.setProgress(2);
                                return;
                            }
                            return;
                        case 5:
                            int i15 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar8 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar8 != null) {
                                appCompatSeekBar8.setProgress(3);
                                return;
                            }
                            return;
                        case 6:
                            int i16 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar9 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar9 != null) {
                                appCompatSeekBar9.setProgress(4);
                                return;
                            }
                            return;
                        case 7:
                            int i17 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar10 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar10 != null) {
                                appCompatSeekBar10.setProgress(5);
                                return;
                            }
                            return;
                        case 8:
                            int i18 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar11 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar11 != null) {
                                appCompatSeekBar11.setProgress(6);
                                return;
                            }
                            return;
                        case 9:
                            int i19 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar12 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar12 != null) {
                                appCompatSeekBar12.setProgress(7);
                                return;
                            }
                            return;
                        default:
                            int i20 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar13 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar13 != null) {
                                appCompatSeekBar13.setProgress(8);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvNPSSeekLevel3);
        if (robertoTextView4 != null) {
            robertoTextView4.setOnClickListener(new View.OnClickListener(this) { // from class: hr.x

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ y f19367v;

                {
                    this.f19367v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    y this$0 = this.f19367v;
                    switch (i6) {
                        case 0:
                            int i10 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar3 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar3 != null) {
                                appCompatSeekBar3.setProgress(9);
                                return;
                            }
                            return;
                        case 1:
                            int i11 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar4 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar4 != null) {
                                appCompatSeekBar4.setProgress(10);
                                return;
                            }
                            return;
                        case 2:
                            int i12 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar5 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar5 != null) {
                                appCompatSeekBar5.setProgress(0);
                                return;
                            }
                            return;
                        case 3:
                            int i13 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar6 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar6 != null) {
                                appCompatSeekBar6.setProgress(1);
                                return;
                            }
                            return;
                        case 4:
                            int i14 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar7 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar7 != null) {
                                appCompatSeekBar7.setProgress(2);
                                return;
                            }
                            return;
                        case 5:
                            int i15 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar8 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar8 != null) {
                                appCompatSeekBar8.setProgress(3);
                                return;
                            }
                            return;
                        case 6:
                            int i16 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar9 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar9 != null) {
                                appCompatSeekBar9.setProgress(4);
                                return;
                            }
                            return;
                        case 7:
                            int i17 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar10 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar10 != null) {
                                appCompatSeekBar10.setProgress(5);
                                return;
                            }
                            return;
                        case 8:
                            int i18 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar11 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar11 != null) {
                                appCompatSeekBar11.setProgress(6);
                                return;
                            }
                            return;
                        case 9:
                            int i19 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar12 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar12 != null) {
                                appCompatSeekBar12.setProgress(7);
                                return;
                            }
                            return;
                        default:
                            int i20 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar13 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar13 != null) {
                                appCompatSeekBar13.setProgress(8);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvNPSSeekLevel4);
        if (robertoTextView5 != null) {
            robertoTextView5.setOnClickListener(new View.OnClickListener(this) { // from class: hr.x

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ y f19367v;

                {
                    this.f19367v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    y this$0 = this.f19367v;
                    switch (i6) {
                        case 0:
                            int i10 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar3 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar3 != null) {
                                appCompatSeekBar3.setProgress(9);
                                return;
                            }
                            return;
                        case 1:
                            int i11 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar4 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar4 != null) {
                                appCompatSeekBar4.setProgress(10);
                                return;
                            }
                            return;
                        case 2:
                            int i12 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar5 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar5 != null) {
                                appCompatSeekBar5.setProgress(0);
                                return;
                            }
                            return;
                        case 3:
                            int i13 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar6 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar6 != null) {
                                appCompatSeekBar6.setProgress(1);
                                return;
                            }
                            return;
                        case 4:
                            int i14 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar7 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar7 != null) {
                                appCompatSeekBar7.setProgress(2);
                                return;
                            }
                            return;
                        case 5:
                            int i15 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar8 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar8 != null) {
                                appCompatSeekBar8.setProgress(3);
                                return;
                            }
                            return;
                        case 6:
                            int i16 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar9 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar9 != null) {
                                appCompatSeekBar9.setProgress(4);
                                return;
                            }
                            return;
                        case 7:
                            int i17 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar10 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar10 != null) {
                                appCompatSeekBar10.setProgress(5);
                                return;
                            }
                            return;
                        case 8:
                            int i18 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar11 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar11 != null) {
                                appCompatSeekBar11.setProgress(6);
                                return;
                            }
                            return;
                        case 9:
                            int i19 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar12 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar12 != null) {
                                appCompatSeekBar12.setProgress(7);
                                return;
                            }
                            return;
                        default:
                            int i20 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar13 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar13 != null) {
                                appCompatSeekBar13.setProgress(8);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        RobertoTextView robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.tvNPSSeekLevel5);
        if (robertoTextView6 != null) {
            robertoTextView6.setOnClickListener(new View.OnClickListener(this) { // from class: hr.x

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ y f19367v;

                {
                    this.f19367v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    y this$0 = this.f19367v;
                    switch (i6) {
                        case 0:
                            int i10 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar3 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar3 != null) {
                                appCompatSeekBar3.setProgress(9);
                                return;
                            }
                            return;
                        case 1:
                            int i11 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar4 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar4 != null) {
                                appCompatSeekBar4.setProgress(10);
                                return;
                            }
                            return;
                        case 2:
                            int i12 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar5 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar5 != null) {
                                appCompatSeekBar5.setProgress(0);
                                return;
                            }
                            return;
                        case 3:
                            int i13 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar6 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar6 != null) {
                                appCompatSeekBar6.setProgress(1);
                                return;
                            }
                            return;
                        case 4:
                            int i14 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar7 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar7 != null) {
                                appCompatSeekBar7.setProgress(2);
                                return;
                            }
                            return;
                        case 5:
                            int i15 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar8 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar8 != null) {
                                appCompatSeekBar8.setProgress(3);
                                return;
                            }
                            return;
                        case 6:
                            int i16 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar9 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar9 != null) {
                                appCompatSeekBar9.setProgress(4);
                                return;
                            }
                            return;
                        case 7:
                            int i17 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar10 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar10 != null) {
                                appCompatSeekBar10.setProgress(5);
                                return;
                            }
                            return;
                        case 8:
                            int i18 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar11 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar11 != null) {
                                appCompatSeekBar11.setProgress(6);
                                return;
                            }
                            return;
                        case 9:
                            int i19 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar12 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar12 != null) {
                                appCompatSeekBar12.setProgress(7);
                                return;
                            }
                            return;
                        default:
                            int i20 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar13 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar13 != null) {
                                appCompatSeekBar13.setProgress(8);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        RobertoTextView robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.tvNPSSeekLevel6);
        if (robertoTextView7 != null) {
            robertoTextView7.setOnClickListener(new View.OnClickListener(this) { // from class: hr.x

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ y f19367v;

                {
                    this.f19367v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    y this$0 = this.f19367v;
                    switch (i6) {
                        case 0:
                            int i10 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar3 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar3 != null) {
                                appCompatSeekBar3.setProgress(9);
                                return;
                            }
                            return;
                        case 1:
                            int i11 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar4 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar4 != null) {
                                appCompatSeekBar4.setProgress(10);
                                return;
                            }
                            return;
                        case 2:
                            int i12 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar5 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar5 != null) {
                                appCompatSeekBar5.setProgress(0);
                                return;
                            }
                            return;
                        case 3:
                            int i13 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar6 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar6 != null) {
                                appCompatSeekBar6.setProgress(1);
                                return;
                            }
                            return;
                        case 4:
                            int i14 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar7 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar7 != null) {
                                appCompatSeekBar7.setProgress(2);
                                return;
                            }
                            return;
                        case 5:
                            int i15 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar8 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar8 != null) {
                                appCompatSeekBar8.setProgress(3);
                                return;
                            }
                            return;
                        case 6:
                            int i16 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar9 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar9 != null) {
                                appCompatSeekBar9.setProgress(4);
                                return;
                            }
                            return;
                        case 7:
                            int i17 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar10 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar10 != null) {
                                appCompatSeekBar10.setProgress(5);
                                return;
                            }
                            return;
                        case 8:
                            int i18 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar11 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar11 != null) {
                                appCompatSeekBar11.setProgress(6);
                                return;
                            }
                            return;
                        case 9:
                            int i19 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar12 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar12 != null) {
                                appCompatSeekBar12.setProgress(7);
                                return;
                            }
                            return;
                        default:
                            int i20 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar13 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar13 != null) {
                                appCompatSeekBar13.setProgress(8);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        RobertoTextView robertoTextView8 = (RobertoTextView) _$_findCachedViewById(R.id.tvNPSSeekLevel7);
        if (robertoTextView8 != null) {
            robertoTextView8.setOnClickListener(new View.OnClickListener(this) { // from class: hr.x

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ y f19367v;

                {
                    this.f19367v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    y this$0 = this.f19367v;
                    switch (i6) {
                        case 0:
                            int i10 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar3 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar3 != null) {
                                appCompatSeekBar3.setProgress(9);
                                return;
                            }
                            return;
                        case 1:
                            int i11 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar4 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar4 != null) {
                                appCompatSeekBar4.setProgress(10);
                                return;
                            }
                            return;
                        case 2:
                            int i12 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar5 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar5 != null) {
                                appCompatSeekBar5.setProgress(0);
                                return;
                            }
                            return;
                        case 3:
                            int i13 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar6 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar6 != null) {
                                appCompatSeekBar6.setProgress(1);
                                return;
                            }
                            return;
                        case 4:
                            int i14 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar7 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar7 != null) {
                                appCompatSeekBar7.setProgress(2);
                                return;
                            }
                            return;
                        case 5:
                            int i15 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar8 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar8 != null) {
                                appCompatSeekBar8.setProgress(3);
                                return;
                            }
                            return;
                        case 6:
                            int i16 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar9 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar9 != null) {
                                appCompatSeekBar9.setProgress(4);
                                return;
                            }
                            return;
                        case 7:
                            int i17 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar10 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar10 != null) {
                                appCompatSeekBar10.setProgress(5);
                                return;
                            }
                            return;
                        case 8:
                            int i18 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar11 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar11 != null) {
                                appCompatSeekBar11.setProgress(6);
                                return;
                            }
                            return;
                        case 9:
                            int i19 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar12 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar12 != null) {
                                appCompatSeekBar12.setProgress(7);
                                return;
                            }
                            return;
                        default:
                            int i20 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar13 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar13 != null) {
                                appCompatSeekBar13.setProgress(8);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        RobertoTextView robertoTextView9 = (RobertoTextView) _$_findCachedViewById(R.id.tvNPSSeekLevel8);
        if (robertoTextView9 != null) {
            robertoTextView9.setOnClickListener(new View.OnClickListener(this) { // from class: hr.x

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ y f19367v;

                {
                    this.f19367v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    y this$0 = this.f19367v;
                    switch (i6) {
                        case 0:
                            int i10 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar3 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar3 != null) {
                                appCompatSeekBar3.setProgress(9);
                                return;
                            }
                            return;
                        case 1:
                            int i11 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar4 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar4 != null) {
                                appCompatSeekBar4.setProgress(10);
                                return;
                            }
                            return;
                        case 2:
                            int i12 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar5 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar5 != null) {
                                appCompatSeekBar5.setProgress(0);
                                return;
                            }
                            return;
                        case 3:
                            int i13 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar6 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar6 != null) {
                                appCompatSeekBar6.setProgress(1);
                                return;
                            }
                            return;
                        case 4:
                            int i14 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar7 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar7 != null) {
                                appCompatSeekBar7.setProgress(2);
                                return;
                            }
                            return;
                        case 5:
                            int i15 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar8 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar8 != null) {
                                appCompatSeekBar8.setProgress(3);
                                return;
                            }
                            return;
                        case 6:
                            int i16 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar9 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar9 != null) {
                                appCompatSeekBar9.setProgress(4);
                                return;
                            }
                            return;
                        case 7:
                            int i17 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar10 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar10 != null) {
                                appCompatSeekBar10.setProgress(5);
                                return;
                            }
                            return;
                        case 8:
                            int i18 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar11 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar11 != null) {
                                appCompatSeekBar11.setProgress(6);
                                return;
                            }
                            return;
                        case 9:
                            int i19 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar12 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar12 != null) {
                                appCompatSeekBar12.setProgress(7);
                                return;
                            }
                            return;
                        default:
                            int i20 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar13 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar13 != null) {
                                appCompatSeekBar13.setProgress(8);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        RobertoTextView robertoTextView10 = (RobertoTextView) _$_findCachedViewById(R.id.tvNPSSeekLevel9);
        if (robertoTextView10 != null) {
            robertoTextView10.setOnClickListener(new View.OnClickListener(this) { // from class: hr.x

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ y f19367v;

                {
                    this.f19367v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    y this$0 = this.f19367v;
                    switch (i6) {
                        case 0:
                            int i10 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar3 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar3 != null) {
                                appCompatSeekBar3.setProgress(9);
                                return;
                            }
                            return;
                        case 1:
                            int i11 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar4 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar4 != null) {
                                appCompatSeekBar4.setProgress(10);
                                return;
                            }
                            return;
                        case 2:
                            int i12 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar5 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar5 != null) {
                                appCompatSeekBar5.setProgress(0);
                                return;
                            }
                            return;
                        case 3:
                            int i13 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar6 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar6 != null) {
                                appCompatSeekBar6.setProgress(1);
                                return;
                            }
                            return;
                        case 4:
                            int i14 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar7 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar7 != null) {
                                appCompatSeekBar7.setProgress(2);
                                return;
                            }
                            return;
                        case 5:
                            int i15 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar8 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar8 != null) {
                                appCompatSeekBar8.setProgress(3);
                                return;
                            }
                            return;
                        case 6:
                            int i16 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar9 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar9 != null) {
                                appCompatSeekBar9.setProgress(4);
                                return;
                            }
                            return;
                        case 7:
                            int i17 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar10 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar10 != null) {
                                appCompatSeekBar10.setProgress(5);
                                return;
                            }
                            return;
                        case 8:
                            int i18 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar11 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar11 != null) {
                                appCompatSeekBar11.setProgress(6);
                                return;
                            }
                            return;
                        case 9:
                            int i19 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar12 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar12 != null) {
                                appCompatSeekBar12.setProgress(7);
                                return;
                            }
                            return;
                        default:
                            int i20 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar13 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar13 != null) {
                                appCompatSeekBar13.setProgress(8);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        RobertoTextView robertoTextView11 = (RobertoTextView) _$_findCachedViewById(R.id.tvNPSSeekLevel10);
        if (robertoTextView11 != null) {
            robertoTextView11.setOnClickListener(new View.OnClickListener(this) { // from class: hr.x

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ y f19367v;

                {
                    this.f19367v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    y this$0 = this.f19367v;
                    switch (i6) {
                        case 0:
                            int i10 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar3 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar3 != null) {
                                appCompatSeekBar3.setProgress(9);
                                return;
                            }
                            return;
                        case 1:
                            int i11 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar4 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar4 != null) {
                                appCompatSeekBar4.setProgress(10);
                                return;
                            }
                            return;
                        case 2:
                            int i12 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar5 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar5 != null) {
                                appCompatSeekBar5.setProgress(0);
                                return;
                            }
                            return;
                        case 3:
                            int i13 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar6 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar6 != null) {
                                appCompatSeekBar6.setProgress(1);
                                return;
                            }
                            return;
                        case 4:
                            int i14 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar7 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar7 != null) {
                                appCompatSeekBar7.setProgress(2);
                                return;
                            }
                            return;
                        case 5:
                            int i15 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar8 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar8 != null) {
                                appCompatSeekBar8.setProgress(3);
                                return;
                            }
                            return;
                        case 6:
                            int i16 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar9 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar9 != null) {
                                appCompatSeekBar9.setProgress(4);
                                return;
                            }
                            return;
                        case 7:
                            int i17 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar10 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar10 != null) {
                                appCompatSeekBar10.setProgress(5);
                                return;
                            }
                            return;
                        case 8:
                            int i18 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar11 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar11 != null) {
                                appCompatSeekBar11.setProgress(6);
                                return;
                            }
                            return;
                        case 9:
                            int i19 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar12 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar12 != null) {
                                appCompatSeekBar12.setProgress(7);
                                return;
                            }
                            return;
                        default:
                            int i20 = y.f19399w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AppCompatSeekBar appCompatSeekBar13 = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbNPSSelector);
                            if (appCompatSeekBar13 != null) {
                                appCompatSeekBar13.setProgress(8);
                                return;
                            }
                            return;
                    }
                }
            });
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19401v;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_screen_nps, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19401v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(UtilFunKt.paramsMapToString(((TemplateActivity) activity).A0().get("s32_title")));
            J();
            String str = gk.a.f16573a;
            Bundle bundle2 = new Bundle();
            bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            bundle2.putString("type", Constants.SCREEN_ACTIVITY);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle2, "self_care_nps_display");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19400u, "exception", e10);
        }
    }

    /* compiled from: ScreenNPSFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.v f19403b;

        public a(kotlin.jvm.internal.v vVar) {
            this.f19403b = vVar;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i6, boolean z10) {
            hs.f fVar;
            float dimensionPixelSize;
            boolean z11;
            boolean z12;
            AppCompatImageView appCompatImageView;
            y yVar = y.this;
            if (seekBar != null) {
                seekBar.setThumbTintList(ColorStateList.valueOf(g0.a.b(yVar.requireActivity(), R.color.sea)));
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) yVar._$_findCachedViewById(R.id.ivNPSRatingImage);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setImageTintList(null);
            }
            kotlin.jvm.internal.v vVar = this.f19403b;
            vVar.f23467u = i6;
            RobertoTextView robertoTextView = (RobertoTextView) yVar._$_findCachedViewById(R.id.tvNPSFooterPrompt);
            if (robertoTextView != null) {
                robertoTextView.setVisibility(8);
            }
            RobertoButton robertoButton = (RobertoButton) yVar._$_findCachedViewById(R.id.rbNPSSubmit1);
            boolean z13 = false;
            if (robertoButton != null) {
                robertoButton.setVisibility(0);
            }
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) yVar._$_findCachedViewById(R.id.ivNPSSeekSelector);
            if (appCompatImageView3 != null) {
                appCompatImageView3.setVisibility(0);
            }
            int i10 = vVar.f23467u;
            yVar.getClass();
            Integer valueOf = Integer.valueOf((int) R.dimen._4sdp);
            Integer valueOf2 = Integer.valueOf((int) R.dimen._3sdp);
            switch (i10) {
                case 0:
                    fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel0), 0);
                    break;
                case 1:
                    fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel1), 0);
                    break;
                case 2:
                    fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel2), 0);
                    break;
                case 3:
                    fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel3), Integer.valueOf((int) R.dimen._1sdp));
                    break;
                case 4:
                    fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel4), Integer.valueOf((int) R.dimen._2sdp));
                    break;
                case 5:
                    fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel5), valueOf2);
                    break;
                case 6:
                    fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel6), valueOf2);
                    break;
                case 7:
                    fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel7), valueOf);
                    break;
                case 8:
                    fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel8), valueOf);
                    break;
                case 9:
                    fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel9), Integer.valueOf((int) R.dimen._5sdp));
                    break;
                default:
                    fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel10), 0);
                    break;
            }
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.f((ConstraintLayout) yVar._$_findCachedViewById(R.id.clNPSContainer));
            Number number = (Number) fVar.f19464u;
            bVar.h(R.id.ivNPSSeekSelector, 3, number.intValue(), 3);
            bVar.h(R.id.ivNPSSeekSelector, 7, number.intValue(), 7);
            bVar.h(R.id.ivNPSSeekSelector, 6, number.intValue(), 6);
            bVar.h(R.id.ivNPSSeekSelector, 4, number.intValue(), 4);
            bVar.b((ConstraintLayout) yVar._$_findCachedViewById(R.id.clNPSContainer));
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) yVar._$_findCachedViewById(R.id.ivNPSSeekSelector);
            Number number2 = (Number) fVar.f19465v;
            if (number2.intValue() == 0) {
                dimensionPixelSize = 0.0f;
            } else {
                dimensionPixelSize = yVar.getResources().getDimensionPixelSize(number2.intValue());
            }
            appCompatImageView4.setTranslationX(dimensionPixelSize);
            if (i6 >= 0 && i6 < 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                AppCompatImageView appCompatImageView5 = (AppCompatImageView) yVar._$_findCachedViewById(R.id.ivNPSRatingImage);
                if (appCompatImageView5 != null) {
                    appCompatImageView5.setImageResource(R.drawable.ic_nps_allie_1);
                    return;
                }
                return;
            }
            if (4 <= i6 && i6 < 7) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                AppCompatImageView appCompatImageView6 = (AppCompatImageView) yVar._$_findCachedViewById(R.id.ivNPSRatingImage);
                if (appCompatImageView6 != null) {
                    appCompatImageView6.setImageResource(R.drawable.ic_nps_allie_2);
                    return;
                }
                return;
            }
            if (7 <= i6 && i6 < 10) {
                z13 = true;
            }
            if (z13) {
                AppCompatImageView appCompatImageView7 = (AppCompatImageView) yVar._$_findCachedViewById(R.id.ivNPSRatingImage);
                if (appCompatImageView7 != null) {
                    appCompatImageView7.setImageResource(R.drawable.ic_nps_allie_3);
                }
            } else if (i6 == 10 && (appCompatImageView = (AppCompatImageView) yVar._$_findCachedViewById(R.id.ivNPSRatingImage)) != null) {
                appCompatImageView.setImageResource(R.drawable.ic_nps_allie_4);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }
}
