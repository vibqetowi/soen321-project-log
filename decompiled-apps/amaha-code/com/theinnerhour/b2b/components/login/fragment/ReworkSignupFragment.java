package com.theinnerhour.b2b.components.login.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import com.bumptech.glide.Glide;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.WebviewActivity;
import com.theinnerhour.b2b.components.login.activity.LoginSignupReworkActivity;
import com.theinnerhour.b2b.components.login.fragment.ReworkSignupFragment;
import com.theinnerhour.b2b.components.login.model.ExpandedState;
import com.theinnerhour.b2b.components.login.model.LoginSignupFlow;
import com.theinnerhour.b2b.components.login.model.ReworkSignupEvents;
import com.theinnerhour.b2b.components.login.model.ReworkSignupState;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g6.x;
import gn.r;
import gn.s;
import gn.t;
import gn.v;
import gn.w;
import h5.h;
import h5.z;
import hn.q;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.y;
import pl.w0;
import q.d;
import ss.l;
import yp.m;
/* compiled from: ReworkSignupFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/login/fragment/ReworkSignupFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReworkSignupFragment extends Fragment {
    public static final /* synthetic */ int C = 0;

    /* renamed from: w  reason: collision with root package name */
    public yp.f f11344w;

    /* renamed from: x  reason: collision with root package name */
    public yp.f f11345x;

    /* renamed from: y  reason: collision with root package name */
    public yp.g f11346y;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f11342u = LogHelper.INSTANCE.makeLogTag("ReworkSignupFragment");

    /* renamed from: v  reason: collision with root package name */
    public final m0 f11343v = b0.j(this, y.a(q.class), new h(this), new i(this), new j(this));

    /* renamed from: z  reason: collision with root package name */
    public final hs.i f11347z = sp.b.O(new f());
    public boolean A = true;

    /* compiled from: ReworkSignupFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11348a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f11349b;

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
            f11348a = iArr;
            int[] iArr2 = new int[LoginSignupFlow.values().length];
            try {
                iArr2[LoginSignupFlow.SIGN_UP_GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LoginSignupFlow.SIGN_UP_FACEBOOK.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f11349b = iArr2;
        }
    }

    /* compiled from: ReworkSignupFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements l<ReworkSignupState, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ q f11350u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ReworkSignupFragment f11351v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q qVar, ReworkSignupFragment reworkSignupFragment) {
            super(1);
            this.f11350u = qVar;
            this.f11351v = reworkSignupFragment;
        }

        @Override // ss.l
        public final hs.k invoke(ReworkSignupState reworkSignupState) {
            LinearLayout linearLayout;
            ConstraintLayout constraintLayout;
            RobertoTextView robertoTextView;
            int i6;
            yp.l lVar;
            yp.g gVar;
            yp.l lVar2;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
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
            int i18;
            int i19;
            LinearLayout linearLayout2;
            ConstraintLayout constraintLayout3;
            RobertoTextView robertoTextView8;
            int i20;
            yp.l lVar5;
            m mVar;
            yp.l lVar6;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            m mVar2;
            yp.l lVar7;
            m mVar3;
            int i29;
            int i30;
            yp.l lVar8;
            m mVar4;
            ConstraintLayout constraintLayout4;
            RobertoTextView robertoTextView9;
            RobertoTextView robertoTextView10;
            RobertoTextView robertoTextView11;
            RobertoTextView robertoTextView12;
            AppCompatImageView appCompatImageView3;
            yp.l lVar9;
            int i31;
            int i32;
            LinearLayout linearLayout3;
            ConstraintLayout constraintLayout5;
            RobertoTextView robertoTextView13;
            int i33;
            yp.l lVar10;
            m mVar5;
            yp.l lVar11;
            m mVar6;
            int i34;
            int i35;
            yp.l lVar12;
            int i36;
            int i37;
            int i38;
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            m mVar7;
            yp.l lVar13;
            m mVar8;
            ConstraintLayout constraintLayout6;
            RobertoTextView robertoTextView14;
            RobertoTextView robertoTextView15;
            RobertoTextView robertoTextView16;
            RobertoTextView robertoTextView17;
            AppCompatImageView appCompatImageView4;
            yp.l lVar14;
            int i44;
            int i45;
            ReworkSignupState reworkSignupState2 = reworkSignupState;
            if (reworkSignupState2 != null) {
                q qVar = this.f11350u;
                boolean b10 = kotlin.jvm.internal.i.b(qVar.f17890b0, "variant_a");
                int i46 = 8;
                String str = "";
                RobertoTextView robertoTextView18 = null;
                ReworkSignupFragment reworkSignupFragment = this.f11351v;
                if (b10) {
                    yp.f fVar = reworkSignupFragment.f11344w;
                    if (fVar != null) {
                        linearLayout3 = (LinearLayout) fVar.f38776k;
                    } else {
                        linearLayout3 = null;
                    }
                    if (linearLayout3 != null) {
                        if (reworkSignupState2.isShowSocialOptions()) {
                            i45 = 0;
                        } else {
                            i45 = 8;
                        }
                        linearLayout3.setVisibility(i45);
                    }
                    if (reworkSignupState2.getBrandingInfo().f19464u.booleanValue()) {
                        yp.f fVar2 = reworkSignupFragment.f11344w;
                        if (fVar2 != null) {
                            constraintLayout6 = fVar2.f;
                        } else {
                            constraintLayout6 = null;
                        }
                        if (constraintLayout6 != null) {
                            constraintLayout6.setVisibility(0);
                        }
                        yp.f fVar3 = reworkSignupFragment.f11344w;
                        if (fVar3 != null) {
                            robertoTextView14 = fVar3.f38780o;
                        } else {
                            robertoTextView14 = null;
                        }
                        if (robertoTextView14 != null) {
                            robertoTextView14.setVisibility(8);
                        }
                        yp.f fVar4 = reworkSignupFragment.f11344w;
                        if (fVar4 != null) {
                            robertoTextView15 = fVar4.f38781p;
                        } else {
                            robertoTextView15 = null;
                        }
                        if (robertoTextView15 != null) {
                            if (reworkSignupState2.isDisableLogin()) {
                                i44 = 8;
                            } else {
                                i44 = 0;
                            }
                            robertoTextView15.setVisibility(i44);
                        }
                        yp.f fVar5 = reworkSignupFragment.f11344w;
                        if (fVar5 != null && (lVar14 = (yp.l) fVar5.f38774i) != null) {
                            robertoTextView16 = lVar14.f38863s;
                        } else {
                            robertoTextView16 = null;
                        }
                        if (robertoTextView16 != null) {
                            robertoTextView16.setVisibility(8);
                        }
                        yp.f fVar6 = reworkSignupFragment.f11344w;
                        if (fVar6 != null && (appCompatImageView4 = fVar6.f38773h) != null) {
                            Glide.g(reworkSignupFragment.requireContext()).p(reworkSignupState2.getBrandingInfo().f19465v).B(appCompatImageView4);
                        }
                        hs.f<String, String> signupTextOverride = reworkSignupState2.getSignupTextOverride();
                        if (signupTextOverride != null) {
                            String str2 = signupTextOverride.f19464u;
                            if (str2 != null) {
                                yp.f fVar7 = reworkSignupFragment.f11344w;
                                if (fVar7 != null) {
                                    robertoTextView17 = fVar7.f38779n;
                                } else {
                                    robertoTextView17 = null;
                                }
                                if (robertoTextView17 != null) {
                                    robertoTextView17.setText(str2);
                                }
                            }
                            String str3 = signupTextOverride.f19465v;
                            if (str3 != null) {
                                yp.f fVar8 = reworkSignupFragment.f11344w;
                                if (fVar8 != null) {
                                    robertoTextView18 = fVar8.f38778m;
                                }
                                if (robertoTextView18 != null) {
                                    robertoTextView18.setText(str3);
                                }
                            }
                        }
                    } else {
                        yp.f fVar9 = reworkSignupFragment.f11344w;
                        if (fVar9 != null) {
                            constraintLayout5 = fVar9.f;
                        } else {
                            constraintLayout5 = null;
                        }
                        if (constraintLayout5 != null) {
                            constraintLayout5.setVisibility(8);
                        }
                        yp.f fVar10 = reworkSignupFragment.f11344w;
                        if (fVar10 != null) {
                            robertoTextView13 = fVar10.f38780o;
                        } else {
                            robertoTextView13 = null;
                        }
                        if (robertoTextView13 != null) {
                            if (reworkSignupState2.isDisableLogin()) {
                                i33 = 8;
                            } else {
                                i33 = 0;
                            }
                            robertoTextView13.setVisibility(i33);
                        }
                        yp.f fVar11 = reworkSignupFragment.f11344w;
                        if (fVar11 != null) {
                            robertoTextView18 = fVar11.f38781p;
                        }
                        if (robertoTextView18 != null) {
                            robertoTextView18.setVisibility(8);
                        }
                    }
                    yp.f fVar12 = reworkSignupFragment.f11344w;
                    if (fVar12 != null && (mVar8 = (m) fVar12.f38775j) != null) {
                        String phoneNameInputError = reworkSignupState2.getPhoneNameInputError();
                        if (phoneNameInputError == null) {
                            phoneNameInputError = "";
                        }
                        mVar8.f38870h.setText(phoneNameInputError);
                        String phoneInputError = reworkSignupState2.getPhoneInputError();
                        if (phoneInputError == null) {
                            phoneInputError = "";
                        }
                        mVar8.f38871i.setText(phoneInputError);
                    }
                    yp.f fVar13 = reworkSignupFragment.f11344w;
                    if (fVar13 != null && (lVar13 = (yp.l) fVar13.f38774i) != null) {
                        String emailNameInputError = reworkSignupState2.getEmailNameInputError();
                        if (emailNameInputError == null) {
                            emailNameInputError = "";
                        }
                        lVar13.f38858m.setText(emailNameInputError);
                        String emailInputError = reworkSignupState2.getEmailInputError();
                        if (emailInputError == null) {
                            emailInputError = "";
                        }
                        lVar13.f38857l.setText(emailInputError);
                        String passwordInputError = reworkSignupState2.getPasswordInputError();
                        if (passwordInputError != null) {
                            str = passwordInputError;
                        }
                        lVar13.f38859n.setText(str);
                    }
                    int i47 = a.f11348a[reworkSignupState2.getExpandedState().ordinal()];
                    if (i47 != 1) {
                        if (i47 != 2) {
                            if (i47 == 3) {
                                yp.f fVar14 = reworkSignupFragment.f11344w;
                                if (fVar14 != null && (mVar7 = (m) fVar14.f38775j) != null) {
                                    mVar7.f38867d.setVisibility(0);
                                    mVar7.f38872j.setVisibility(0);
                                    mVar7.f38873k.setVisibility(8);
                                    mVar7.f38868e.setVisibility(8);
                                    mVar7.f38870h.setVisibility(8);
                                    mVar7.f38869g.setVisibility(8);
                                    mVar7.f.setVisibility(8);
                                    mVar7.f38871i.setVisibility(8);
                                    mVar7.f38864a.setVisibility(8);
                                }
                                yp.f fVar15 = reworkSignupFragment.f11344w;
                                if (fVar15 != null && (lVar12 = (yp.l) fVar15.f38774i) != null) {
                                    lVar12.f38852g.setVisibility(8);
                                    lVar12.r.setVisibility(8);
                                    if (!reworkSignupState2.getBrandingInfo().f19464u.booleanValue()) {
                                        i36 = 0;
                                    } else {
                                        i36 = 8;
                                    }
                                    lVar12.f38863s.setVisibility(i36);
                                    lVar12.f38854i.setVisibility(0);
                                    if (reworkSignupState2.getEmailNameInputError() != null) {
                                        i37 = 0;
                                    } else {
                                        i37 = 8;
                                    }
                                    lVar12.f38858m.setVisibility(i37);
                                    lVar12.f38853h.setVisibility(0);
                                    if (reworkSignupState2.getEmailInputError() != null) {
                                        i38 = 0;
                                    } else {
                                        i38 = 8;
                                    }
                                    lVar12.f38857l.setVisibility(i38);
                                    lVar12.f38855j.setVisibility(0);
                                    if (reworkSignupState2.getPasswordInputError() != null) {
                                        i39 = 0;
                                    } else {
                                        i39 = 8;
                                    }
                                    lVar12.f38859n.setVisibility(i39);
                                    if (reworkSignupState2.isEnforcePasswordRules()) {
                                        i40 = 0;
                                    } else {
                                        i40 = 8;
                                    }
                                    lVar12.f38862q.setVisibility(i40);
                                    if (reworkSignupState2.isEnforcePasswordRules()) {
                                        i41 = 0;
                                    } else {
                                        i41 = 8;
                                    }
                                    RobertoTextView robertoTextView19 = lVar12.f38860o;
                                    robertoTextView19.setVisibility(i41);
                                    if (reworkSignupState2.isEnforcePasswordRules()) {
                                        i42 = 0;
                                    } else {
                                        i42 = 8;
                                    }
                                    RobertoTextView robertoTextView20 = lVar12.f38861p;
                                    robertoTextView20.setVisibility(i42);
                                    if (reworkSignupState2.isPasswordCaseRequirementFulfilled()) {
                                        i43 = 0;
                                    } else {
                                        i43 = 8;
                                    }
                                    lVar12.f38851e.setVisibility(i43);
                                    if (reworkSignupState2.isPasswordCharacterRequirementFulfilled()) {
                                        i46 = 0;
                                    }
                                    lVar12.f.setVisibility(i46);
                                    String string = reworkSignupFragment.getString(R.string.depressionMasteryShowCTA);
                                    RobertoButton robertoButton = lVar12.f38847a;
                                    robertoButton.setText(string);
                                    if (reworkSignupState2.isPasswordCaseRequirementFulfilled()) {
                                        robertoTextView19.setPaintFlags(robertoTextView19.getPaintFlags() | 16);
                                    } else {
                                        robertoTextView19.setPaintFlags(robertoTextView19.getPaintFlags() & (-17));
                                    }
                                    if (reworkSignupState2.isPasswordCharacterRequirementFulfilled()) {
                                        robertoTextView20.setPaintFlags(robertoTextView20.getPaintFlags() | 16);
                                    } else {
                                        robertoTextView20.setPaintFlags(robertoTextView20.getPaintFlags() & (-17));
                                    }
                                    robertoButton.setVisibility(0);
                                    if (reworkSignupState2.isEnforcePasswordRules() && reworkSignupFragment.A) {
                                        reworkSignupFragment.O();
                                    }
                                }
                            }
                        } else {
                            yp.f fVar16 = reworkSignupFragment.f11344w;
                            if (fVar16 != null && (mVar6 = (m) fVar16.f38775j) != null) {
                                mVar6.f38867d.setVisibility(8);
                                mVar6.f38872j.setVisibility(8);
                                mVar6.f38873k.setVisibility(0);
                                mVar6.f38868e.setVisibility(0);
                                if (reworkSignupState2.getPhoneNameInputError() != null) {
                                    i34 = 0;
                                } else {
                                    i34 = 8;
                                }
                                mVar6.f38870h.setVisibility(i34);
                                mVar6.f38869g.setVisibility(0);
                                mVar6.f.setVisibility(0);
                                if (reworkSignupState2.getPhoneInputError() != null) {
                                    i35 = 0;
                                } else {
                                    i35 = 8;
                                }
                                mVar6.f38871i.setVisibility(i35);
                                RobertoButton robertoButton2 = mVar6.f38864a;
                                robertoButton2.setVisibility(0);
                                robertoButton2.setText(reworkSignupFragment.getString(R.string.depressionMasteryShowCTA));
                            }
                            yp.f fVar17 = reworkSignupFragment.f11344w;
                            if (fVar17 != null && (lVar11 = (yp.l) fVar17.f38774i) != null) {
                                lVar11.f38852g.setVisibility(0);
                                lVar11.r.setVisibility(0);
                                lVar11.f38863s.setVisibility(8);
                                lVar11.f38854i.setVisibility(8);
                                lVar11.f38858m.setVisibility(8);
                                lVar11.f38853h.setVisibility(8);
                                lVar11.f38857l.setVisibility(8);
                                lVar11.f38855j.setVisibility(8);
                                lVar11.f38859n.setVisibility(8);
                                lVar11.f38862q.setVisibility(8);
                                lVar11.f38860o.setVisibility(8);
                                lVar11.f38851e.setVisibility(8);
                                lVar11.f38861p.setVisibility(8);
                                lVar11.f.setVisibility(8);
                                lVar11.f38847a.setVisibility(8);
                            }
                        }
                    } else {
                        yp.f fVar18 = reworkSignupFragment.f11344w;
                        if (fVar18 != null && (mVar5 = (m) fVar18.f38775j) != null) {
                            mVar5.f38867d.setVisibility(0);
                            mVar5.f38872j.setVisibility(0);
                            mVar5.f38873k.setVisibility(8);
                            mVar5.f38868e.setVisibility(8);
                            mVar5.f38870h.setVisibility(8);
                            mVar5.f38869g.setVisibility(8);
                            mVar5.f.setVisibility(8);
                            mVar5.f38871i.setVisibility(8);
                            mVar5.f38864a.setVisibility(8);
                        }
                        yp.f fVar19 = reworkSignupFragment.f11344w;
                        if (fVar19 != null && (lVar10 = (yp.l) fVar19.f38774i) != null) {
                            lVar10.f38852g.setVisibility(8);
                            lVar10.r.setVisibility(8);
                            lVar10.f38863s.setVisibility(8);
                            lVar10.f38854i.setVisibility(8);
                            lVar10.f38858m.setVisibility(8);
                            lVar10.f38853h.setVisibility(8);
                            lVar10.f38857l.setVisibility(8);
                            lVar10.f38855j.setVisibility(8);
                            lVar10.f38859n.setVisibility(8);
                            lVar10.f38862q.setVisibility(8);
                            lVar10.f38860o.setVisibility(8);
                            lVar10.f38851e.setVisibility(8);
                            lVar10.f38861p.setVisibility(8);
                            lVar10.f.setVisibility(8);
                            lVar10.f38847a.setVisibility(0);
                        }
                    }
                } else if (kotlin.jvm.internal.i.b(qVar.f17890b0, "variant_b")) {
                    yp.f fVar20 = reworkSignupFragment.f11345x;
                    if (fVar20 != null) {
                        linearLayout2 = (LinearLayout) fVar20.f38776k;
                    } else {
                        linearLayout2 = null;
                    }
                    if (linearLayout2 != null) {
                        if (reworkSignupState2.isShowSocialOptions()) {
                            i32 = 0;
                        } else {
                            i32 = 8;
                        }
                        linearLayout2.setVisibility(i32);
                    }
                    if (reworkSignupState2.getBrandingInfo().f19464u.booleanValue()) {
                        yp.f fVar21 = reworkSignupFragment.f11345x;
                        if (fVar21 != null) {
                            constraintLayout4 = fVar21.f;
                        } else {
                            constraintLayout4 = null;
                        }
                        if (constraintLayout4 != null) {
                            constraintLayout4.setVisibility(0);
                        }
                        yp.f fVar22 = reworkSignupFragment.f11345x;
                        if (fVar22 != null) {
                            robertoTextView9 = fVar22.f38780o;
                        } else {
                            robertoTextView9 = null;
                        }
                        if (robertoTextView9 != null) {
                            robertoTextView9.setVisibility(8);
                        }
                        yp.f fVar23 = reworkSignupFragment.f11345x;
                        if (fVar23 != null) {
                            robertoTextView10 = fVar23.f38781p;
                        } else {
                            robertoTextView10 = null;
                        }
                        if (robertoTextView10 != null) {
                            if (reworkSignupState2.isDisableLogin()) {
                                i31 = 8;
                            } else {
                                i31 = 0;
                            }
                            robertoTextView10.setVisibility(i31);
                        }
                        yp.f fVar24 = reworkSignupFragment.f11345x;
                        if (fVar24 != null && (lVar9 = (yp.l) fVar24.f38774i) != null) {
                            robertoTextView11 = lVar9.f38863s;
                        } else {
                            robertoTextView11 = null;
                        }
                        if (robertoTextView11 != null) {
                            robertoTextView11.setVisibility(8);
                        }
                        yp.f fVar25 = reworkSignupFragment.f11345x;
                        if (fVar25 != null && (appCompatImageView3 = fVar25.f38773h) != null) {
                            Glide.g(reworkSignupFragment.requireContext()).p(reworkSignupState2.getBrandingInfo().f19465v).B(appCompatImageView3);
                        }
                        hs.f<String, String> signupTextOverride2 = reworkSignupState2.getSignupTextOverride();
                        if (signupTextOverride2 != null) {
                            String str4 = signupTextOverride2.f19464u;
                            if (str4 != null) {
                                yp.f fVar26 = reworkSignupFragment.f11345x;
                                if (fVar26 != null) {
                                    robertoTextView12 = fVar26.f38779n;
                                } else {
                                    robertoTextView12 = null;
                                }
                                if (robertoTextView12 != null) {
                                    robertoTextView12.setText(str4);
                                }
                            }
                            String str5 = signupTextOverride2.f19465v;
                            if (str5 != null) {
                                yp.f fVar27 = reworkSignupFragment.f11345x;
                                if (fVar27 != null) {
                                    robertoTextView18 = fVar27.f38778m;
                                }
                                if (robertoTextView18 != null) {
                                    robertoTextView18.setText(str5);
                                }
                            }
                        }
                    } else {
                        yp.f fVar28 = reworkSignupFragment.f11345x;
                        if (fVar28 != null) {
                            constraintLayout3 = fVar28.f;
                        } else {
                            constraintLayout3 = null;
                        }
                        if (constraintLayout3 != null) {
                            constraintLayout3.setVisibility(8);
                        }
                        yp.f fVar29 = reworkSignupFragment.f11345x;
                        if (fVar29 != null) {
                            robertoTextView8 = fVar29.f38780o;
                        } else {
                            robertoTextView8 = null;
                        }
                        if (robertoTextView8 != null) {
                            if (reworkSignupState2.isDisableLogin()) {
                                i20 = 8;
                            } else {
                                i20 = 0;
                            }
                            robertoTextView8.setVisibility(i20);
                        }
                        yp.f fVar30 = reworkSignupFragment.f11345x;
                        if (fVar30 != null) {
                            robertoTextView18 = fVar30.f38781p;
                        }
                        if (robertoTextView18 != null) {
                            robertoTextView18.setVisibility(8);
                        }
                    }
                    yp.f fVar31 = reworkSignupFragment.f11345x;
                    if (fVar31 != null && (mVar4 = (m) fVar31.f38775j) != null) {
                        String phoneNameInputError2 = reworkSignupState2.getPhoneNameInputError();
                        if (phoneNameInputError2 == null) {
                            phoneNameInputError2 = "";
                        }
                        mVar4.f38870h.setText(phoneNameInputError2);
                        String phoneInputError2 = reworkSignupState2.getPhoneInputError();
                        if (phoneInputError2 == null) {
                            phoneInputError2 = "";
                        }
                        mVar4.f38871i.setText(phoneInputError2);
                    }
                    yp.f fVar32 = reworkSignupFragment.f11345x;
                    if (fVar32 != null && (lVar8 = (yp.l) fVar32.f38774i) != null) {
                        String emailNameInputError2 = reworkSignupState2.getEmailNameInputError();
                        if (emailNameInputError2 == null) {
                            emailNameInputError2 = "";
                        }
                        lVar8.f38858m.setText(emailNameInputError2);
                        String emailInputError2 = reworkSignupState2.getEmailInputError();
                        if (emailInputError2 == null) {
                            emailInputError2 = "";
                        }
                        lVar8.f38857l.setText(emailInputError2);
                        String passwordInputError2 = reworkSignupState2.getPasswordInputError();
                        if (passwordInputError2 != null) {
                            str = passwordInputError2;
                        }
                        lVar8.f38859n.setText(str);
                    }
                    int i48 = a.f11348a[reworkSignupState2.getExpandedState().ordinal()];
                    if (i48 != 1) {
                        if (i48 != 2) {
                            if (i48 == 3) {
                                yp.f fVar33 = reworkSignupFragment.f11345x;
                                if (fVar33 != null && (mVar3 = (m) fVar33.f38775j) != null) {
                                    mVar3.f38867d.setVisibility(8);
                                    mVar3.f38872j.setVisibility(8);
                                    mVar3.f38873k.setVisibility(0);
                                    mVar3.f38868e.setVisibility(0);
                                    if (reworkSignupState2.getPhoneNameInputError() != null) {
                                        i29 = 0;
                                    } else {
                                        i29 = 8;
                                    }
                                    mVar3.f38870h.setVisibility(i29);
                                    mVar3.f38869g.setVisibility(0);
                                    mVar3.f.setVisibility(0);
                                    if (reworkSignupState2.getPhoneInputError() != null) {
                                        i30 = 0;
                                    } else {
                                        i30 = 8;
                                    }
                                    mVar3.f38871i.setVisibility(i30);
                                    RobertoButton robertoButton3 = mVar3.f38864a;
                                    robertoButton3.setVisibility(0);
                                    robertoButton3.setText(reworkSignupFragment.getString(R.string.depressionMasteryShowCTA));
                                }
                                yp.f fVar34 = reworkSignupFragment.f11345x;
                                if (fVar34 != null && (lVar7 = (yp.l) fVar34.f38774i) != null) {
                                    lVar7.f38852g.setVisibility(0);
                                    lVar7.r.setVisibility(0);
                                    lVar7.f38863s.setVisibility(8);
                                    lVar7.f38854i.setVisibility(8);
                                    lVar7.f38858m.setVisibility(8);
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
                                }
                            }
                        } else {
                            yp.f fVar35 = reworkSignupFragment.f11345x;
                            if (fVar35 != null && (mVar2 = (m) fVar35.f38775j) != null) {
                                mVar2.f38867d.setVisibility(0);
                                mVar2.f38872j.setVisibility(0);
                                mVar2.f38873k.setVisibility(8);
                                mVar2.f38868e.setVisibility(8);
                                mVar2.f38870h.setVisibility(8);
                                mVar2.f38869g.setVisibility(8);
                                mVar2.f.setVisibility(8);
                                mVar2.f38871i.setVisibility(8);
                                mVar2.f38864a.setVisibility(8);
                            }
                            yp.f fVar36 = reworkSignupFragment.f11345x;
                            if (fVar36 != null && (lVar6 = (yp.l) fVar36.f38774i) != null) {
                                lVar6.f38852g.setVisibility(8);
                                lVar6.r.setVisibility(8);
                                if (!reworkSignupState2.getBrandingInfo().f19464u.booleanValue()) {
                                    i21 = 0;
                                } else {
                                    i21 = 8;
                                }
                                lVar6.f38863s.setVisibility(i21);
                                lVar6.f38854i.setVisibility(0);
                                if (reworkSignupState2.getEmailNameInputError() != null) {
                                    i22 = 0;
                                } else {
                                    i22 = 8;
                                }
                                lVar6.f38858m.setVisibility(i22);
                                lVar6.f38853h.setVisibility(0);
                                if (reworkSignupState2.getEmailInputError() != null) {
                                    i23 = 0;
                                } else {
                                    i23 = 8;
                                }
                                lVar6.f38857l.setVisibility(i23);
                                lVar6.f38855j.setVisibility(0);
                                if (reworkSignupState2.getPasswordInputError() != null) {
                                    i24 = 0;
                                } else {
                                    i24 = 8;
                                }
                                lVar6.f38859n.setVisibility(i24);
                                if (reworkSignupState2.isEnforcePasswordRules()) {
                                    i25 = 0;
                                } else {
                                    i25 = 8;
                                }
                                lVar6.f38862q.setVisibility(i25);
                                if (reworkSignupState2.isEnforcePasswordRules()) {
                                    i26 = 0;
                                } else {
                                    i26 = 8;
                                }
                                RobertoTextView robertoTextView21 = lVar6.f38860o;
                                robertoTextView21.setVisibility(i26);
                                if (reworkSignupState2.isEnforcePasswordRules()) {
                                    i27 = 0;
                                } else {
                                    i27 = 8;
                                }
                                RobertoTextView robertoTextView22 = lVar6.f38861p;
                                robertoTextView22.setVisibility(i27);
                                if (reworkSignupState2.isPasswordCaseRequirementFulfilled()) {
                                    i28 = 0;
                                } else {
                                    i28 = 8;
                                }
                                lVar6.f38851e.setVisibility(i28);
                                if (reworkSignupState2.isPasswordCharacterRequirementFulfilled()) {
                                    i46 = 0;
                                }
                                lVar6.f.setVisibility(i46);
                                String string2 = reworkSignupFragment.getString(R.string.depressionMasteryShowCTA);
                                RobertoButton robertoButton4 = lVar6.f38847a;
                                robertoButton4.setText(string2);
                                if (reworkSignupState2.isPasswordCaseRequirementFulfilled()) {
                                    robertoTextView21.setPaintFlags(robertoTextView21.getPaintFlags() | 16);
                                } else {
                                    robertoTextView21.setPaintFlags(robertoTextView21.getPaintFlags() & (-17));
                                }
                                if (reworkSignupState2.isPasswordCharacterRequirementFulfilled()) {
                                    robertoTextView22.setPaintFlags(robertoTextView22.getPaintFlags() | 16);
                                } else {
                                    robertoTextView22.setPaintFlags(robertoTextView22.getPaintFlags() & (-17));
                                }
                                robertoButton4.setVisibility(0);
                                if (reworkSignupState2.isEnforcePasswordRules() && reworkSignupFragment.A) {
                                    reworkSignupFragment.O();
                                }
                            }
                        }
                    } else {
                        yp.f fVar37 = reworkSignupFragment.f11345x;
                        if (fVar37 != null && (mVar = (m) fVar37.f38775j) != null) {
                            mVar.f38867d.setVisibility(8);
                            mVar.f38872j.setVisibility(8);
                            mVar.f38873k.setVisibility(8);
                            mVar.f38868e.setVisibility(8);
                            mVar.f38870h.setVisibility(8);
                            mVar.f38869g.setVisibility(8);
                            mVar.f.setVisibility(8);
                            mVar.f38871i.setVisibility(8);
                            mVar.f38864a.setVisibility(0);
                        }
                        yp.f fVar38 = reworkSignupFragment.f11345x;
                        if (fVar38 != null && (lVar5 = (yp.l) fVar38.f38774i) != null) {
                            lVar5.f38852g.setVisibility(0);
                            lVar5.r.setVisibility(0);
                            lVar5.f38863s.setVisibility(8);
                            lVar5.f38854i.setVisibility(8);
                            lVar5.f38858m.setVisibility(8);
                            lVar5.f38853h.setVisibility(8);
                            lVar5.f38857l.setVisibility(8);
                            lVar5.f38855j.setVisibility(8);
                            lVar5.f38859n.setVisibility(8);
                            lVar5.f38862q.setVisibility(8);
                            lVar5.f38860o.setVisibility(8);
                            lVar5.f38851e.setVisibility(8);
                            lVar5.f38861p.setVisibility(8);
                            lVar5.f.setVisibility(8);
                            lVar5.f38847a.setVisibility(8);
                        }
                    }
                } else {
                    yp.g gVar2 = reworkSignupFragment.f11346y;
                    if (gVar2 != null) {
                        linearLayout = gVar2.f38790i;
                    } else {
                        linearLayout = null;
                    }
                    if (linearLayout != null) {
                        if (reworkSignupState2.isShowSocialOptions()) {
                            i19 = 0;
                        } else {
                            i19 = 8;
                        }
                        linearLayout.setVisibility(i19);
                    }
                    if (reworkSignupState2.getBrandingInfo().f19464u.booleanValue()) {
                        yp.g gVar3 = reworkSignupFragment.f11346y;
                        if (gVar3 != null) {
                            constraintLayout2 = gVar3.f38786d;
                        } else {
                            constraintLayout2 = null;
                        }
                        if (constraintLayout2 != null) {
                            constraintLayout2.setVisibility(0);
                        }
                        yp.g gVar4 = reworkSignupFragment.f11346y;
                        if (gVar4 != null) {
                            robertoTextView2 = gVar4.f38796o;
                        } else {
                            robertoTextView2 = null;
                        }
                        if (robertoTextView2 != null) {
                            if (reworkSignupState2.isDisableLogin()) {
                                i18 = 8;
                            } else {
                                i18 = 0;
                            }
                            robertoTextView2.setVisibility(i18);
                        }
                        yp.g gVar5 = reworkSignupFragment.f11346y;
                        if (gVar5 != null && (lVar4 = gVar5.f38789h) != null) {
                            robertoTextView3 = lVar4.f38863s;
                        } else {
                            robertoTextView3 = null;
                        }
                        if (robertoTextView3 != null) {
                            robertoTextView3.setVisibility(8);
                        }
                        yp.g gVar6 = reworkSignupFragment.f11346y;
                        if (gVar6 != null) {
                            robertoTextView4 = gVar6.f38795n;
                        } else {
                            robertoTextView4 = null;
                        }
                        if (robertoTextView4 != null) {
                            robertoTextView4.setVisibility(8);
                        }
                        yp.g gVar7 = reworkSignupFragment.f11346y;
                        if (gVar7 != null) {
                            robertoTextView5 = gVar7.f38797p;
                        } else {
                            robertoTextView5 = null;
                        }
                        if (robertoTextView5 != null) {
                            robertoTextView5.setVisibility(8);
                        }
                        yp.g gVar8 = reworkSignupFragment.f11346y;
                        if (gVar8 != null) {
                            appCompatImageView = gVar8.f38788g;
                        } else {
                            appCompatImageView = null;
                        }
                        if (appCompatImageView != null) {
                            appCompatImageView.setVisibility(8);
                        }
                        yp.g gVar9 = reworkSignupFragment.f11346y;
                        if (gVar9 != null) {
                            robertoTextView6 = gVar9.f38794m;
                        } else {
                            robertoTextView6 = null;
                        }
                        if (robertoTextView6 != null) {
                            robertoTextView6.setVisibility(8);
                        }
                        yp.g gVar10 = reworkSignupFragment.f11346y;
                        if (gVar10 != null) {
                            view = gVar10.r;
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            view.setVisibility(8);
                        }
                        yp.g gVar11 = reworkSignupFragment.f11346y;
                        if (gVar11 != null) {
                            view2 = gVar11.f38799s;
                        } else {
                            view2 = null;
                        }
                        if (view2 != null) {
                            view2.setVisibility(8);
                        }
                        yp.g gVar12 = reworkSignupFragment.f11346y;
                        if (gVar12 != null && (appCompatImageView2 = gVar12.f) != null) {
                            Glide.g(reworkSignupFragment.requireContext()).p(reworkSignupState2.getBrandingInfo().f19465v).B(appCompatImageView2);
                        }
                        hs.f<String, String> signupTextOverride3 = reworkSignupState2.getSignupTextOverride();
                        if (signupTextOverride3 != null) {
                            String str6 = signupTextOverride3.f19464u;
                            if (str6 != null) {
                                yp.g gVar13 = reworkSignupFragment.f11346y;
                                if (gVar13 != null) {
                                    robertoTextView7 = gVar13.f38793l;
                                } else {
                                    robertoTextView7 = null;
                                }
                                if (robertoTextView7 != null) {
                                    robertoTextView7.setText(str6);
                                }
                            }
                            String str7 = signupTextOverride3.f19465v;
                            if (str7 != null) {
                                yp.g gVar14 = reworkSignupFragment.f11346y;
                                if (gVar14 != null) {
                                    robertoTextView18 = gVar14.f38792k;
                                }
                                if (robertoTextView18 != null) {
                                    robertoTextView18.setText(str7);
                                }
                            }
                        }
                    } else {
                        yp.g gVar15 = reworkSignupFragment.f11346y;
                        if (gVar15 != null) {
                            constraintLayout = gVar15.f38786d;
                        } else {
                            constraintLayout = null;
                        }
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(8);
                        }
                        yp.g gVar16 = reworkSignupFragment.f11346y;
                        if (gVar16 != null) {
                            robertoTextView = gVar16.f38795n;
                        } else {
                            robertoTextView = null;
                        }
                        if (robertoTextView != null) {
                            if (reworkSignupState2.isDisableLogin()) {
                                i6 = 8;
                            } else {
                                i6 = 0;
                            }
                            robertoTextView.setVisibility(i6);
                        }
                        yp.g gVar17 = reworkSignupFragment.f11346y;
                        if (gVar17 != null) {
                            robertoTextView18 = gVar17.f38796o;
                        }
                        if (robertoTextView18 != null) {
                            robertoTextView18.setVisibility(8);
                        }
                    }
                    yp.g gVar18 = reworkSignupFragment.f11346y;
                    if (gVar18 != null && (lVar3 = gVar18.f38789h) != null) {
                        String emailNameInputError3 = reworkSignupState2.getEmailNameInputError();
                        if (emailNameInputError3 == null) {
                            emailNameInputError3 = "";
                        }
                        lVar3.f38858m.setText(emailNameInputError3);
                        String emailInputError3 = reworkSignupState2.getEmailInputError();
                        if (emailInputError3 == null) {
                            emailInputError3 = "";
                        }
                        lVar3.f38857l.setText(emailInputError3);
                        String passwordInputError3 = reworkSignupState2.getPasswordInputError();
                        if (passwordInputError3 != null) {
                            str = passwordInputError3;
                        }
                        lVar3.f38859n.setText(str);
                    }
                    int i49 = a.f11348a[reworkSignupState2.getExpandedState().ordinal()];
                    if (i49 != 1) {
                        if (i49 == 3 && (gVar = reworkSignupFragment.f11346y) != null && (lVar2 = gVar.f38789h) != null) {
                            lVar2.f38852g.setVisibility(8);
                            lVar2.r.setVisibility(8);
                            if (!reworkSignupState2.getBrandingInfo().f19464u.booleanValue()) {
                                i10 = 0;
                            } else {
                                i10 = 8;
                            }
                            lVar2.f38863s.setVisibility(i10);
                            lVar2.f38854i.setVisibility(0);
                            if (reworkSignupState2.getEmailNameInputError() != null) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            lVar2.f38858m.setVisibility(i11);
                            lVar2.f38853h.setVisibility(0);
                            if (reworkSignupState2.getEmailInputError() != null) {
                                i12 = 0;
                            } else {
                                i12 = 8;
                            }
                            lVar2.f38857l.setVisibility(i12);
                            lVar2.f38855j.setVisibility(0);
                            if (reworkSignupState2.getPasswordInputError() != null) {
                                i13 = 0;
                            } else {
                                i13 = 8;
                            }
                            lVar2.f38859n.setVisibility(i13);
                            if (reworkSignupState2.isEnforcePasswordRules()) {
                                i14 = 0;
                            } else {
                                i14 = 8;
                            }
                            lVar2.f38862q.setVisibility(i14);
                            if (reworkSignupState2.isEnforcePasswordRules()) {
                                i15 = 0;
                            } else {
                                i15 = 8;
                            }
                            RobertoTextView robertoTextView23 = lVar2.f38860o;
                            robertoTextView23.setVisibility(i15);
                            if (reworkSignupState2.isEnforcePasswordRules()) {
                                i16 = 0;
                            } else {
                                i16 = 8;
                            }
                            RobertoTextView robertoTextView24 = lVar2.f38861p;
                            robertoTextView24.setVisibility(i16);
                            if (reworkSignupState2.isPasswordCaseRequirementFulfilled()) {
                                i17 = 0;
                            } else {
                                i17 = 8;
                            }
                            lVar2.f38851e.setVisibility(i17);
                            if (reworkSignupState2.isPasswordCharacterRequirementFulfilled()) {
                                i46 = 0;
                            }
                            lVar2.f.setVisibility(i46);
                            if (reworkSignupState2.isPasswordCaseRequirementFulfilled()) {
                                robertoTextView23.setPaintFlags(robertoTextView23.getPaintFlags() | 16);
                            } else {
                                robertoTextView23.setPaintFlags(robertoTextView23.getPaintFlags() & (-17));
                            }
                            if (reworkSignupState2.isPasswordCharacterRequirementFulfilled()) {
                                robertoTextView24.setPaintFlags(robertoTextView24.getPaintFlags() | 16);
                            } else {
                                robertoTextView24.setPaintFlags(robertoTextView24.getPaintFlags() & (-17));
                            }
                            RobertoButton robertoButton5 = lVar2.f38847a;
                            robertoButton5.setVisibility(0);
                            robertoButton5.setText(reworkSignupFragment.getString(R.string.depressionMasteryShowCTA));
                            if (reworkSignupState2.isEnforcePasswordRules() && reworkSignupFragment.A) {
                                reworkSignupFragment.O();
                            }
                        }
                    } else {
                        yp.g gVar19 = reworkSignupFragment.f11346y;
                        if (gVar19 != null && (lVar = gVar19.f38789h) != null) {
                            lVar.f38852g.setVisibility(8);
                            lVar.r.setVisibility(8);
                            lVar.f38863s.setVisibility(8);
                            lVar.f38854i.setVisibility(8);
                            lVar.f38858m.setVisibility(8);
                            lVar.f38853h.setVisibility(8);
                            lVar.f38857l.setVisibility(8);
                            lVar.f38855j.setVisibility(8);
                            lVar.f38859n.setVisibility(8);
                            lVar.f38862q.setVisibility(8);
                            lVar.f38860o.setVisibility(8);
                            lVar.f38851e.setVisibility(8);
                            lVar.f38861p.setVisibility(8);
                            lVar.f.setVisibility(8);
                            lVar.f38847a.setVisibility(0);
                        }
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ReworkSignupFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements l<LoginSignupFlow, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(LoginSignupFlow loginSignupFlow) {
            LoginSignupFlow loginSignupFlow2 = loginSignupFlow;
            if (loginSignupFlow2 != null) {
                int i6 = ReworkSignupFragment.C;
                ReworkSignupFragment reworkSignupFragment = ReworkSignupFragment.this;
                reworkSignupFragment.getClass();
                int i10 = a.f11349b[loginSignupFlow2.ordinal()];
                LoginSignupReworkActivity loginSignupReworkActivity = null;
                if (i10 != 1) {
                    if (i10 == 2) {
                        String str = gk.a.f16573a;
                        Bundle bundle = new Bundle();
                        bundle.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                        hs.k kVar = hs.k.f19476a;
                        gk.a.b(bundle, "facebook_signup_click");
                        p requireActivity = reworkSignupFragment.requireActivity();
                        if (requireActivity instanceof LoginSignupReworkActivity) {
                            loginSignupReworkActivity = (LoginSignupReworkActivity) requireActivity;
                        }
                        if (loginSignupReworkActivity != null) {
                            loginSignupReworkActivity.n0(LoginSignupFlow.SIGN_UP_FACEBOOK);
                        }
                    }
                } else {
                    String str2 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle2, "google_signup_click");
                    p requireActivity2 = reworkSignupFragment.requireActivity();
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

    /* compiled from: ReworkSignupFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements l<Boolean, hs.k> {
        public d() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                int i6 = ReworkSignupFragment.C;
                ReworkSignupFragment reworkSignupFragment = ReworkSignupFragment.this;
                reworkSignupFragment.getClass();
                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_get_email, reworkSignupFragment.requireContext(), R.style.Theme_Dialog);
                View findViewById = styledDialog.findViewById(R.id.yes);
                kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoButton");
                ((RobertoButton) findViewById).setOnClickListener(new w0(styledDialog, 23, reworkSignupFragment));
                styledDialog.setOnDismissListener(new gn.p(reworkSignupFragment, 1));
                styledDialog.show();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ReworkSignupFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends k implements l<SingleUseEvent<? extends Boolean>, hs.k> {
        public e() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
            Boolean contentIfNotHandled;
            SingleUseEvent<? extends Boolean> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null && contentIfNotHandled.booleanValue()) {
                int i6 = ReworkSignupFragment.C;
                final ReworkSignupFragment reworkSignupFragment = ReworkSignupFragment.this;
                reworkSignupFragment.getClass();
                try {
                    u uVar = new u();
                    reworkSignupFragment.I().setCancelable(false);
                    RobertoEditText robertoEditText = (RobertoEditText) reworkSignupFragment.I().findViewById(R.id.etOTPDialog1);
                    if (robertoEditText != null) {
                        robertoEditText.setText("");
                    }
                    RobertoEditText robertoEditText2 = (RobertoEditText) reworkSignupFragment.I().findViewById(R.id.etOTPDialog2);
                    if (robertoEditText2 != null) {
                        robertoEditText2.setText("");
                    }
                    RobertoEditText robertoEditText3 = (RobertoEditText) reworkSignupFragment.I().findViewById(R.id.etOTPDialog3);
                    if (robertoEditText3 != null) {
                        robertoEditText3.setText("");
                    }
                    RobertoEditText robertoEditText4 = (RobertoEditText) reworkSignupFragment.I().findViewById(R.id.etOTPDialog4);
                    if (robertoEditText4 != null) {
                        robertoEditText4.setText("");
                    }
                    RobertoTextView robertoTextView = (RobertoTextView) reworkSignupFragment.I().findViewById(R.id.tvOTPDialogError);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(8);
                    }
                    if (!reworkSignupFragment.I().isShowing()) {
                        reworkSignupFragment.J().P.e(reworkSignupFragment.getViewLifecycleOwner(), new gn.l(2, new gn.u(reworkSignupFragment)));
                        reworkSignupFragment.J().V.e(reworkSignupFragment.getViewLifecycleOwner(), new gn.l(3, new v(reworkSignupFragment)));
                        reworkSignupFragment.J().U.e(reworkSignupFragment.getViewLifecycleOwner(), new gn.l(4, new w(reworkSignupFragment)));
                        RobertoEditText robertoEditText5 = (RobertoEditText) reworkSignupFragment.I().findViewById(R.id.etOTPDialog2);
                        if (robertoEditText5 != null) {
                            robertoEditText5.setOnKeyListener(new View.OnKeyListener() { // from class: gn.n
                                @Override // android.view.View.OnKeyListener
                                public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                                    int i11 = r2;
                                    boolean z10 = true;
                                    Editable editable = null;
                                    ReworkSignupFragment this$0 = reworkSignupFragment;
                                    switch (i11) {
                                        case 0:
                                            int i12 = ReworkSignupFragment.C;
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
                                            int i13 = ReworkSignupFragment.C;
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
                                            int i14 = ReworkSignupFragment.C;
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
                        RobertoEditText robertoEditText6 = (RobertoEditText) reworkSignupFragment.I().findViewById(R.id.etOTPDialog3);
                        if (robertoEditText6 != null) {
                            robertoEditText6.setOnKeyListener(new View.OnKeyListener() { // from class: gn.n
                                @Override // android.view.View.OnKeyListener
                                public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                                    int i11 = r2;
                                    boolean z10 = true;
                                    Editable editable = null;
                                    ReworkSignupFragment this$0 = reworkSignupFragment;
                                    switch (i11) {
                                        case 0:
                                            int i12 = ReworkSignupFragment.C;
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
                                            int i13 = ReworkSignupFragment.C;
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
                                            int i14 = ReworkSignupFragment.C;
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
                        RobertoEditText robertoEditText7 = (RobertoEditText) reworkSignupFragment.I().findViewById(R.id.etOTPDialog4);
                        if (robertoEditText7 != null) {
                            robertoEditText7.setOnKeyListener(new View.OnKeyListener() { // from class: gn.n
                                @Override // android.view.View.OnKeyListener
                                public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                                    int i11 = r2;
                                    boolean z10 = true;
                                    Editable editable = null;
                                    ReworkSignupFragment this$0 = reworkSignupFragment;
                                    switch (i11) {
                                        case 0:
                                            int i12 = ReworkSignupFragment.C;
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
                                            int i13 = ReworkSignupFragment.C;
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
                                            int i14 = ReworkSignupFragment.C;
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
                        RobertoEditText robertoEditText8 = (RobertoEditText) reworkSignupFragment.I().findViewById(R.id.etOTPDialog1);
                        if (robertoEditText8 != null) {
                            robertoEditText8.addTextChangedListener(new gn.q(reworkSignupFragment, uVar));
                        }
                        RobertoEditText robertoEditText9 = (RobertoEditText) reworkSignupFragment.I().findViewById(R.id.etOTPDialog2);
                        if (robertoEditText9 != null) {
                            robertoEditText9.addTextChangedListener(new r(reworkSignupFragment, uVar));
                        }
                        RobertoEditText robertoEditText10 = (RobertoEditText) reworkSignupFragment.I().findViewById(R.id.etOTPDialog3);
                        if (robertoEditText10 != null) {
                            robertoEditText10.addTextChangedListener(new s(reworkSignupFragment, uVar));
                        }
                        RobertoEditText robertoEditText11 = (RobertoEditText) reworkSignupFragment.I().findViewById(R.id.etOTPDialog4);
                        if (robertoEditText11 != null) {
                            robertoEditText11.addTextChangedListener(new t(reworkSignupFragment, uVar));
                        }
                        AppCompatImageView appCompatImageView = (AppCompatImageView) reworkSignupFragment.I().findViewById(R.id.ivOTPDialogCloseCta);
                        if (appCompatImageView != null) {
                            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: gn.o
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ReworkSignupEvents.ResendOTP resendOTP;
                                    String str;
                                    yp.m mVar;
                                    RobertoEditText robertoEditText12;
                                    Editable text;
                                    yp.m mVar2;
                                    RobertoEditText robertoEditText13;
                                    Editable text2;
                                    String str2;
                                    yp.m mVar3;
                                    RobertoEditText robertoEditText14;
                                    Editable text3;
                                    yp.m mVar4;
                                    RobertoEditText robertoEditText15;
                                    Editable text4;
                                    int i10 = r2;
                                    ReworkSignupFragment this$0 = reworkSignupFragment;
                                    switch (i10) {
                                        case 0:
                                            int i11 = ReworkSignupFragment.C;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this$0.I().dismiss();
                                            return;
                                        default:
                                            int i12 = ReworkSignupFragment.C;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(((RobertoTextView) this$0.I().findViewById(R.id.tvOTPDialogTimer)).getText(), "00:00")) {
                                                hn.q J = this$0.J();
                                                String str3 = null;
                                                if (kotlin.jvm.internal.i.b(this$0.J().f17890b0, "variant_a")) {
                                                    yp.f fVar = this$0.f11344w;
                                                    if (fVar != null && (mVar4 = (yp.m) fVar.f38775j) != null && (robertoEditText15 = mVar4.f38866c) != null && (text4 = robertoEditText15.getText()) != null) {
                                                        str2 = text4.toString();
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    yp.f fVar2 = this$0.f11344w;
                                                    if (fVar2 != null && (mVar3 = (yp.m) fVar2.f38775j) != null && (robertoEditText14 = mVar3.f38865b) != null && (text3 = robertoEditText14.getText()) != null) {
                                                        str3 = text3.toString();
                                                    }
                                                    resendOTP = new ReworkSignupEvents.ResendOTP(str2, str3);
                                                } else {
                                                    yp.f fVar3 = this$0.f11345x;
                                                    if (fVar3 != null && (mVar2 = (yp.m) fVar3.f38775j) != null && (robertoEditText13 = mVar2.f38866c) != null && (text2 = robertoEditText13.getText()) != null) {
                                                        str = text2.toString();
                                                    } else {
                                                        str = null;
                                                    }
                                                    yp.f fVar4 = this$0.f11345x;
                                                    if (fVar4 != null && (mVar = (yp.m) fVar4.f38775j) != null && (robertoEditText12 = mVar.f38865b) != null && (text = robertoEditText12.getText()) != null) {
                                                        str3 = text.toString();
                                                    }
                                                    resendOTP = new ReworkSignupEvents.ResendOTP(str, str3);
                                                }
                                                J.p(resendOTP);
                                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.I().findViewById(R.id.tvOTPDialogResend);
                                                if (robertoTextView2 != null) {
                                                    robertoTextView2.setAlpha(0.2f);
                                                }
                                                String str4 = gk.a.f16573a;
                                                Bundle a10 = r1.b0.a("source", "auth_screen");
                                                hs.k kVar = hs.k.f19476a;
                                                gk.a.b(a10, "auth_verify_otp_resend");
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        RobertoTextView robertoTextView2 = (RobertoTextView) reworkSignupFragment.I().findViewById(R.id.tvOTPDialogResend);
                        if (robertoTextView2 != null) {
                            robertoTextView2.setPaintFlags(8 | ((RobertoTextView) reworkSignupFragment.I().findViewById(R.id.tvOTPDialogResend)).getPaintFlags());
                        }
                        RobertoTextView robertoTextView3 = (RobertoTextView) reworkSignupFragment.I().findViewById(R.id.tvOTPDialogResend);
                        if (robertoTextView3 != null) {
                            robertoTextView3.setOnClickListener(new View.OnClickListener() { // from class: gn.o
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ReworkSignupEvents.ResendOTP resendOTP;
                                    String str;
                                    yp.m mVar;
                                    RobertoEditText robertoEditText12;
                                    Editable text;
                                    yp.m mVar2;
                                    RobertoEditText robertoEditText13;
                                    Editable text2;
                                    String str2;
                                    yp.m mVar3;
                                    RobertoEditText robertoEditText14;
                                    Editable text3;
                                    yp.m mVar4;
                                    RobertoEditText robertoEditText15;
                                    Editable text4;
                                    int i10 = r2;
                                    ReworkSignupFragment this$0 = reworkSignupFragment;
                                    switch (i10) {
                                        case 0:
                                            int i11 = ReworkSignupFragment.C;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this$0.I().dismiss();
                                            return;
                                        default:
                                            int i12 = ReworkSignupFragment.C;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(((RobertoTextView) this$0.I().findViewById(R.id.tvOTPDialogTimer)).getText(), "00:00")) {
                                                hn.q J = this$0.J();
                                                String str3 = null;
                                                if (kotlin.jvm.internal.i.b(this$0.J().f17890b0, "variant_a")) {
                                                    yp.f fVar = this$0.f11344w;
                                                    if (fVar != null && (mVar4 = (yp.m) fVar.f38775j) != null && (robertoEditText15 = mVar4.f38866c) != null && (text4 = robertoEditText15.getText()) != null) {
                                                        str2 = text4.toString();
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    yp.f fVar2 = this$0.f11344w;
                                                    if (fVar2 != null && (mVar3 = (yp.m) fVar2.f38775j) != null && (robertoEditText14 = mVar3.f38865b) != null && (text3 = robertoEditText14.getText()) != null) {
                                                        str3 = text3.toString();
                                                    }
                                                    resendOTP = new ReworkSignupEvents.ResendOTP(str2, str3);
                                                } else {
                                                    yp.f fVar3 = this$0.f11345x;
                                                    if (fVar3 != null && (mVar2 = (yp.m) fVar3.f38775j) != null && (robertoEditText13 = mVar2.f38866c) != null && (text2 = robertoEditText13.getText()) != null) {
                                                        str = text2.toString();
                                                    } else {
                                                        str = null;
                                                    }
                                                    yp.f fVar4 = this$0.f11345x;
                                                    if (fVar4 != null && (mVar = (yp.m) fVar4.f38775j) != null && (robertoEditText12 = mVar.f38865b) != null && (text = robertoEditText12.getText()) != null) {
                                                        str3 = text.toString();
                                                    }
                                                    resendOTP = new ReworkSignupEvents.ResendOTP(str, str3);
                                                }
                                                J.p(resendOTP);
                                                RobertoTextView robertoTextView22 = (RobertoTextView) this$0.I().findViewById(R.id.tvOTPDialogResend);
                                                if (robertoTextView22 != null) {
                                                    robertoTextView22.setAlpha(0.2f);
                                                }
                                                String str4 = gk.a.f16573a;
                                                Bundle a10 = r1.b0.a("source", "auth_screen");
                                                hs.k kVar = hs.k.f19476a;
                                                gk.a.b(a10, "auth_verify_otp_resend");
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        RobertoButton robertoButton = (RobertoButton) reworkSignupFragment.I().findViewById(R.id.btnOTPDialogCTA);
                        if (robertoButton != null) {
                            robertoButton.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(reworkSignupFragment.requireContext(), R.color.campaignLightBlue40Opacity)));
                        }
                        RobertoButton robertoButton2 = (RobertoButton) reworkSignupFragment.I().findViewById(R.id.btnOTPDialogCTA);
                        if (robertoButton2 != null) {
                            robertoButton2.setOnClickListener(new w0(uVar, 22, reworkSignupFragment));
                        }
                        reworkSignupFragment.I().setOnDismissListener(new gn.p(reworkSignupFragment, 0));
                        reworkSignupFragment.I().show();
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(reworkSignupFragment.f11342u, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ReworkSignupFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends k implements ss.a<Dialog> {
        public f() {
            super(0);
        }

        @Override // ss.a
        public final Dialog invoke() {
            return UiUtils.Companion.getStyledDialog(R.layout.dialog_input_otp, ReworkSignupFragment.this.requireContext(), R.style.Theme_Dialog);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class h extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11357u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f11357u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f11357u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class i extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11358u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f11358u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f11358u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class j extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11359u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f11359u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f11359u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public static final boolean F(ReworkSignupFragment reworkSignupFragment, Dialog dialog) {
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
        reworkSignupFragment.getClass();
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
                        robertoButton.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(reworkSignupFragment.requireContext(), R.color.campaignLightBlue)));
                        return true;
                    }
                }
            }
        }
        if (dialog != null) {
            robertoButton = (RobertoButton) dialog.findViewById(R.id.btnOTPDialogCTA);
        }
        if (robertoButton != null) {
            robertoButton.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(reworkSignupFragment.requireContext(), R.color.campaignLightBlue40Opacity)));
        }
        return false;
    }

    public final Dialog I() {
        return (Dialog) this.f11347z.getValue();
    }

    public final q J() {
        return (q) this.f11343v.getValue();
    }

    public final void K() {
        s5 s5Var = new s5(15);
        Context requireContext = requireContext();
        kotlin.jvm.internal.i.f(requireContext, "requireContext()");
        if (s5Var.b(requireContext)) {
            d.b bVar = new d.b();
            Integer valueOf = Integer.valueOf(g0.a.b(requireContext(), R.color.dashboard_grey) | (-16777216));
            Bundle bundle = new Bundle();
            if (valueOf != null) {
                bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
            }
            bVar.f29100c = bundle;
            bVar.a().a(requireContext(), Uri.parse("https://www.amahahealth.com/privacy-policy"));
        } else {
            Intent intent = new Intent(requireContext(), WebviewActivity.class);
            intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/privacy-policy");
            startActivity(intent);
        }
        String str = gk.a.f16573a;
        Bundle bundle2 = new Bundle();
        bundle2.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
        hs.k kVar = hs.k.f19476a;
        gk.a.b(bundle2, "signup_pp_click");
    }

    public final void M() {
        s5 s5Var = new s5(15);
        Context requireContext = requireContext();
        kotlin.jvm.internal.i.f(requireContext, "requireContext()");
        if (s5Var.b(requireContext)) {
            d.b bVar = new d.b();
            Integer valueOf = Integer.valueOf(g0.a.b(requireContext(), R.color.dashboard_grey) | (-16777216));
            Bundle bundle = new Bundle();
            if (valueOf != null) {
                bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
            }
            bVar.f29100c = bundle;
            bVar.a().a(requireContext(), Uri.parse("https://www.amahahealth.com/terms-and-conditions"));
        } else {
            Intent intent = new Intent(requireContext(), WebviewActivity.class);
            intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/terms-and-conditions");
            startActivity(intent);
        }
        String str = gk.a.f16573a;
        Bundle bundle2 = new Bundle();
        bundle2.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
        hs.k kVar = hs.k.f19476a;
        gk.a.b(bundle2, "signup_tnc_click");
    }

    public final void O() {
        yp.l lVar;
        RobertoEditText robertoEditText;
        yp.l lVar2;
        RobertoEditText robertoEditText2;
        yp.l lVar3;
        RobertoEditText robertoEditText3;
        this.A = false;
        g gVar = new g();
        yp.f fVar = this.f11344w;
        if (fVar != null && (lVar3 = (yp.l) fVar.f38774i) != null && (robertoEditText3 = lVar3.f38850d) != null) {
            robertoEditText3.addTextChangedListener(gVar);
        }
        yp.f fVar2 = this.f11345x;
        if (fVar2 != null && (lVar2 = (yp.l) fVar2.f38774i) != null && (robertoEditText2 = lVar2.f38850d) != null) {
            robertoEditText2.addTextChangedListener(gVar);
        }
        yp.g gVar2 = this.f11346y;
        if (gVar2 != null && (lVar = gVar2.f38789h) != null && (robertoEditText = lVar.f38850d) != null) {
            robertoEditText.addTextChangedListener(gVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        String str = J().f17890b0;
        if (kotlin.jvm.internal.i.b(str, "variant_a")) {
            yp.f b10 = yp.f.b(getLayoutInflater());
            this.f11344w = b10;
            return b10.a();
        } else if (kotlin.jvm.internal.i.b(str, "variant_b")) {
            yp.f c10 = yp.f.c(getLayoutInflater());
            this.f11345x = c10;
            return c10.a();
        } else {
            yp.g a10 = yp.g.a(getLayoutInflater());
            this.f11346y = a10;
            return a10.f38783a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f11344w = null;
        this.f11345x = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.B.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RobertoTextView robertoTextView;
        RobertoTextView robertoTextView2;
        RobertoTextView robertoTextView3;
        RobertoTextView robertoTextView4;
        View view2;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        yp.l lVar;
        RobertoButton robertoButton;
        RobertoTextView robertoTextView5;
        RobertoTextView robertoTextView6;
        RobertoTextView robertoTextView7;
        RobertoTextView robertoTextView8;
        ConstraintLayout constraintLayout3;
        AppCompatImageButton appCompatImageButton;
        AppCompatImageButton appCompatImageButton2;
        yp.l lVar2;
        RobertoTextView robertoTextView9;
        yp.l lVar3;
        RobertoButton robertoButton2;
        m mVar;
        RobertoTextView robertoTextView10;
        m mVar2;
        RobertoButton robertoButton3;
        RobertoTextView robertoTextView11;
        RobertoTextView robertoTextView12;
        RobertoTextView robertoTextView13;
        RobertoTextView robertoTextView14;
        ConstraintLayout constraintLayout4;
        AppCompatImageButton appCompatImageButton3;
        AppCompatImageButton appCompatImageButton4;
        yp.l lVar4;
        RobertoTextView robertoTextView15;
        yp.l lVar5;
        RobertoButton robertoButton4;
        m mVar3;
        RobertoTextView robertoTextView16;
        m mVar4;
        RobertoButton robertoButton5;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        x a10 = x.f.a();
        Date date = h5.a.F;
        h5.f.f.a().c(null, true);
        h.b.a(null);
        Parcelable.Creator<h5.x> creator = h5.x.CREATOR;
        z.f17336d.a().a(null, true);
        SharedPreferences.Editor edit = a10.f16340c.edit();
        edit.putBoolean("express_login_allowed", false);
        edit.apply();
        q J = J();
        J.A.e(getViewLifecycleOwner(), new an.p(28, new b(J, this)));
        J.I.e(getViewLifecycleOwner(), new an.p(29, new c()));
        J.G.e(getViewLifecycleOwner(), new gn.l(0, new d()));
        J.c0.e(getViewLifecycleOwner(), new gn.l(1, new e()));
        yp.f fVar = this.f11344w;
        if (fVar != null && (mVar4 = (m) fVar.f38775j) != null && (robertoButton5 = mVar4.f38864a) != null) {
            robertoButton5.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar2 = this$0.f11344w;
                            if (fVar2 != null && (mVar6 = (yp.m) fVar2.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar3 = this$0.f11344w;
                            if (fVar3 != null && (mVar5 = (yp.m) fVar3.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar4 = this$0.f11345x;
                            if (fVar4 != null && (mVar8 = (yp.m) fVar4.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar5 = this$0.f11345x;
                            if (fVar5 != null && (mVar7 = (yp.m) fVar5.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar6 = this$0.f11345x;
                            if (fVar6 != null && (lVar8 = (yp.l) fVar6.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar7 = this$0.f11345x;
                            if (fVar7 != null && (lVar7 = (yp.l) fVar7.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar8 = this$0.f11345x;
                            if (fVar8 != null && (lVar6 = (yp.l) fVar8.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar9 = this$0.f11344w;
                            if (fVar9 != null && (lVar14 = (yp.l) fVar9.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar10 = this$0.f11344w;
                            if (fVar10 != null && (lVar13 = (yp.l) fVar10.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar11 = this$0.f11344w;
                            if (fVar11 != null && (lVar12 = (yp.l) fVar11.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar2 = this.f11344w;
        if (fVar2 != null && (mVar3 = (m) fVar2.f38775j) != null && (robertoTextView16 = mVar3.f38872j) != null) {
            robertoTextView16.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar3 = this$0.f11344w;
                            if (fVar3 != null && (mVar5 = (yp.m) fVar3.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar4 = this$0.f11345x;
                            if (fVar4 != null && (mVar8 = (yp.m) fVar4.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar5 = this$0.f11345x;
                            if (fVar5 != null && (mVar7 = (yp.m) fVar5.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar6 = this$0.f11345x;
                            if (fVar6 != null && (lVar8 = (yp.l) fVar6.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar7 = this$0.f11345x;
                            if (fVar7 != null && (lVar7 = (yp.l) fVar7.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar8 = this$0.f11345x;
                            if (fVar8 != null && (lVar6 = (yp.l) fVar8.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar9 = this$0.f11344w;
                            if (fVar9 != null && (lVar14 = (yp.l) fVar9.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar10 = this$0.f11344w;
                            if (fVar10 != null && (lVar13 = (yp.l) fVar10.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar11 = this$0.f11344w;
                            if (fVar11 != null && (lVar12 = (yp.l) fVar11.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar3 = this.f11344w;
        if (fVar3 != null && (lVar5 = (yp.l) fVar3.f38774i) != null && (robertoButton4 = lVar5.f38847a) != null) {
            robertoButton4.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar4 = this$0.f11345x;
                            if (fVar4 != null && (mVar8 = (yp.m) fVar4.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar5 = this$0.f11345x;
                            if (fVar5 != null && (mVar7 = (yp.m) fVar5.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar6 = this$0.f11345x;
                            if (fVar6 != null && (lVar8 = (yp.l) fVar6.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar7 = this$0.f11345x;
                            if (fVar7 != null && (lVar7 = (yp.l) fVar7.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar8 = this$0.f11345x;
                            if (fVar8 != null && (lVar6 = (yp.l) fVar8.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar9 = this$0.f11344w;
                            if (fVar9 != null && (lVar14 = (yp.l) fVar9.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar10 = this$0.f11344w;
                            if (fVar10 != null && (lVar13 = (yp.l) fVar10.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar11 = this$0.f11344w;
                            if (fVar11 != null && (lVar12 = (yp.l) fVar11.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar4 = this.f11344w;
        if (fVar4 != null && (lVar4 = (yp.l) fVar4.f38774i) != null && (robertoTextView15 = lVar4.r) != null) {
            robertoTextView15.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar5 = this$0.f11345x;
                            if (fVar5 != null && (mVar7 = (yp.m) fVar5.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar6 = this$0.f11345x;
                            if (fVar6 != null && (lVar8 = (yp.l) fVar6.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar7 = this$0.f11345x;
                            if (fVar7 != null && (lVar7 = (yp.l) fVar7.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar8 = this$0.f11345x;
                            if (fVar8 != null && (lVar6 = (yp.l) fVar8.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar9 = this$0.f11344w;
                            if (fVar9 != null && (lVar14 = (yp.l) fVar9.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar10 = this$0.f11344w;
                            if (fVar10 != null && (lVar13 = (yp.l) fVar10.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar11 = this$0.f11344w;
                            if (fVar11 != null && (lVar12 = (yp.l) fVar11.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar5 = this.f11344w;
        if (fVar5 != null && (appCompatImageButton4 = (AppCompatImageButton) fVar5.f38770d) != null) {
            appCompatImageButton4.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar6 = this$0.f11345x;
                            if (fVar6 != null && (lVar8 = (yp.l) fVar6.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar7 = this$0.f11345x;
                            if (fVar7 != null && (lVar7 = (yp.l) fVar7.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar8 = this$0.f11345x;
                            if (fVar8 != null && (lVar6 = (yp.l) fVar8.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar9 = this$0.f11344w;
                            if (fVar9 != null && (lVar14 = (yp.l) fVar9.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar10 = this$0.f11344w;
                            if (fVar10 != null && (lVar13 = (yp.l) fVar10.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar11 = this$0.f11344w;
                            if (fVar11 != null && (lVar12 = (yp.l) fVar11.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar6 = this.f11344w;
        if (fVar6 != null && (appCompatImageButton3 = (AppCompatImageButton) fVar6.f38769c) != null) {
            appCompatImageButton3.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar7 = this$0.f11345x;
                            if (fVar7 != null && (lVar7 = (yp.l) fVar7.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar8 = this$0.f11345x;
                            if (fVar8 != null && (lVar6 = (yp.l) fVar8.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar9 = this$0.f11344w;
                            if (fVar9 != null && (lVar14 = (yp.l) fVar9.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar10 = this$0.f11344w;
                            if (fVar10 != null && (lVar13 = (yp.l) fVar10.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar11 = this$0.f11344w;
                            if (fVar11 != null && (lVar12 = (yp.l) fVar11.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar7 = this.f11344w;
        if (fVar7 != null && (constraintLayout4 = fVar7.f38771e) != null) {
            constraintLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar8 = this$0.f11345x;
                            if (fVar8 != null && (lVar6 = (yp.l) fVar8.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar9 = this$0.f11344w;
                            if (fVar9 != null && (lVar14 = (yp.l) fVar9.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar10 = this$0.f11344w;
                            if (fVar10 != null && (lVar13 = (yp.l) fVar10.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar11 = this$0.f11344w;
                            if (fVar11 != null && (lVar12 = (yp.l) fVar11.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar8 = this.f11344w;
        if (fVar8 != null && (robertoTextView14 = fVar8.f38780o) != null) {
            robertoTextView14.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar9 = this$0.f11344w;
                            if (fVar9 != null && (lVar14 = (yp.l) fVar9.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar10 = this$0.f11344w;
                            if (fVar10 != null && (lVar13 = (yp.l) fVar10.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar11 = this$0.f11344w;
                            if (fVar11 != null && (lVar12 = (yp.l) fVar11.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar9 = this.f11344w;
        if (fVar9 != null && (robertoTextView13 = fVar9.f38781p) != null) {
            robertoTextView13.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar10 = this$0.f11344w;
                            if (fVar10 != null && (lVar13 = (yp.l) fVar10.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar11 = this$0.f11344w;
                            if (fVar11 != null && (lVar12 = (yp.l) fVar11.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar10 = this.f11344w;
        if (fVar10 != null && (robertoTextView12 = fVar10.f38782q) != null) {
            robertoTextView12.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar11 = this$0.f11344w;
                            if (fVar11 != null && (lVar12 = (yp.l) fVar11.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar11 = this.f11344w;
        if (fVar11 != null && (robertoTextView11 = fVar11.f38777l) != null) {
            robertoTextView11.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar12 = this.f11345x;
        if (fVar12 != null && (mVar2 = (m) fVar12.f38775j) != null && (robertoButton3 = mVar2.f38864a) != null) {
            robertoButton3.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar13 = this.f11345x;
        if (fVar13 != null && (mVar = (m) fVar13.f38775j) != null && (robertoTextView10 = mVar.f38872j) != null) {
            robertoTextView10.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar14 = this.f11345x;
        if (fVar14 != null && (lVar3 = (yp.l) fVar14.f38774i) != null && (robertoButton2 = lVar3.f38847a) != null) {
            robertoButton2.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar15 = this.f11345x;
        if (fVar15 != null && (lVar2 = (yp.l) fVar15.f38774i) != null && (robertoTextView9 = lVar2.r) != null) {
            robertoTextView9.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar16 = this.f11345x;
        if (fVar16 != null && (appCompatImageButton2 = (AppCompatImageButton) fVar16.f38770d) != null) {
            appCompatImageButton2.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar17 = this.f11345x;
        if (fVar17 != null && (appCompatImageButton = (AppCompatImageButton) fVar17.f38769c) != null) {
            appCompatImageButton.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar18 = this.f11345x;
        if (fVar18 != null && (constraintLayout3 = fVar18.f38771e) != null) {
            constraintLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar19 = this.f11345x;
        if (fVar19 != null && (robertoTextView8 = fVar19.f38780o) != null) {
            robertoTextView8.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar20 = this.f11345x;
        if (fVar20 != null && (robertoTextView7 = fVar20.f38781p) != null) {
            robertoTextView7.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar21 = this.f11345x;
        if (fVar21 != null && (robertoTextView6 = fVar21.f38782q) != null) {
            robertoTextView6.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar22 = this$0.f11344w;
                            if (fVar22 != null && (mVar6 = (yp.m) fVar22.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.f fVar22 = this.f11345x;
        if (fVar22 != null && (robertoTextView5 = fVar22.f38777l) != null) {
            robertoTextView5.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar222 = this$0.f11344w;
                            if (fVar222 != null && (mVar6 = (yp.m) fVar222.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar = this$0.f11346y;
                            if (gVar != null && (lVar11 = gVar.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar10 = gVar2.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.g gVar = this.f11346y;
        if (gVar != null && (lVar = gVar.f38789h) != null && (robertoButton = lVar.f38847a) != null) {
            robertoButton.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar222 = this$0.f11344w;
                            if (fVar222 != null && (mVar6 = (yp.m) fVar222.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar2 = this$0.f11346y;
                            if (gVar2 != null && (lVar11 = gVar2.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar22 = this$0.f11346y;
                            if (gVar22 != null && (lVar10 = gVar22.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.g gVar2 = this.f11346y;
        if (gVar2 != null && (constraintLayout2 = gVar2.f38785c) != null) {
            constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar222 = this$0.f11344w;
                            if (fVar222 != null && (mVar6 = (yp.m) fVar222.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar22 = this$0.f11346y;
                            if (gVar22 != null && (lVar11 = gVar22.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar222 = this$0.f11346y;
                            if (gVar222 != null && (lVar10 = gVar222.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar3 = this$0.f11346y;
                            if (gVar3 != null && (lVar9 = gVar3.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.g gVar3 = this.f11346y;
        if (gVar3 != null && (constraintLayout = gVar3.f38784b) != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar222 = this$0.f11344w;
                            if (fVar222 != null && (mVar6 = (yp.m) fVar222.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar22 = this$0.f11346y;
                            if (gVar22 != null && (lVar11 = gVar22.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar222 = this$0.f11346y;
                            if (gVar222 != null && (lVar10 = gVar222.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar32 = this$0.f11346y;
                            if (gVar32 != null && (lVar9 = gVar32.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.g gVar4 = this.f11346y;
        if (gVar4 != null && (view2 = gVar4.f38800t) != null) {
            view2.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar222 = this$0.f11344w;
                            if (fVar222 != null && (mVar6 = (yp.m) fVar222.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar22 = this$0.f11346y;
                            if (gVar22 != null && (lVar11 = gVar22.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar222 = this$0.f11346y;
                            if (gVar222 != null && (lVar10 = gVar222.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar32 = this$0.f11346y;
                            if (gVar32 != null && (lVar9 = gVar32.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.g gVar5 = this.f11346y;
        if (gVar5 != null && (robertoTextView4 = gVar5.f38795n) != null) {
            robertoTextView4.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar222 = this$0.f11344w;
                            if (fVar222 != null && (mVar6 = (yp.m) fVar222.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar22 = this$0.f11346y;
                            if (gVar22 != null && (lVar11 = gVar22.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar222 = this$0.f11346y;
                            if (gVar222 != null && (lVar10 = gVar222.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar32 = this$0.f11346y;
                            if (gVar32 != null && (lVar9 = gVar32.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.g gVar6 = this.f11346y;
        if (gVar6 != null && (robertoTextView3 = gVar6.f38796o) != null) {
            robertoTextView3.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar222 = this$0.f11344w;
                            if (fVar222 != null && (mVar6 = (yp.m) fVar222.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar22 = this$0.f11346y;
                            if (gVar22 != null && (lVar11 = gVar22.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar222 = this$0.f11346y;
                            if (gVar222 != null && (lVar10 = gVar222.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar32 = this$0.f11346y;
                            if (gVar32 != null && (lVar9 = gVar32.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.g gVar7 = this.f11346y;
        if (gVar7 != null && (robertoTextView2 = gVar7.f38798q) != null) {
            robertoTextView2.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar222 = this$0.f11344w;
                            if (fVar222 != null && (mVar6 = (yp.m) fVar222.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar22 = this$0.f11346y;
                            if (gVar22 != null && (lVar11 = gVar22.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar222 = this$0.f11346y;
                            if (gVar222 != null && (lVar10 = gVar222.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar32 = this$0.f11346y;
                            if (gVar32 != null && (lVar9 = gVar32.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
        yp.g gVar8 = this.f11346y;
        if (gVar8 != null && (robertoTextView = gVar8.f38791j) != null) {
            robertoTextView.setOnClickListener(new View.OnClickListener(this) { // from class: gn.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkSignupFragment f16644v;

                {
                    this.f16644v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    yp.m mVar5;
                    RobertoEditText robertoEditText;
                    Editable text;
                    yp.m mVar6;
                    RobertoEditText robertoEditText2;
                    Editable text2;
                    String str2;
                    yp.m mVar7;
                    RobertoEditText robertoEditText3;
                    Editable text3;
                    yp.m mVar8;
                    RobertoEditText robertoEditText4;
                    Editable text4;
                    String str3;
                    String str4;
                    yp.l lVar6;
                    RobertoEditText robertoEditText5;
                    Editable text5;
                    yp.l lVar7;
                    RobertoEditText robertoEditText6;
                    Editable text6;
                    yp.l lVar8;
                    RobertoEditText robertoEditText7;
                    Editable text7;
                    String str5;
                    String str6;
                    yp.l lVar9;
                    RobertoEditText robertoEditText8;
                    Editable text8;
                    yp.l lVar10;
                    RobertoEditText robertoEditText9;
                    Editable text9;
                    yp.l lVar11;
                    RobertoEditText robertoEditText10;
                    Editable text10;
                    String str7;
                    String str8;
                    yp.l lVar12;
                    RobertoEditText robertoEditText11;
                    Editable text11;
                    yp.l lVar13;
                    RobertoEditText robertoEditText12;
                    Editable text12;
                    yp.l lVar14;
                    RobertoEditText robertoEditText13;
                    Editable text13;
                    int i6 = r2;
                    String str9 = null;
                    ReworkSignupFragment this$0 = this.f16644v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J2 = this$0.J();
                            yp.f fVar222 = this$0.f11344w;
                            if (fVar222 != null && (mVar6 = (yp.m) fVar222.f38775j) != null && (robertoEditText2 = mVar6.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                                str = text2.toString();
                            } else {
                                str = null;
                            }
                            yp.f fVar32 = this$0.f11344w;
                            if (fVar32 != null && (mVar5 = (yp.m) fVar32.f38775j) != null && (robertoEditText = mVar5.f38865b) != null && (text = robertoEditText.getText()) != null) {
                                str9 = text.toString();
                            }
                            J2.p(new ReworkSignupEvents.PhoneMainCtaClick(str, str9));
                            return;
                        case 1:
                            int i11 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 2:
                            int i12 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J3 = this$0.J();
                            yp.f fVar42 = this$0.f11345x;
                            if (fVar42 != null && (mVar8 = (yp.m) fVar42.f38775j) != null && (robertoEditText4 = mVar8.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                                str2 = text4.toString();
                            } else {
                                str2 = null;
                            }
                            yp.f fVar52 = this$0.f11345x;
                            if (fVar52 != null && (mVar7 = (yp.m) fVar52.f38775j) != null && (robertoEditText3 = mVar7.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                                str9 = text3.toString();
                            }
                            J3.p(new ReworkSignupEvents.PhoneMainCtaClick(str2, str9));
                            return;
                        case 3:
                            int i13 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 4:
                            int i14 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J4 = this$0.J();
                            yp.f fVar62 = this$0.f11345x;
                            if (fVar62 != null && (lVar8 = (yp.l) fVar62.f38774i) != null && (robertoEditText7 = lVar8.f38848b) != null && (text7 = robertoEditText7.getText()) != null) {
                                str3 = text7.toString();
                            } else {
                                str3 = null;
                            }
                            yp.f fVar72 = this$0.f11345x;
                            if (fVar72 != null && (lVar7 = (yp.l) fVar72.f38774i) != null && (robertoEditText6 = lVar7.f38850d) != null && (text6 = robertoEditText6.getText()) != null) {
                                str4 = text6.toString();
                            } else {
                                str4 = null;
                            }
                            yp.f fVar82 = this$0.f11345x;
                            if (fVar82 != null && (lVar6 = (yp.l) fVar82.f38774i) != null && (robertoEditText5 = lVar6.f38849c) != null && (text5 = robertoEditText5.getText()) != null) {
                                str9 = text5.toString();
                            }
                            J4.p(new ReworkSignupEvents.EmailMainCtaClick(str3, str4, str9, false, 8, null));
                            return;
                        case 5:
                            int i15 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 6:
                            int i16 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 7:
                            int i17 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 8:
                            int i18 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 9:
                            int i19 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 10:
                            int i20 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 11:
                            int i21 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                            return;
                        case 12:
                            int i22 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 13:
                            int i23 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 14:
                            int i24 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J5 = this$0.J();
                            yp.g gVar22 = this$0.f11346y;
                            if (gVar22 != null && (lVar11 = gVar22.f38789h) != null && (robertoEditText10 = lVar11.f38848b) != null && (text10 = robertoEditText10.getText()) != null) {
                                str5 = text10.toString();
                            } else {
                                str5 = null;
                            }
                            yp.g gVar222 = this$0.f11346y;
                            if (gVar222 != null && (lVar10 = gVar222.f38789h) != null && (robertoEditText9 = lVar10.f38850d) != null && (text9 = robertoEditText9.getText()) != null) {
                                str6 = text9.toString();
                            } else {
                                str6 = null;
                            }
                            yp.g gVar32 = this$0.f11346y;
                            if (gVar32 != null && (lVar9 = gVar32.f38789h) != null && (robertoEditText8 = lVar9.f38849c) != null && (text8 = robertoEditText8.getText()) != null) {
                                str9 = text8.toString();
                            }
                            J5.p(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, str9, false, 8, null));
                            return;
                        case 15:
                            int i25 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 16:
                            int i26 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 17:
                            int i27 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 18:
                            int i28 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 19:
                            int i29 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 20:
                            int i30 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 21:
                            int i31 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            return;
                        case 22:
                            int i32 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q J6 = this$0.J();
                            yp.f fVar92 = this$0.f11344w;
                            if (fVar92 != null && (lVar14 = (yp.l) fVar92.f38774i) != null && (robertoEditText13 = lVar14.f38848b) != null && (text13 = robertoEditText13.getText()) != null) {
                                str7 = text13.toString();
                            } else {
                                str7 = null;
                            }
                            yp.f fVar102 = this$0.f11344w;
                            if (fVar102 != null && (lVar13 = (yp.l) fVar102.f38774i) != null && (robertoEditText12 = lVar13.f38850d) != null && (text12 = robertoEditText12.getText()) != null) {
                                str8 = text12.toString();
                            } else {
                                str8 = null;
                            }
                            yp.f fVar112 = this$0.f11344w;
                            if (fVar112 != null && (lVar12 = (yp.l) fVar112.f38774i) != null && (robertoEditText11 = lVar12.f38849c) != null && (text11 = robertoEditText11.getText()) != null) {
                                str9 = text11.toString();
                            }
                            J6.p(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, str9, false, 8, null));
                            return;
                        case 23:
                            int i33 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                            return;
                        case 24:
                            int i34 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_UP_GOOGLE));
                            return;
                        case 25:
                            int i35 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_UP_FACEBOOK));
                            return;
                        case 26:
                            int i36 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                            return;
                        case 27:
                            int i37 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        case 28:
                            int i38 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().p(ReworkSignupEvents.SwitchFlow.INSTANCE);
                            return;
                        default:
                            int i39 = ReworkSignupFragment.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                    }
                }
            });
        }
    }

    /* compiled from: ReworkSignupFragment.kt */
    /* loaded from: classes2.dex */
    public static final class g implements TextWatcher {
        public g() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            boolean z10;
            boolean z11;
            ReworkSignupState copy;
            if (charSequence != null) {
                String obj = charSequence.toString();
                String obj2 = charSequence.toString();
                Locale ENGLISH = Locale.ENGLISH;
                kotlin.jvm.internal.i.f(ENGLISH, "ENGLISH");
                String lowerCase = obj2.toLowerCase(ENGLISH);
                kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                boolean z12 = !kotlin.jvm.internal.i.b(obj, lowerCase);
                String obj3 = charSequence.toString();
                String obj4 = charSequence.toString();
                kotlin.jvm.internal.i.f(ENGLISH, "ENGLISH");
                String upperCase = obj4.toUpperCase(ENGLISH);
                kotlin.jvm.internal.i.f(upperCase, "this as java.lang.String).toUpperCase(locale)");
                boolean z13 = !kotlin.jvm.internal.i.b(obj3, upperCase);
                Pattern compile = Pattern.compile("[A-Za-z\\d]*");
                kotlin.jvm.internal.i.f(compile, "compile(pattern)");
                boolean z14 = !compile.matcher(charSequence).matches();
                Pattern compile2 = Pattern.compile(".*\\d.*");
                kotlin.jvm.internal.i.f(compile2, "compile(pattern)");
                boolean matches = compile2.matcher(charSequence).matches();
                int i12 = ReworkSignupFragment.C;
                androidx.lifecycle.w<ReworkSignupState> wVar = ReworkSignupFragment.this.J().A;
                ReworkSignupState d10 = wVar.d();
                if (d10 == null) {
                    d10 = new ReworkSignupState(null, null, null, null, null, null, false, false, false, false, null, null, false, 8191, null);
                }
                ReworkSignupState reworkSignupState = d10;
                if (z12 && z13) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z14 && matches) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                copy = reworkSignupState.copy((r28 & 1) != 0 ? reworkSignupState.expandedState : null, (r28 & 2) != 0 ? reworkSignupState.phoneNameInputError : null, (r28 & 4) != 0 ? reworkSignupState.emailNameInputError : null, (r28 & 8) != 0 ? reworkSignupState.emailInputError : null, (r28 & 16) != 0 ? reworkSignupState.passwordInputError : null, (r28 & 32) != 0 ? reworkSignupState.phoneInputError : null, (r28 & 64) != 0 ? reworkSignupState.isEnforcePasswordRules : false, (r28 & 128) != 0 ? reworkSignupState.isPasswordCaseRequirementFulfilled : z10, (r28 & 256) != 0 ? reworkSignupState.isPasswordCharacterRequirementFulfilled : z11, (r28 & 512) != 0 ? reworkSignupState.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? reworkSignupState.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? reworkSignupState.signupTextOverride : null, (r28 & 4096) != 0 ? reworkSignupState.isDisableLogin : false);
                wVar.i(copy);
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }
}
