package com.theinnerhour.b2b.components.login.fragment;

import an.p;
import android.app.Dialog;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.activity.LoginSignupReworkActivity;
import com.theinnerhour.b2b.components.login.fragment.ReworkLoginFragment;
import com.theinnerhour.b2b.components.login.model.ExpandedState;
import com.theinnerhour.b2b.components.login.model.LoginSignupFlow;
import com.theinnerhour.b2b.components.login.model.ReworkLoginState;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gn.j;
import gv.n;
import hn.q;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.y;
import pl.w0;
import ss.l;
import yp.m;
/* compiled from: ReworkLoginFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/login/fragment/ReworkLoginFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReworkLoginFragment extends Fragment {
    public static final /* synthetic */ int C = 0;

    /* renamed from: w  reason: collision with root package name */
    public yp.f f11327w;

    /* renamed from: x  reason: collision with root package name */
    public yp.f f11328x;

    /* renamed from: y  reason: collision with root package name */
    public yp.g f11329y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f11330z;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f11325u = LogHelper.INSTANCE.makeLogTag("ReworkLoginFragment");

    /* renamed from: v  reason: collision with root package name */
    public final m0 f11326v = b0.j(this, y.a(q.class), new g(this), new h(this), new i(this));
    public final hs.i A = sp.b.O(new f());

    /* compiled from: ReworkLoginFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11331a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f11332b;

        static {
            int[] iArr = new int[ExpandedState.values().length];
            try {
                iArr[ExpandedState.ALL_COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExpandedState.TOP_EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExpandedState.BOTTOM_EXPANDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11331a = iArr;
            int[] iArr2 = new int[LoginSignupFlow.values().length];
            try {
                iArr2[LoginSignupFlow.SIGN_IN_GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LoginSignupFlow.SIGN_IN_FACEBOOK.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f11332b = iArr2;
        }
    }

    /* compiled from: ReworkLoginFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements l<ReworkLoginState, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ q f11333u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ReworkLoginFragment f11334v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q qVar, ReworkLoginFragment reworkLoginFragment) {
            super(1);
            this.f11333u = qVar;
            this.f11334v = reworkLoginFragment;
        }

        @Override // ss.l
        public final hs.k invoke(ReworkLoginState reworkLoginState) {
            LinearLayout linearLayout;
            ConstraintLayout constraintLayout;
            RobertoTextView robertoTextView;
            int i6;
            yp.l lVar;
            yp.g gVar;
            yp.l lVar2;
            int i10;
            int i11;
            yp.l lVar3;
            ConstraintLayout constraintLayout2;
            RobertoTextView robertoTextView2;
            RobertoTextView robertoTextView3;
            RobertoTextView robertoTextView4;
            RobertoTextView robertoTextView5;
            AppCompatImageView appCompatImageView;
            RobertoTextView robertoTextView6;
            View view;
            View view2;
            RobertoTextView robertoTextView7;
            AppCompatImageView appCompatImageView2;
            yp.l lVar4;
            int i12;
            int i13;
            LinearLayout linearLayout2;
            ConstraintLayout constraintLayout3;
            RobertoTextView robertoTextView8;
            int i14;
            yp.l lVar5;
            m mVar;
            yp.l lVar6;
            int i15;
            int i16;
            m mVar2;
            yp.l lVar7;
            m mVar3;
            int i17;
            yp.l lVar8;
            m mVar4;
            ConstraintLayout constraintLayout4;
            RobertoTextView robertoTextView9;
            RobertoTextView robertoTextView10;
            RobertoTextView robertoTextView11;
            RobertoTextView robertoTextView12;
            AppCompatImageView appCompatImageView3;
            yp.l lVar9;
            int i18;
            int i19;
            ReworkLoginState reworkLoginState2 = reworkLoginState;
            if (reworkLoginState2 != null) {
                q qVar = this.f11333u;
                boolean b10 = kotlin.jvm.internal.i.b(qVar.f17890b0, "variant_a");
                ReworkLoginFragment reworkLoginFragment = this.f11334v;
                if (b10) {
                    int i20 = ReworkLoginFragment.C;
                    reworkLoginFragment.K(reworkLoginState2);
                } else {
                    int i21 = 8;
                    String str = "";
                    RobertoTextView robertoTextView13 = null;
                    if (kotlin.jvm.internal.i.b(qVar.f17890b0, "variant_b")) {
                        yp.f fVar = reworkLoginFragment.f11328x;
                        if (fVar != null) {
                            linearLayout2 = (LinearLayout) fVar.f38776k;
                        } else {
                            linearLayout2 = null;
                        }
                        if (linearLayout2 != null) {
                            if (reworkLoginState2.isShowSocialOptions()) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            linearLayout2.setVisibility(i19);
                        }
                        if (reworkLoginState2.getBrandingInfo().f19464u.booleanValue()) {
                            yp.f fVar2 = reworkLoginFragment.f11328x;
                            if (fVar2 != null) {
                                constraintLayout4 = fVar2.f;
                            } else {
                                constraintLayout4 = null;
                            }
                            if (constraintLayout4 != null) {
                                constraintLayout4.setVisibility(0);
                            }
                            yp.f fVar3 = reworkLoginFragment.f11328x;
                            if (fVar3 != null) {
                                robertoTextView9 = fVar3.f38780o;
                            } else {
                                robertoTextView9 = null;
                            }
                            if (robertoTextView9 != null) {
                                robertoTextView9.setVisibility(8);
                            }
                            yp.f fVar4 = reworkLoginFragment.f11328x;
                            if (fVar4 != null) {
                                robertoTextView10 = fVar4.f38781p;
                            } else {
                                robertoTextView10 = null;
                            }
                            if (robertoTextView10 != null) {
                                if (reworkLoginState2.isDisableSignup()) {
                                    i18 = 8;
                                } else {
                                    i18 = 0;
                                }
                                robertoTextView10.setVisibility(i18);
                            }
                            yp.f fVar5 = reworkLoginFragment.f11328x;
                            if (fVar5 != null && (lVar9 = (yp.l) fVar5.f38774i) != null) {
                                robertoTextView11 = lVar9.f38863s;
                            } else {
                                robertoTextView11 = null;
                            }
                            if (robertoTextView11 != null) {
                                robertoTextView11.setVisibility(8);
                            }
                            yp.f fVar6 = reworkLoginFragment.f11328x;
                            if (fVar6 != null && (appCompatImageView3 = fVar6.f38773h) != null) {
                                Glide.g(reworkLoginFragment.requireContext()).p(reworkLoginState2.getBrandingInfo().f19465v).B(appCompatImageView3);
                            }
                            hs.f<String, String> loginTextOverride = reworkLoginState2.getLoginTextOverride();
                            if (loginTextOverride != null) {
                                String str2 = loginTextOverride.f19464u;
                                if (str2 != null) {
                                    yp.f fVar7 = reworkLoginFragment.f11328x;
                                    if (fVar7 != null) {
                                        robertoTextView12 = fVar7.f38779n;
                                    } else {
                                        robertoTextView12 = null;
                                    }
                                    if (robertoTextView12 != null) {
                                        robertoTextView12.setText(str2);
                                    }
                                }
                                String str3 = loginTextOverride.f19465v;
                                if (str3 != null) {
                                    yp.f fVar8 = reworkLoginFragment.f11328x;
                                    if (fVar8 != null) {
                                        robertoTextView13 = fVar8.f38778m;
                                    }
                                    if (robertoTextView13 != null) {
                                        robertoTextView13.setText(str3);
                                    }
                                }
                            }
                        } else {
                            yp.f fVar9 = reworkLoginFragment.f11328x;
                            if (fVar9 != null) {
                                constraintLayout3 = fVar9.f;
                            } else {
                                constraintLayout3 = null;
                            }
                            if (constraintLayout3 != null) {
                                constraintLayout3.setVisibility(8);
                            }
                            yp.f fVar10 = reworkLoginFragment.f11328x;
                            if (fVar10 != null) {
                                robertoTextView8 = fVar10.f38780o;
                            } else {
                                robertoTextView8 = null;
                            }
                            if (robertoTextView8 != null) {
                                if (reworkLoginState2.isDisableSignup()) {
                                    i14 = 8;
                                } else {
                                    i14 = 0;
                                }
                                robertoTextView8.setVisibility(i14);
                            }
                            yp.f fVar11 = reworkLoginFragment.f11328x;
                            if (fVar11 != null) {
                                robertoTextView13 = fVar11.f38781p;
                            }
                            if (robertoTextView13 != null) {
                                robertoTextView13.setVisibility(8);
                            }
                        }
                        yp.f fVar12 = reworkLoginFragment.f11328x;
                        if (fVar12 != null && (mVar4 = (m) fVar12.f38775j) != null) {
                            String phoneInputError = reworkLoginState2.getPhoneInputError();
                            if (phoneInputError == null) {
                                phoneInputError = "";
                            }
                            mVar4.f38871i.setText(phoneInputError);
                        }
                        yp.f fVar13 = reworkLoginFragment.f11328x;
                        if (fVar13 != null && (lVar8 = (yp.l) fVar13.f38774i) != null) {
                            String emailInputError = reworkLoginState2.getEmailInputError();
                            if (emailInputError == null) {
                                emailInputError = "";
                            }
                            lVar8.f38857l.setText(emailInputError);
                            String passwordInputError = reworkLoginState2.getPasswordInputError();
                            if (passwordInputError != null) {
                                str = passwordInputError;
                            }
                            lVar8.f38859n.setText(str);
                        }
                        int i22 = a.f11331a[reworkLoginState2.getExpandedState().ordinal()];
                        if (i22 != 1) {
                            if (i22 != 2) {
                                if (i22 == 3) {
                                    yp.f fVar14 = reworkLoginFragment.f11328x;
                                    if (fVar14 != null && (mVar3 = (m) fVar14.f38775j) != null) {
                                        mVar3.f38867d.setVisibility(8);
                                        mVar3.f38872j.setVisibility(8);
                                        mVar3.f38873k.setVisibility(0);
                                        mVar3.f38869g.setVisibility(0);
                                        mVar3.f.setVisibility(0);
                                        if (reworkLoginState2.getPhoneInputError() != null) {
                                            i17 = 0;
                                        } else {
                                            i17 = 8;
                                        }
                                        mVar3.f38871i.setVisibility(i17);
                                        RobertoButton robertoButton = mVar3.f38864a;
                                        robertoButton.setVisibility(0);
                                        robertoButton.setText(reworkLoginFragment.getString(R.string.depressionMasteryShowCTA));
                                    }
                                    yp.f fVar15 = reworkLoginFragment.f11328x;
                                    if (fVar15 != null && (lVar7 = (yp.l) fVar15.f38774i) != null) {
                                        lVar7.f38852g.setVisibility(0);
                                        lVar7.r.setVisibility(0);
                                        lVar7.f38863s.setVisibility(8);
                                        lVar7.f38853h.setVisibility(8);
                                        lVar7.f38857l.setVisibility(8);
                                        lVar7.f38855j.setVisibility(8);
                                        lVar7.f38859n.setVisibility(8);
                                        lVar7.f38862q.setVisibility(8);
                                        lVar7.f38860o.setVisibility(8);
                                        lVar7.f38851e.setVisibility(8);
                                        lVar7.f38861p.setVisibility(8);
                                        lVar7.f.setVisibility(8);
                                        lVar7.f38847a.setVisibility(8);
                                        lVar7.f38856k.setVisibility(8);
                                    }
                                }
                            } else {
                                yp.f fVar16 = reworkLoginFragment.f11328x;
                                if (fVar16 != null && (mVar2 = (m) fVar16.f38775j) != null) {
                                    mVar2.f38867d.setVisibility(0);
                                    mVar2.f38872j.setVisibility(0);
                                    mVar2.f38873k.setVisibility(8);
                                    mVar2.f38869g.setVisibility(8);
                                    mVar2.f.setVisibility(8);
                                    mVar2.f38871i.setVisibility(8);
                                    mVar2.f38864a.setVisibility(8);
                                }
                                yp.f fVar17 = reworkLoginFragment.f11328x;
                                if (fVar17 != null && (lVar6 = (yp.l) fVar17.f38774i) != null) {
                                    lVar6.f38852g.setVisibility(8);
                                    lVar6.r.setVisibility(8);
                                    if (!reworkLoginState2.getBrandingInfo().f19464u.booleanValue()) {
                                        i15 = 0;
                                    } else {
                                        i15 = 8;
                                    }
                                    lVar6.f38863s.setVisibility(i15);
                                    lVar6.f38853h.setVisibility(0);
                                    if (reworkLoginState2.getEmailInputError() != null) {
                                        i16 = 0;
                                    } else {
                                        i16 = 8;
                                    }
                                    lVar6.f38857l.setVisibility(i16);
                                    if (reworkLoginState2.getPasswordInputError() != null) {
                                        i21 = 0;
                                    }
                                    lVar6.f38859n.setVisibility(i21);
                                    lVar6.f38855j.setVisibility(0);
                                    lVar6.f38856k.setVisibility(0);
                                    RobertoButton robertoButton2 = lVar6.f38847a;
                                    robertoButton2.setVisibility(0);
                                    robertoButton2.setText(reworkLoginFragment.getString(R.string.depressionMasteryShowCTA));
                                }
                            }
                        } else {
                            yp.f fVar18 = reworkLoginFragment.f11328x;
                            if (fVar18 != null && (mVar = (m) fVar18.f38775j) != null) {
                                mVar.f38867d.setVisibility(8);
                                mVar.f38872j.setVisibility(8);
                                mVar.f38873k.setVisibility(8);
                                mVar.f38869g.setVisibility(8);
                                mVar.f.setVisibility(8);
                                mVar.f38871i.setVisibility(8);
                                mVar.f38864a.setVisibility(0);
                            }
                            yp.f fVar19 = reworkLoginFragment.f11328x;
                            if (fVar19 != null && (lVar5 = (yp.l) fVar19.f38774i) != null) {
                                lVar5.f38852g.setVisibility(0);
                                lVar5.r.setVisibility(0);
                                lVar5.f38863s.setVisibility(8);
                                lVar5.f38853h.setVisibility(8);
                                lVar5.f38857l.setVisibility(8);
                                lVar5.f38855j.setVisibility(8);
                                lVar5.f38859n.setVisibility(8);
                                lVar5.f38862q.setVisibility(8);
                                lVar5.f38860o.setVisibility(8);
                                lVar5.f38851e.setVisibility(8);
                                lVar5.f38861p.setVisibility(8);
                                lVar5.f.setVisibility(8);
                                lVar5.f38856k.setVisibility(8);
                                lVar5.f38847a.setVisibility(8);
                            }
                        }
                    } else {
                        yp.g gVar2 = reworkLoginFragment.f11329y;
                        if (gVar2 != null) {
                            linearLayout = gVar2.f38790i;
                        } else {
                            linearLayout = null;
                        }
                        if (linearLayout != null) {
                            if (reworkLoginState2.isShowSocialOptions()) {
                                i13 = 0;
                            } else {
                                i13 = 8;
                            }
                            linearLayout.setVisibility(i13);
                        }
                        if (reworkLoginState2.getBrandingInfo().f19464u.booleanValue()) {
                            yp.g gVar3 = reworkLoginFragment.f11329y;
                            if (gVar3 != null) {
                                constraintLayout2 = gVar3.f38786d;
                            } else {
                                constraintLayout2 = null;
                            }
                            if (constraintLayout2 != null) {
                                constraintLayout2.setVisibility(0);
                            }
                            yp.g gVar4 = reworkLoginFragment.f11329y;
                            if (gVar4 != null) {
                                robertoTextView2 = gVar4.f38796o;
                            } else {
                                robertoTextView2 = null;
                            }
                            if (robertoTextView2 != null) {
                                if (reworkLoginState2.isDisableSignup()) {
                                    i12 = 8;
                                } else {
                                    i12 = 0;
                                }
                                robertoTextView2.setVisibility(i12);
                            }
                            yp.g gVar5 = reworkLoginFragment.f11329y;
                            if (gVar5 != null && (lVar4 = gVar5.f38789h) != null) {
                                robertoTextView3 = lVar4.f38863s;
                            } else {
                                robertoTextView3 = null;
                            }
                            if (robertoTextView3 != null) {
                                robertoTextView3.setVisibility(8);
                            }
                            yp.g gVar6 = reworkLoginFragment.f11329y;
                            if (gVar6 != null) {
                                robertoTextView4 = gVar6.f38795n;
                            } else {
                                robertoTextView4 = null;
                            }
                            if (robertoTextView4 != null) {
                                robertoTextView4.setVisibility(8);
                            }
                            yp.g gVar7 = reworkLoginFragment.f11329y;
                            if (gVar7 != null) {
                                robertoTextView5 = gVar7.f38797p;
                            } else {
                                robertoTextView5 = null;
                            }
                            if (robertoTextView5 != null) {
                                robertoTextView5.setVisibility(8);
                            }
                            yp.g gVar8 = reworkLoginFragment.f11329y;
                            if (gVar8 != null) {
                                appCompatImageView = gVar8.f38788g;
                            } else {
                                appCompatImageView = null;
                            }
                            if (appCompatImageView != null) {
                                appCompatImageView.setVisibility(8);
                            }
                            yp.g gVar9 = reworkLoginFragment.f11329y;
                            if (gVar9 != null) {
                                robertoTextView6 = gVar9.f38794m;
                            } else {
                                robertoTextView6 = null;
                            }
                            if (robertoTextView6 != null) {
                                robertoTextView6.setVisibility(8);
                            }
                            yp.g gVar10 = reworkLoginFragment.f11329y;
                            if (gVar10 != null) {
                                view = gVar10.r;
                            } else {
                                view = null;
                            }
                            if (view != null) {
                                view.setVisibility(8);
                            }
                            yp.g gVar11 = reworkLoginFragment.f11329y;
                            if (gVar11 != null) {
                                view2 = gVar11.f38799s;
                            } else {
                                view2 = null;
                            }
                            if (view2 != null) {
                                view2.setVisibility(8);
                            }
                            yp.g gVar12 = reworkLoginFragment.f11329y;
                            if (gVar12 != null && (appCompatImageView2 = gVar12.f) != null) {
                                Glide.g(reworkLoginFragment.requireContext()).p(reworkLoginState2.getBrandingInfo().f19465v).B(appCompatImageView2);
                            }
                            hs.f<String, String> loginTextOverride2 = reworkLoginState2.getLoginTextOverride();
                            if (loginTextOverride2 != null) {
                                String str4 = loginTextOverride2.f19464u;
                                if (str4 != null) {
                                    yp.g gVar13 = reworkLoginFragment.f11329y;
                                    if (gVar13 != null) {
                                        robertoTextView7 = gVar13.f38793l;
                                    } else {
                                        robertoTextView7 = null;
                                    }
                                    if (robertoTextView7 != null) {
                                        robertoTextView7.setText(str4);
                                    }
                                }
                                String str5 = loginTextOverride2.f19465v;
                                if (str5 != null) {
                                    yp.g gVar14 = reworkLoginFragment.f11329y;
                                    if (gVar14 != null) {
                                        robertoTextView13 = gVar14.f38792k;
                                    }
                                    if (robertoTextView13 != null) {
                                        robertoTextView13.setText(str5);
                                    }
                                }
                            }
                        } else {
                            yp.g gVar15 = reworkLoginFragment.f11329y;
                            if (gVar15 != null) {
                                constraintLayout = gVar15.f38786d;
                            } else {
                                constraintLayout = null;
                            }
                            if (constraintLayout != null) {
                                constraintLayout.setVisibility(8);
                            }
                            yp.g gVar16 = reworkLoginFragment.f11329y;
                            if (gVar16 != null) {
                                robertoTextView = gVar16.f38795n;
                            } else {
                                robertoTextView = null;
                            }
                            if (robertoTextView != null) {
                                if (reworkLoginState2.isDisableSignup()) {
                                    i6 = 8;
                                } else {
                                    i6 = 0;
                                }
                                robertoTextView.setVisibility(i6);
                            }
                            yp.g gVar17 = reworkLoginFragment.f11329y;
                            if (gVar17 != null) {
                                robertoTextView13 = gVar17.f38796o;
                            }
                            if (robertoTextView13 != null) {
                                robertoTextView13.setVisibility(8);
                            }
                        }
                        yp.g gVar18 = reworkLoginFragment.f11329y;
                        if (gVar18 != null && (lVar3 = gVar18.f38789h) != null) {
                            String emailInputError2 = reworkLoginState2.getEmailInputError();
                            if (emailInputError2 == null) {
                                emailInputError2 = "";
                            }
                            lVar3.f38857l.setText(emailInputError2);
                            String passwordInputError2 = reworkLoginState2.getPasswordInputError();
                            if (passwordInputError2 != null) {
                                str = passwordInputError2;
                            }
                            lVar3.f38859n.setText(str);
                        }
                        int i23 = a.f11331a[reworkLoginState2.getExpandedState().ordinal()];
                        if (i23 != 1) {
                            if (i23 == 3 && (gVar = reworkLoginFragment.f11329y) != null && (lVar2 = gVar.f38789h) != null) {
                                lVar2.f38852g.setVisibility(8);
                                lVar2.r.setVisibility(8);
                                if (!reworkLoginState2.getBrandingInfo().f19464u.booleanValue()) {
                                    i10 = 0;
                                } else {
                                    i10 = 8;
                                }
                                lVar2.f38863s.setVisibility(i10);
                                lVar2.f38853h.setVisibility(0);
                                if (reworkLoginState2.getEmailInputError() != null) {
                                    i11 = 0;
                                } else {
                                    i11 = 8;
                                }
                                lVar2.f38857l.setVisibility(i11);
                                if (reworkLoginState2.getPasswordInputError() != null) {
                                    i21 = 0;
                                }
                                lVar2.f38859n.setVisibility(i21);
                                lVar2.f38855j.setVisibility(0);
                                lVar2.f38856k.setVisibility(0);
                                RobertoButton robertoButton3 = lVar2.f38847a;
                                robertoButton3.setVisibility(0);
                                robertoButton3.setText(reworkLoginFragment.getString(R.string.depressionMasteryShowCTA));
                            }
                        } else {
                            yp.g gVar19 = reworkLoginFragment.f11329y;
                            if (gVar19 != null && (lVar = gVar19.f38789h) != null) {
                                lVar.f38852g.setVisibility(8);
                                lVar.r.setVisibility(8);
                                lVar.f38863s.setVisibility(8);
                                lVar.f38853h.setVisibility(8);
                                lVar.f38857l.setVisibility(8);
                                lVar.f38855j.setVisibility(8);
                                lVar.f38859n.setVisibility(8);
                                lVar.f38862q.setVisibility(8);
                                lVar.f38860o.setVisibility(8);
                                lVar.f38851e.setVisibility(8);
                                lVar.f38861p.setVisibility(8);
                                lVar.f.setVisibility(8);
                                lVar.f38856k.setVisibility(8);
                                lVar.f38847a.setVisibility(0);
                            }
                        }
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ReworkLoginFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements l<SingleUseEvent<? extends Boolean>, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
            Boolean contentIfNotHandled;
            SingleUseEvent<? extends Boolean> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null && contentIfNotHandled.booleanValue()) {
                int i6 = ReworkLoginFragment.C;
                final ReworkLoginFragment reworkLoginFragment = ReworkLoginFragment.this;
                reworkLoginFragment.getClass();
                try {
                    u uVar = new u();
                    reworkLoginFragment.I().setCancelable(false);
                    RobertoEditText robertoEditText = (RobertoEditText) reworkLoginFragment.I().findViewById(R.id.etOTPDialog1);
                    if (robertoEditText != null) {
                        robertoEditText.setText("");
                    }
                    RobertoEditText robertoEditText2 = (RobertoEditText) reworkLoginFragment.I().findViewById(R.id.etOTPDialog2);
                    if (robertoEditText2 != null) {
                        robertoEditText2.setText("");
                    }
                    RobertoEditText robertoEditText3 = (RobertoEditText) reworkLoginFragment.I().findViewById(R.id.etOTPDialog3);
                    if (robertoEditText3 != null) {
                        robertoEditText3.setText("");
                    }
                    RobertoEditText robertoEditText4 = (RobertoEditText) reworkLoginFragment.I().findViewById(R.id.etOTPDialog4);
                    if (robertoEditText4 != null) {
                        robertoEditText4.setText("");
                    }
                    RobertoTextView robertoTextView = (RobertoTextView) reworkLoginFragment.I().findViewById(R.id.tvOTPDialogError);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(8);
                    }
                    if (!reworkLoginFragment.I().isShowing()) {
                        reworkLoginFragment.J().P.e(reworkLoginFragment.getViewLifecycleOwner(), new p(25, new gn.i(reworkLoginFragment)));
                        reworkLoginFragment.J().V.e(reworkLoginFragment.getViewLifecycleOwner(), new p(26, new j(reworkLoginFragment)));
                        reworkLoginFragment.J().U.e(reworkLoginFragment.getViewLifecycleOwner(), new p(27, new gn.k(reworkLoginFragment)));
                        RobertoEditText robertoEditText5 = (RobertoEditText) reworkLoginFragment.I().findViewById(R.id.etOTPDialog2);
                        if (robertoEditText5 != null) {
                            robertoEditText5.setOnKeyListener(new View.OnKeyListener() { // from class: gn.c
                                @Override // android.view.View.OnKeyListener
                                public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                                    int i11 = r2;
                                    boolean z10 = true;
                                    Editable editable = null;
                                    ReworkLoginFragment this$0 = reworkLoginFragment;
                                    switch (i11) {
                                        case 0:
                                            int i12 = ReworkLoginFragment.C;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (i10 == 67) {
                                                kotlin.jvm.internal.i.d(keyEvent);
                                                if (keyEvent.getAction() == 0) {
                                                    RobertoEditText robertoEditText6 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog2);
                                                    if (robertoEditText6 != null) {
                                                        editable = robertoEditText6.getText();
                                                    }
                                                    if (editable != null && editable.length() != 0) {
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        RobertoEditText robertoEditText7 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog1);
                                                        if (robertoEditText7 != null) {
                                                            robertoEditText7.setText("");
                                                        }
                                                        RobertoEditText robertoEditText8 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog1);
                                                        if (robertoEditText8 != null) {
                                                            robertoEditText8.requestFocus();
                                                        }
                                                    }
                                                }
                                            }
                                            return false;
                                        case 1:
                                            int i13 = ReworkLoginFragment.C;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (i10 == 67) {
                                                kotlin.jvm.internal.i.d(keyEvent);
                                                if (keyEvent.getAction() == 0) {
                                                    RobertoEditText robertoEditText9 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog3);
                                                    if (robertoEditText9 != null) {
                                                        editable = robertoEditText9.getText();
                                                    }
                                                    if (editable != null && editable.length() != 0) {
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        RobertoEditText robertoEditText10 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog2);
                                                        if (robertoEditText10 != null) {
                                                            robertoEditText10.setText("");
                                                        }
                                                        RobertoEditText robertoEditText11 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog2);
                                                        if (robertoEditText11 != null) {
                                                            robertoEditText11.requestFocus();
                                                        }
                                                    }
                                                }
                                            }
                                            return false;
                                        default:
                                            int i14 = ReworkLoginFragment.C;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (i10 == 67) {
                                                kotlin.jvm.internal.i.d(keyEvent);
                                                if (keyEvent.getAction() == 0) {
                                                    RobertoEditText robertoEditText12 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog4);
                                                    if (robertoEditText12 != null) {
                                                        editable = robertoEditText12.getText();
                                                    }
                                                    if (editable != null && editable.length() != 0) {
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        RobertoEditText robertoEditText13 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog3);
                                                        if (robertoEditText13 != null) {
                                                            robertoEditText13.setText("");
                                                        }
                                                        RobertoEditText robertoEditText14 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog3);
                                                        if (robertoEditText14 != null) {
                                                            robertoEditText14.requestFocus();
                                                        }
                                                    }
                                                }
                                            }
                                            return false;
                                    }
                                }
                            });
                        }
                        RobertoEditText robertoEditText6 = (RobertoEditText) reworkLoginFragment.I().findViewById(R.id.etOTPDialog3);
                        if (robertoEditText6 != null) {
                            robertoEditText6.setOnKeyListener(new View.OnKeyListener() { // from class: gn.c
                                @Override // android.view.View.OnKeyListener
                                public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                                    int i11 = r2;
                                    boolean z10 = true;
                                    Editable editable = null;
                                    ReworkLoginFragment this$0 = reworkLoginFragment;
                                    switch (i11) {
                                        case 0:
                                            int i12 = ReworkLoginFragment.C;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (i10 == 67) {
                                                kotlin.jvm.internal.i.d(keyEvent);
                                                if (keyEvent.getAction() == 0) {
                                                    RobertoEditText robertoEditText62 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog2);
                                                    if (robertoEditText62 != null) {
                                                        editable = robertoEditText62.getText();
                                                    }
                                                    if (editable != null && editable.length() != 0) {
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        RobertoEditText robertoEditText7 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog1);
                                                        if (robertoEditText7 != null) {
                                                            robertoEditText7.setText("");
                                                        }
                                                        RobertoEditText robertoEditText8 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog1);
                                                        if (robertoEditText8 != null) {
                                                            robertoEditText8.requestFocus();
                                                        }
                                                    }
                                                }
                                            }
                                            return false;
                                        case 1:
                                            int i13 = ReworkLoginFragment.C;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (i10 == 67) {
                                                kotlin.jvm.internal.i.d(keyEvent);
                                                if (keyEvent.getAction() == 0) {
                                                    RobertoEditText robertoEditText9 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog3);
                                                    if (robertoEditText9 != null) {
                                                        editable = robertoEditText9.getText();
                                                    }
                                                    if (editable != null && editable.length() != 0) {
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        RobertoEditText robertoEditText10 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog2);
                                                        if (robertoEditText10 != null) {
                                                            robertoEditText10.setText("");
                                                        }
                                                        RobertoEditText robertoEditText11 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog2);
                                                        if (robertoEditText11 != null) {
                                                            robertoEditText11.requestFocus();
                                                        }
                                                    }
                                                }
                                            }
                                            return false;
                                        default:
                                            int i14 = ReworkLoginFragment.C;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (i10 == 67) {
                                                kotlin.jvm.internal.i.d(keyEvent);
                                                if (keyEvent.getAction() == 0) {
                                                    RobertoEditText robertoEditText12 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog4);
                                                    if (robertoEditText12 != null) {
                                                        editable = robertoEditText12.getText();
                                                    }
                                                    if (editable != null && editable.length() != 0) {
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        RobertoEditText robertoEditText13 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog3);
                                                        if (robertoEditText13 != null) {
                                                            robertoEditText13.setText("");
                                                        }
                                                        RobertoEditText robertoEditText14 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog3);
                                                        if (robertoEditText14 != null) {
                                                            robertoEditText14.requestFocus();
                                                        }
                                                    }
                                                }
                                            }
                                            return false;
                                    }
                                }
                            });
                        }
                        RobertoEditText robertoEditText7 = (RobertoEditText) reworkLoginFragment.I().findViewById(R.id.etOTPDialog4);
                        if (robertoEditText7 != null) {
                            robertoEditText7.setOnKeyListener(new View.OnKeyListener() { // from class: gn.c
                                @Override // android.view.View.OnKeyListener
                                public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                                    int i11 = r2;
                                    boolean z10 = true;
                                    Editable editable = null;
                                    ReworkLoginFragment this$0 = reworkLoginFragment;
                                    switch (i11) {
                                        case 0:
                                            int i12 = ReworkLoginFragment.C;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (i10 == 67) {
                                                kotlin.jvm.internal.i.d(keyEvent);
                                                if (keyEvent.getAction() == 0) {
                                                    RobertoEditText robertoEditText62 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog2);
                                                    if (robertoEditText62 != null) {
                                                        editable = robertoEditText62.getText();
                                                    }
                                                    if (editable != null && editable.length() != 0) {
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        RobertoEditText robertoEditText72 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog1);
                                                        if (robertoEditText72 != null) {
                                                            robertoEditText72.setText("");
                                                        }
                                                        RobertoEditText robertoEditText8 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog1);
                                                        if (robertoEditText8 != null) {
                                                            robertoEditText8.requestFocus();
                                                        }
                                                    }
                                                }
                                            }
                                            return false;
                                        case 1:
                                            int i13 = ReworkLoginFragment.C;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (i10 == 67) {
                                                kotlin.jvm.internal.i.d(keyEvent);
                                                if (keyEvent.getAction() == 0) {
                                                    RobertoEditText robertoEditText9 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog3);
                                                    if (robertoEditText9 != null) {
                                                        editable = robertoEditText9.getText();
                                                    }
                                                    if (editable != null && editable.length() != 0) {
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        RobertoEditText robertoEditText10 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog2);
                                                        if (robertoEditText10 != null) {
                                                            robertoEditText10.setText("");
                                                        }
                                                        RobertoEditText robertoEditText11 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog2);
                                                        if (robertoEditText11 != null) {
                                                            robertoEditText11.requestFocus();
                                                        }
                                                    }
                                                }
                                            }
                                            return false;
                                        default:
                                            int i14 = ReworkLoginFragment.C;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (i10 == 67) {
                                                kotlin.jvm.internal.i.d(keyEvent);
                                                if (keyEvent.getAction() == 0) {
                                                    RobertoEditText robertoEditText12 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog4);
                                                    if (robertoEditText12 != null) {
                                                        editable = robertoEditText12.getText();
                                                    }
                                                    if (editable != null && editable.length() != 0) {
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        RobertoEditText robertoEditText13 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog3);
                                                        if (robertoEditText13 != null) {
                                                            robertoEditText13.setText("");
                                                        }
                                                        RobertoEditText robertoEditText14 = (RobertoEditText) this$0.I().findViewById(R.id.etOTPDialog3);
                                                        if (robertoEditText14 != null) {
                                                            robertoEditText14.requestFocus();
                                                        }
                                                    }
                                                }
                                            }
                                            return false;
                                    }
                                }
                            });
                        }
                        RobertoEditText robertoEditText8 = (RobertoEditText) reworkLoginFragment.I().findViewById(R.id.etOTPDialog1);
                        if (robertoEditText8 != null) {
                            robertoEditText8.addTextChangedListener(new gn.e(reworkLoginFragment, uVar));
                        }
                        RobertoEditText robertoEditText9 = (RobertoEditText) reworkLoginFragment.I().findViewById(R.id.etOTPDialog2);
                        if (robertoEditText9 != null) {
                            robertoEditText9.addTextChangedListener(new gn.f(reworkLoginFragment, uVar));
                        }
                        RobertoEditText robertoEditText10 = (RobertoEditText) reworkLoginFragment.I().findViewById(R.id.etOTPDialog3);
                        if (robertoEditText10 != null) {
                            robertoEditText10.addTextChangedListener(new gn.g(reworkLoginFragment, uVar));
                        }
                        RobertoEditText robertoEditText11 = (RobertoEditText) reworkLoginFragment.I().findViewById(R.id.etOTPDialog4);
                        if (robertoEditText11 != null) {
                            robertoEditText11.addTextChangedListener(new gn.h(reworkLoginFragment, uVar));
                        }
                        AppCompatImageView appCompatImageView = (AppCompatImageView) reworkLoginFragment.I().findViewById(R.id.ivOTPDialogCloseCta);
                        if (appCompatImageView != null) {
                            appCompatImageView.setOnClickListener(new gn.b(reworkLoginFragment, 27));
                        }
                        RobertoTextView robertoTextView2 = (RobertoTextView) reworkLoginFragment.I().findViewById(R.id.tvOTPDialogResend);
                        if (robertoTextView2 != null) {
                            robertoTextView2.setPaintFlags(8 | ((RobertoTextView) reworkLoginFragment.I().findViewById(R.id.tvOTPDialogResend)).getPaintFlags());
                        }
                        RobertoTextView robertoTextView3 = (RobertoTextView) reworkLoginFragment.I().findViewById(R.id.tvOTPDialogResend);
                        if (robertoTextView3 != null) {
                            robertoTextView3.setOnClickListener(new gn.b(reworkLoginFragment, 28));
                        }
                        RobertoButton robertoButton = (RobertoButton) reworkLoginFragment.I().findViewById(R.id.btnOTPDialogCTA);
                        if (robertoButton != null) {
                            robertoButton.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(reworkLoginFragment.requireContext(), R.color.campaignLightBlue40Opacity)));
                        }
                        RobertoButton robertoButton2 = (RobertoButton) reworkLoginFragment.I().findViewById(R.id.btnOTPDialogCTA);
                        if (robertoButton2 != null) {
                            robertoButton2.setOnClickListener(new w0(uVar, 20, reworkLoginFragment));
                        }
                        reworkLoginFragment.I().setOnDismissListener(new gn.d(reworkLoginFragment, 0));
                        reworkLoginFragment.I().show();
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(reworkLoginFragment.f11325u, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ReworkLoginFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements l<LoginSignupFlow, hs.k> {
        public d() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(LoginSignupFlow loginSignupFlow) {
            LoginSignupFlow loginSignupFlow2 = loginSignupFlow;
            if (loginSignupFlow2 != null) {
                int i6 = ReworkLoginFragment.C;
                ReworkLoginFragment reworkLoginFragment = ReworkLoginFragment.this;
                reworkLoginFragment.getClass();
                int i10 = a.f11332b[loginSignupFlow2.ordinal()];
                LoginSignupReworkActivity loginSignupReworkActivity = null;
                if (i10 != 1) {
                    if (i10 == 2) {
                        String str = gk.a.f16573a;
                        Bundle bundle = new Bundle();
                        bundle.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                        hs.k kVar = hs.k.f19476a;
                        gk.a.b(bundle, "facebook_signup_click");
                        androidx.fragment.app.p requireActivity = reworkLoginFragment.requireActivity();
                        if (requireActivity instanceof LoginSignupReworkActivity) {
                            loginSignupReworkActivity = (LoginSignupReworkActivity) requireActivity;
                        }
                        if (loginSignupReworkActivity != null) {
                            loginSignupReworkActivity.n0(loginSignupFlow2);
                        }
                    }
                } else {
                    String str2 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle2, "google_signup_click");
                    androidx.fragment.app.p requireActivity2 = reworkLoginFragment.requireActivity();
                    if (requireActivity2 instanceof LoginSignupReworkActivity) {
                        loginSignupReworkActivity = (LoginSignupReworkActivity) requireActivity2;
                    }
                    if (loginSignupReworkActivity != null) {
                        loginSignupReworkActivity.o0();
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ReworkLoginFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends k implements l<Boolean, hs.k> {
        public e() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                int i6 = ReworkLoginFragment.C;
                ReworkLoginFragment reworkLoginFragment = ReworkLoginFragment.this;
                reworkLoginFragment.getClass();
                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_get_email, reworkLoginFragment.requireContext(), R.style.Theme_Dialog);
                View findViewById = styledDialog.findViewById(R.id.yes);
                kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoButton");
                ((RobertoButton) findViewById).setOnClickListener(new w0(styledDialog, 21, reworkLoginFragment));
                styledDialog.setOnDismissListener(new gn.d(reworkLoginFragment, 1));
                styledDialog.show();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ReworkLoginFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends k implements ss.a<Dialog> {
        public f() {
            super(0);
        }

        @Override // ss.a
        public final Dialog invoke() {
            return UiUtils.Companion.getStyledDialog(R.layout.dialog_input_otp, ReworkLoginFragment.this.requireContext(), R.style.Theme_Dialog);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class g extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11339u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f11339u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f11339u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class h extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11340u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f11340u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f11340u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class i extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11341u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f11341u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f11341u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public static final boolean F(ReworkLoginFragment reworkLoginFragment, Dialog dialog) {
        Editable editable;
        boolean z10;
        Editable editable2;
        boolean z11;
        Editable editable3;
        boolean z12;
        Editable editable4;
        boolean z13;
        RobertoEditText robertoEditText;
        RobertoEditText robertoEditText2;
        RobertoEditText robertoEditText3;
        RobertoEditText robertoEditText4;
        reworkLoginFragment.getClass();
        RobertoButton robertoButton = null;
        if (dialog != null && (robertoEditText4 = (RobertoEditText) dialog.findViewById(R.id.etOTPDialog1)) != null) {
            editable = robertoEditText4.getText();
        } else {
            editable = null;
        }
        if (editable != null && editable.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            if (dialog != null && (robertoEditText3 = (RobertoEditText) dialog.findViewById(R.id.etOTPDialog2)) != null) {
                editable2 = robertoEditText3.getText();
            } else {
                editable2 = null;
            }
            if (editable2 != null && editable2.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                if (dialog != null && (robertoEditText2 = (RobertoEditText) dialog.findViewById(R.id.etOTPDialog3)) != null) {
                    editable3 = robertoEditText2.getText();
                } else {
                    editable3 = null;
                }
                if (editable3 != null && editable3.length() != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12) {
                    if (dialog != null && (robertoEditText = (RobertoEditText) dialog.findViewById(R.id.etOTPDialog4)) != null) {
                        editable4 = robertoEditText.getText();
                    } else {
                        editable4 = null;
                    }
                    if (editable4 != null && editable4.length() != 0) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (!z13) {
                        if (dialog != null) {
                            robertoButton = (RobertoButton) dialog.findViewById(R.id.btnOTPDialogCTA);
                        }
                        if (robertoButton == null) {
                            return true;
                        }
                        robertoButton.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(reworkLoginFragment.requireContext(), R.color.campaignLightBlue)));
                        return true;
                    }
                }
            }
        }
        if (dialog != null) {
            robertoButton = (RobertoButton) dialog.findViewById(R.id.btnOTPDialogCTA);
        }
        if (robertoButton != null) {
            robertoButton.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(reworkLoginFragment.requireContext(), R.color.campaignLightBlue40Opacity)));
        }
        return false;
    }

    public final Dialog I() {
        return (Dialog) this.A.getValue();
    }

    public final q J() {
        return (q) this.f11326v.getValue();
    }

    public final void K(ReworkLoginState reworkLoginState) {
        LinearLayout linearLayout;
        ConstraintLayout constraintLayout;
        RobertoTextView robertoTextView;
        int i6;
        yp.l lVar;
        m mVar;
        yp.l lVar2;
        m mVar2;
        int i10;
        yp.l lVar3;
        int i11;
        int i12;
        m mVar3;
        yp.l lVar4;
        m mVar4;
        ConstraintLayout constraintLayout2;
        RobertoTextView robertoTextView2;
        RobertoTextView robertoTextView3;
        RobertoTextView robertoTextView4;
        RobertoTextView robertoTextView5;
        AppCompatImageView appCompatImageView;
        yp.l lVar5;
        int i13;
        int i14;
        yp.f fVar = this.f11327w;
        RobertoTextView robertoTextView6 = null;
        if (fVar != null) {
            linearLayout = (LinearLayout) fVar.f38776k;
        } else {
            linearLayout = null;
        }
        int i15 = 8;
        if (linearLayout != null) {
            if (reworkLoginState.isShowSocialOptions()) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            linearLayout.setVisibility(i14);
        }
        if (reworkLoginState.getBrandingInfo().f19464u.booleanValue()) {
            yp.f fVar2 = this.f11327w;
            if (fVar2 != null) {
                constraintLayout2 = fVar2.f;
            } else {
                constraintLayout2 = null;
            }
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(0);
            }
            yp.f fVar3 = this.f11327w;
            if (fVar3 != null) {
                robertoTextView2 = fVar3.f38780o;
            } else {
                robertoTextView2 = null;
            }
            if (robertoTextView2 != null) {
                robertoTextView2.setVisibility(8);
            }
            yp.f fVar4 = this.f11327w;
            if (fVar4 != null) {
                robertoTextView3 = fVar4.f38781p;
            } else {
                robertoTextView3 = null;
            }
            if (robertoTextView3 != null) {
                if (reworkLoginState.isDisableSignup()) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                robertoTextView3.setVisibility(i13);
            }
            yp.f fVar5 = this.f11327w;
            if (fVar5 != null && (lVar5 = (yp.l) fVar5.f38774i) != null) {
                robertoTextView4 = lVar5.f38863s;
            } else {
                robertoTextView4 = null;
            }
            if (robertoTextView4 != null) {
                robertoTextView4.setVisibility(8);
            }
            yp.f fVar6 = this.f11327w;
            if (fVar6 != null && (appCompatImageView = fVar6.f38773h) != null) {
                Glide.g(requireContext()).p(reworkLoginState.getBrandingInfo().f19465v).B(appCompatImageView);
            }
            hs.f<String, String> loginTextOverride = reworkLoginState.getLoginTextOverride();
            if (loginTextOverride != null) {
                String str = loginTextOverride.f19464u;
                if (str != null) {
                    yp.f fVar7 = this.f11327w;
                    if (fVar7 != null) {
                        robertoTextView5 = fVar7.f38779n;
                    } else {
                        robertoTextView5 = null;
                    }
                    if (robertoTextView5 != null) {
                        robertoTextView5.setText(str);
                    }
                }
                String str2 = loginTextOverride.f19465v;
                if (str2 != null) {
                    yp.f fVar8 = this.f11327w;
                    if (fVar8 != null) {
                        robertoTextView6 = fVar8.f38778m;
                    }
                    if (robertoTextView6 != null) {
                        robertoTextView6.setText(str2);
                    }
                }
            }
        } else {
            yp.f fVar9 = this.f11327w;
            if (fVar9 != null) {
                constraintLayout = fVar9.f;
            } else {
                constraintLayout = null;
            }
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
            yp.f fVar10 = this.f11327w;
            if (fVar10 != null) {
                robertoTextView = fVar10.f38780o;
            } else {
                robertoTextView = null;
            }
            if (robertoTextView != null) {
                if (reworkLoginState.isDisableSignup()) {
                    i6 = 8;
                } else {
                    i6 = 0;
                }
                robertoTextView.setVisibility(i6);
            }
            yp.f fVar11 = this.f11327w;
            if (fVar11 != null) {
                robertoTextView6 = fVar11.f38781p;
            }
            if (robertoTextView6 != null) {
                robertoTextView6.setVisibility(8);
            }
        }
        yp.f fVar12 = this.f11327w;
        String str3 = "";
        if (fVar12 != null && (mVar4 = (m) fVar12.f38775j) != null) {
            String phoneInputError = reworkLoginState.getPhoneInputError();
            if (phoneInputError == null) {
                phoneInputError = "";
            }
            mVar4.f38871i.setText(phoneInputError);
        }
        yp.f fVar13 = this.f11327w;
        if (fVar13 != null && (lVar4 = (yp.l) fVar13.f38774i) != null) {
            String emailInputError = reworkLoginState.getEmailInputError();
            if (emailInputError == null) {
                emailInputError = "";
            }
            lVar4.f38857l.setText(emailInputError);
            String passwordInputError = reworkLoginState.getPasswordInputError();
            if (passwordInputError != null) {
                str3 = passwordInputError;
            }
            lVar4.f38859n.setText(str3);
        }
        int i16 = a.f11331a[reworkLoginState.getExpandedState().ordinal()];
        if (i16 != 1) {
            if (i16 != 2) {
                if (i16 == 3) {
                    yp.f fVar14 = this.f11327w;
                    if (fVar14 != null && (mVar3 = (m) fVar14.f38775j) != null) {
                        mVar3.f38867d.setVisibility(0);
                        mVar3.f38872j.setVisibility(0);
                        mVar3.f38873k.setVisibility(8);
                        mVar3.f38869g.setVisibility(8);
                        mVar3.f.setVisibility(8);
                        mVar3.f38871i.setVisibility(8);
                        mVar3.f38864a.setVisibility(8);
                    }
                    yp.f fVar15 = this.f11327w;
                    if (fVar15 != null && (lVar3 = (yp.l) fVar15.f38774i) != null) {
                        lVar3.f38852g.setVisibility(8);
                        lVar3.r.setVisibility(8);
                        if (!reworkLoginState.getBrandingInfo().f19464u.booleanValue()) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        lVar3.f38863s.setVisibility(i11);
                        lVar3.f38853h.setVisibility(0);
                        if (reworkLoginState.getEmailInputError() != null) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        lVar3.f38857l.setVisibility(i12);
                        if (reworkLoginState.getPasswordInputError() != null) {
                            i15 = 0;
                        }
                        lVar3.f38859n.setVisibility(i15);
                        lVar3.f38855j.setVisibility(0);
                        RobertoButton robertoButton = lVar3.f38847a;
                        robertoButton.setVisibility(0);
                        lVar3.f38856k.setVisibility(0);
                        robertoButton.setText(getString(R.string.depressionMasteryShowCTA));
                        return;
                    }
                    return;
                }
                return;
            }
            yp.f fVar16 = this.f11327w;
            if (fVar16 != null && (mVar2 = (m) fVar16.f38775j) != null) {
                mVar2.f38867d.setVisibility(8);
                mVar2.f38872j.setVisibility(8);
                mVar2.f38873k.setVisibility(0);
                mVar2.f38869g.setVisibility(0);
                mVar2.f.setVisibility(0);
                if (reworkLoginState.getPhoneInputError() != null) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                mVar2.f38871i.setVisibility(i10);
                RobertoButton robertoButton2 = mVar2.f38864a;
                robertoButton2.setVisibility(0);
                robertoButton2.setText(getString(R.string.depressionMasteryShowCTA));
            }
            yp.f fVar17 = this.f11327w;
            if (fVar17 != null && (lVar2 = (yp.l) fVar17.f38774i) != null) {
                lVar2.f38852g.setVisibility(0);
                lVar2.r.setVisibility(0);
                lVar2.f38863s.setVisibility(8);
                lVar2.f38853h.setVisibility(8);
                lVar2.f38857l.setVisibility(8);
                lVar2.f38855j.setVisibility(8);
                lVar2.f38859n.setVisibility(8);
                lVar2.f38862q.setVisibility(8);
                lVar2.f38860o.setVisibility(8);
                lVar2.f38851e.setVisibility(8);
                lVar2.f38861p.setVisibility(8);
                lVar2.f.setVisibility(8);
                lVar2.f38847a.setVisibility(8);
                lVar2.f38856k.setVisibility(8);
                return;
            }
            return;
        }
        yp.f fVar18 = this.f11327w;
        if (fVar18 != null && (mVar = (m) fVar18.f38775j) != null) {
            mVar.f38867d.setVisibility(0);
            mVar.f38872j.setVisibility(0);
            mVar.f38873k.setVisibility(8);
            mVar.f38869g.setVisibility(8);
            mVar.f.setVisibility(8);
            mVar.f38871i.setVisibility(8);
            mVar.f38864a.setVisibility(8);
        }
        yp.f fVar19 = this.f11327w;
        if (fVar19 != null && (lVar = (yp.l) fVar19.f38774i) != null) {
            lVar.f38852g.setVisibility(8);
            lVar.r.setVisibility(8);
            lVar.f38863s.setVisibility(8);
            lVar.f38853h.setVisibility(8);
            lVar.f38857l.setVisibility(8);
            lVar.f38855j.setVisibility(8);
            lVar.f38859n.setVisibility(8);
            lVar.f38862q.setVisibility(8);
            lVar.f38860o.setVisibility(8);
            lVar.f38851e.setVisibility(8);
            lVar.f38861p.setVisibility(8);
            lVar.f.setVisibility(8);
            lVar.f38856k.setVisibility(8);
            lVar.f38847a.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        String str = J().f17890b0;
        if (kotlin.jvm.internal.i.b(str, "variant_a")) {
            yp.f b10 = yp.f.b(getLayoutInflater());
            this.f11327w = b10;
            return b10.a();
        } else if (kotlin.jvm.internal.i.b(str, "variant_b")) {
            yp.f c10 = yp.f.c(getLayoutInflater());
            this.f11328x = c10;
            return c10.a();
        } else {
            yp.g a10 = yp.g.a(getLayoutInflater());
            this.f11329y = a10;
            return a10.f38783a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f11327w = null;
        this.f11328x = null;
        this.f11329y = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.B.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        yp.l lVar;
        RobertoTextView robertoTextView;
        RobertoTextView robertoTextView2;
        RobertoTextView robertoTextView3;
        View view2;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        yp.l lVar2;
        RobertoButton robertoButton;
        yp.l lVar3;
        RobertoTextView robertoTextView4;
        RobertoTextView robertoTextView5;
        RobertoTextView robertoTextView6;
        ConstraintLayout constraintLayout3;
        AppCompatImageButton appCompatImageButton;
        AppCompatImageButton appCompatImageButton2;
        yp.l lVar4;
        RobertoTextView robertoTextView7;
        yp.l lVar5;
        RobertoButton robertoButton2;
        m mVar;
        RobertoTextView robertoTextView8;
        m mVar2;
        RobertoButton robertoButton3;
        yp.l lVar6;
        RobertoTextView robertoTextView9;
        RobertoTextView robertoTextView10;
        RobertoTextView robertoTextView11;
        ConstraintLayout constraintLayout4;
        AppCompatImageButton appCompatImageButton3;
        AppCompatImageButton appCompatImageButton4;
        yp.l lVar7;
        RobertoTextView robertoTextView12;
        yp.l lVar8;
        RobertoButton robertoButton4;
        m mVar3;
        RobertoTextView robertoTextView13;
        m mVar4;
        RobertoButton robertoButton5;
        String string;
        yp.l lVar9;
        RobertoEditText robertoEditText;
        yp.l lVar10;
        RobertoEditText robertoEditText2;
        yp.l lVar11;
        RobertoEditText robertoEditText3;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        q J = J();
        J.B.e(getViewLifecycleOwner(), new p(21, new b(J, this)));
        J.c0.e(getViewLifecycleOwner(), new p(22, new c()));
        J.I.e(getViewLifecycleOwner(), new p(23, new d()));
        J.G.e(getViewLifecycleOwner(), new p(24, new e()));
        yp.f fVar = this.f11327w;
        if (fVar != null) {
            fVar.f38772g.setVisibility(8);
            fVar.f38777l.setVisibility(8);
            fVar.f38782q.setVisibility(8);
            fVar.f38780o.setText(getString(R.string.loginSignUpRoute));
            fVar.f38781p.setText(getString(R.string.loginSignUpRoute));
            m mVar5 = (m) fVar.f38775j;
            mVar5.f38868e.setVisibility(8);
            yp.l lVar12 = (yp.l) fVar.f38774i;
            lVar12.f38854i.setVisibility(8);
            mVar5.f38872j.setText(getString(R.string.loginWithPhoneUnderline));
            mVar5.f38873k.setText(getString(R.string.loginPhoneTitle));
            mVar5.f38864a.setText(getString(R.string.loginWithPhone));
            lVar12.r.setText(getString(R.string.loginWithEmailUnderline));
            lVar12.f38863s.setText(getString(R.string.loginEmailTitle));
            lVar12.f38847a.setText(getString(R.string.loginWithEmail));
        }
        yp.f fVar2 = this.f11328x;
        if (fVar2 != null) {
            fVar2.f38772g.setVisibility(8);
            fVar2.f38777l.setVisibility(8);
            fVar2.f38782q.setVisibility(8);
            fVar2.f38780o.setText(getString(R.string.loginSignUpRoute));
            fVar2.f38781p.setText(getString(R.string.loginSignUpRoute));
            m mVar6 = (m) fVar2.f38775j;
            mVar6.f38868e.setVisibility(8);
            yp.l lVar13 = (yp.l) fVar2.f38774i;
            lVar13.f38854i.setVisibility(8);
            mVar6.f38872j.setText(getString(R.string.loginWithPhoneUnderline));
            mVar6.f38873k.setText(getString(R.string.loginPhoneTitle));
            mVar6.f38864a.setText(getString(R.string.loginWithPhone));
            lVar13.r.setText(getString(R.string.loginWithEmailUnderline));
            lVar13.f38863s.setText(getString(R.string.loginEmailTitle));
            lVar13.f38847a.setText(getString(R.string.loginWithEmail));
        }
        yp.g gVar = this.f11329y;
        if (gVar != null) {
            gVar.f38787e.setVisibility(8);
            gVar.f38791j.setVisibility(8);
            gVar.f38798q.setVisibility(8);
            gVar.f38795n.setText(getString(R.string.loginSignUpRoute));
            gVar.f38796o.setText(getString(R.string.loginSignUpRoute));
            yp.l lVar14 = gVar.f38789h;
            lVar14.f38854i.setVisibility(8);
            lVar14.r.setText(getString(R.string.loginWithEmailUnderline));
            lVar14.f38863s.setText(getString(R.string.loginEmailTitle));
            lVar14.f38847a.setText(getString(R.string.depressionMasteryShowCTA));
        }
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString(SessionManager.KEY_EMAIL)) != null) {
            ExpandedState expandedState = null;
            if (n.B0(string)) {
                string = null;
            }
            if (string != null) {
                yp.f fVar3 = this.f11327w;
                if (fVar3 != null && (lVar11 = (yp.l) fVar3.f38774i) != null && (robertoEditText3 = lVar11.f38848b) != null) {
                    robertoEditText3.setText(string);
                    robertoEditText3.setEnabled(false);
                }
                yp.f fVar4 = this.f11328x;
                if (fVar4 != null && (lVar10 = (yp.l) fVar4.f38774i) != null && (robertoEditText2 = lVar10.f38848b) != null) {
                    robertoEditText2.setText(string);
                    robertoEditText2.setEnabled(false);
                }
                yp.g gVar2 = this.f11329y;
                if (gVar2 != null && (lVar9 = gVar2.f38789h) != null && (robertoEditText = lVar9.f38848b) != null) {
                    robertoEditText.setText(string);
                    robertoEditText.setEnabled(false);
                }
                this.f11330z = true;
                ReworkLoginState d10 = J().B.d();
                if (d10 != null) {
                    expandedState = d10.getExpandedState();
                }
                if (expandedState == ExpandedState.ALL_COLLAPSED) {
                    K(new ReworkLoginState(ExpandedState.BOTTOM_EXPANDED, null, null, null, false, null, null, false, 254, null));
                }
            }
        }
        yp.f fVar5 = this.f11327w;
        if (fVar5 != null && (mVar4 = (m) fVar5.f38775j) != null && (robertoButton5 = mVar4.f38864a) != null) {
            robertoButton5.setOnClickListener(new gn.b(this, 0));
        }
        yp.f fVar6 = this.f11327w;
        if (fVar6 != null && (mVar3 = (m) fVar6.f38775j) != null && (robertoTextView13 = mVar3.f38872j) != null) {
            robertoTextView13.setOnClickListener(new gn.b(this, 11));
        }
        yp.f fVar7 = this.f11327w;
        if (fVar7 != null && (lVar8 = (yp.l) fVar7.f38774i) != null && (robertoButton4 = lVar8.f38847a) != null) {
            robertoButton4.setOnClickListener(new gn.b(this, 19));
        }
        yp.f fVar8 = this.f11327w;
        if (fVar8 != null && (lVar7 = (yp.l) fVar8.f38774i) != null && (robertoTextView12 = lVar7.r) != null) {
            robertoTextView12.setOnClickListener(new gn.b(this, 20));
        }
        yp.f fVar9 = this.f11327w;
        if (fVar9 != null && (appCompatImageButton4 = (AppCompatImageButton) fVar9.f38770d) != null) {
            appCompatImageButton4.setOnClickListener(new gn.b(this, 21));
        }
        yp.f fVar10 = this.f11327w;
        if (fVar10 != null && (appCompatImageButton3 = (AppCompatImageButton) fVar10.f38769c) != null) {
            appCompatImageButton3.setOnClickListener(new gn.b(this, 22));
        }
        yp.f fVar11 = this.f11327w;
        if (fVar11 != null && (constraintLayout4 = fVar11.f38771e) != null) {
            constraintLayout4.setOnClickListener(new gn.b(this, 23));
        }
        yp.f fVar12 = this.f11327w;
        if (fVar12 != null && (robertoTextView11 = fVar12.f38780o) != null) {
            robertoTextView11.setOnClickListener(new gn.b(this, 24));
        }
        yp.f fVar13 = this.f11327w;
        if (fVar13 != null && (robertoTextView10 = fVar13.f38781p) != null) {
            robertoTextView10.setOnClickListener(new gn.b(this, 25));
        }
        yp.f fVar14 = this.f11327w;
        if (fVar14 != null && (lVar6 = (yp.l) fVar14.f38774i) != null && (robertoTextView9 = lVar6.f38856k) != null) {
            robertoTextView9.setOnClickListener(new gn.b(this, 26));
        }
        yp.f fVar15 = this.f11328x;
        if (fVar15 != null && (mVar2 = (m) fVar15.f38775j) != null && (robertoButton3 = mVar2.f38864a) != null) {
            robertoButton3.setOnClickListener(new gn.b(this, 1));
        }
        yp.f fVar16 = this.f11328x;
        if (fVar16 != null && (mVar = (m) fVar16.f38775j) != null && (robertoTextView8 = mVar.f38872j) != null) {
            robertoTextView8.setOnClickListener(new gn.b(this, 2));
        }
        yp.f fVar17 = this.f11328x;
        if (fVar17 != null && (lVar5 = (yp.l) fVar17.f38774i) != null && (robertoButton2 = lVar5.f38847a) != null) {
            robertoButton2.setOnClickListener(new gn.b(this, 3));
        }
        yp.f fVar18 = this.f11328x;
        if (fVar18 != null && (lVar4 = (yp.l) fVar18.f38774i) != null && (robertoTextView7 = lVar4.r) != null) {
            robertoTextView7.setOnClickListener(new gn.b(this, 4));
        }
        yp.f fVar19 = this.f11328x;
        if (fVar19 != null && (appCompatImageButton2 = (AppCompatImageButton) fVar19.f38770d) != null) {
            appCompatImageButton2.setOnClickListener(new gn.b(this, 5));
        }
        yp.f fVar20 = this.f11328x;
        if (fVar20 != null && (appCompatImageButton = (AppCompatImageButton) fVar20.f38769c) != null) {
            appCompatImageButton.setOnClickListener(new gn.b(this, 6));
        }
        yp.f fVar21 = this.f11328x;
        if (fVar21 != null && (constraintLayout3 = fVar21.f38771e) != null) {
            constraintLayout3.setOnClickListener(new gn.b(this, 7));
        }
        yp.f fVar22 = this.f11328x;
        if (fVar22 != null && (robertoTextView6 = fVar22.f38780o) != null) {
            robertoTextView6.setOnClickListener(new gn.b(this, 8));
        }
        yp.f fVar23 = this.f11328x;
        if (fVar23 != null && (robertoTextView5 = fVar23.f38781p) != null) {
            robertoTextView5.setOnClickListener(new gn.b(this, 9));
        }
        yp.f fVar24 = this.f11328x;
        if (fVar24 != null && (lVar3 = (yp.l) fVar24.f38774i) != null && (robertoTextView4 = lVar3.f38856k) != null) {
            robertoTextView4.setOnClickListener(new gn.b(this, 10));
        }
        yp.g gVar3 = this.f11329y;
        if (gVar3 != null && (lVar2 = gVar3.f38789h) != null && (robertoButton = lVar2.f38847a) != null) {
            robertoButton.setOnClickListener(new gn.b(this, 12));
        }
        yp.g gVar4 = this.f11329y;
        if (gVar4 != null && (constraintLayout2 = gVar4.f38785c) != null) {
            constraintLayout2.setOnClickListener(new gn.b(this, 13));
        }
        yp.g gVar5 = this.f11329y;
        if (gVar5 != null && (constraintLayout = gVar5.f38784b) != null) {
            constraintLayout.setOnClickListener(new gn.b(this, 14));
        }
        yp.g gVar6 = this.f11329y;
        if (gVar6 != null && (view2 = gVar6.f38800t) != null) {
            view2.setOnClickListener(new gn.b(this, 15));
        }
        yp.g gVar7 = this.f11329y;
        if (gVar7 != null && (robertoTextView3 = gVar7.f38795n) != null) {
            robertoTextView3.setOnClickListener(new gn.b(this, 16));
        }
        yp.g gVar8 = this.f11329y;
        if (gVar8 != null && (robertoTextView2 = gVar8.f38796o) != null) {
            robertoTextView2.setOnClickListener(new gn.b(this, 17));
        }
        yp.g gVar9 = this.f11329y;
        if (gVar9 != null && (lVar = gVar9.f38789h) != null && (robertoTextView = lVar.f38856k) != null) {
            robertoTextView.setOnClickListener(new gn.b(this, 18));
        }
    }
}
