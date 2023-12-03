package so;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: ExperimentEditProfileActivity.kt */
/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Boolean>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExperimentEditProfileActivity f31840u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ExperimentEditProfileActivity experimentEditProfileActivity) {
        super(1);
        this.f31840u = experimentEditProfileActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
        Boolean contentIfNotHandled;
        SingleUseEvent<? extends Boolean> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null && contentIfNotHandled.booleanValue()) {
            int i6 = ExperimentEditProfileActivity.P;
            final ExperimentEditProfileActivity experimentEditProfileActivity = this.f31840u;
            experimentEditProfileActivity.getClass();
            try {
                kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                experimentEditProfileActivity.r0().setCancelable(false);
                wo.v vVar = experimentEditProfileActivity.f11567w;
                if (vVar != null) {
                    vVar.f();
                    RobertoEditText robertoEditText = (RobertoEditText) experimentEditProfileActivity.r0().findViewById(R.id.etOTPDialog1);
                    if (robertoEditText != null) {
                        robertoEditText.setText("");
                    }
                    RobertoEditText robertoEditText2 = (RobertoEditText) experimentEditProfileActivity.r0().findViewById(R.id.etOTPDialog2);
                    if (robertoEditText2 != null) {
                        robertoEditText2.setText("");
                    }
                    RobertoEditText robertoEditText3 = (RobertoEditText) experimentEditProfileActivity.r0().findViewById(R.id.etOTPDialog3);
                    if (robertoEditText3 != null) {
                        robertoEditText3.setText("");
                    }
                    RobertoEditText robertoEditText4 = (RobertoEditText) experimentEditProfileActivity.r0().findViewById(R.id.etOTPDialog4);
                    if (robertoEditText4 != null) {
                        robertoEditText4.setText("");
                    }
                    RobertoTextView robertoTextView = (RobertoTextView) experimentEditProfileActivity.r0().findViewById(R.id.tvOTPDialogError);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(8);
                    }
                    if (!experimentEditProfileActivity.r0().isShowing()) {
                        wo.v vVar2 = experimentEditProfileActivity.f11567w;
                        if (vVar2 != null) {
                            vVar2.G.e(experimentEditProfileActivity, new ko.b(15, new x(experimentEditProfileActivity)));
                            wo.v vVar3 = experimentEditProfileActivity.f11567w;
                            if (vVar3 != null) {
                                vVar3.J.e(experimentEditProfileActivity, new ko.b(16, new y(experimentEditProfileActivity)));
                                wo.v vVar4 = experimentEditProfileActivity.f11567w;
                                if (vVar4 != null) {
                                    vVar4.H.e(experimentEditProfileActivity, new ko.b(17, new z(experimentEditProfileActivity)));
                                    RobertoEditText robertoEditText5 = (RobertoEditText) experimentEditProfileActivity.r0().findViewById(R.id.etOTPDialog2);
                                    if (robertoEditText5 != null) {
                                        robertoEditText5.setOnKeyListener(new View.OnKeyListener() { // from class: so.j
                                            @Override // android.view.View.OnKeyListener
                                            public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                                                int i11 = r2;
                                                boolean z10 = true;
                                                Editable editable = null;
                                                ExperimentEditProfileActivity this$0 = experimentEditProfileActivity;
                                                switch (i11) {
                                                    case 0:
                                                        int i12 = ExperimentEditProfileActivity.P;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        if (i10 == 67) {
                                                            kotlin.jvm.internal.i.d(keyEvent);
                                                            if (keyEvent.getAction() == 0) {
                                                                RobertoEditText robertoEditText6 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog2);
                                                                if (robertoEditText6 != null) {
                                                                    editable = robertoEditText6.getText();
                                                                }
                                                                if (editable != null && editable.length() != 0) {
                                                                    z10 = false;
                                                                }
                                                                if (z10) {
                                                                    RobertoEditText robertoEditText7 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog1);
                                                                    if (robertoEditText7 != null) {
                                                                        robertoEditText7.setText("");
                                                                    }
                                                                    RobertoEditText robertoEditText8 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog1);
                                                                    if (robertoEditText8 != null) {
                                                                        robertoEditText8.requestFocus();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return false;
                                                    case 1:
                                                        int i13 = ExperimentEditProfileActivity.P;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        if (i10 == 67) {
                                                            kotlin.jvm.internal.i.d(keyEvent);
                                                            if (keyEvent.getAction() == 0) {
                                                                RobertoEditText robertoEditText9 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog3);
                                                                if (robertoEditText9 != null) {
                                                                    editable = robertoEditText9.getText();
                                                                }
                                                                if (editable != null && editable.length() != 0) {
                                                                    z10 = false;
                                                                }
                                                                if (z10) {
                                                                    RobertoEditText robertoEditText10 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog2);
                                                                    if (robertoEditText10 != null) {
                                                                        robertoEditText10.setText("");
                                                                    }
                                                                    RobertoEditText robertoEditText11 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog2);
                                                                    if (robertoEditText11 != null) {
                                                                        robertoEditText11.requestFocus();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return false;
                                                    default:
                                                        int i14 = ExperimentEditProfileActivity.P;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        if (i10 == 67) {
                                                            kotlin.jvm.internal.i.d(keyEvent);
                                                            if (keyEvent.getAction() == 0) {
                                                                RobertoEditText robertoEditText12 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog4);
                                                                if (robertoEditText12 != null) {
                                                                    editable = robertoEditText12.getText();
                                                                }
                                                                if (editable != null && editable.length() != 0) {
                                                                    z10 = false;
                                                                }
                                                                if (z10) {
                                                                    RobertoEditText robertoEditText13 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog3);
                                                                    if (robertoEditText13 != null) {
                                                                        robertoEditText13.setText("");
                                                                    }
                                                                    RobertoEditText robertoEditText14 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog3);
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
                                    RobertoEditText robertoEditText6 = (RobertoEditText) experimentEditProfileActivity.r0().findViewById(R.id.etOTPDialog3);
                                    if (robertoEditText6 != null) {
                                        robertoEditText6.setOnKeyListener(new View.OnKeyListener() { // from class: so.j
                                            @Override // android.view.View.OnKeyListener
                                            public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                                                int i11 = r2;
                                                boolean z10 = true;
                                                Editable editable = null;
                                                ExperimentEditProfileActivity this$0 = experimentEditProfileActivity;
                                                switch (i11) {
                                                    case 0:
                                                        int i12 = ExperimentEditProfileActivity.P;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        if (i10 == 67) {
                                                            kotlin.jvm.internal.i.d(keyEvent);
                                                            if (keyEvent.getAction() == 0) {
                                                                RobertoEditText robertoEditText62 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog2);
                                                                if (robertoEditText62 != null) {
                                                                    editable = robertoEditText62.getText();
                                                                }
                                                                if (editable != null && editable.length() != 0) {
                                                                    z10 = false;
                                                                }
                                                                if (z10) {
                                                                    RobertoEditText robertoEditText7 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog1);
                                                                    if (robertoEditText7 != null) {
                                                                        robertoEditText7.setText("");
                                                                    }
                                                                    RobertoEditText robertoEditText8 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog1);
                                                                    if (robertoEditText8 != null) {
                                                                        robertoEditText8.requestFocus();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return false;
                                                    case 1:
                                                        int i13 = ExperimentEditProfileActivity.P;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        if (i10 == 67) {
                                                            kotlin.jvm.internal.i.d(keyEvent);
                                                            if (keyEvent.getAction() == 0) {
                                                                RobertoEditText robertoEditText9 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog3);
                                                                if (robertoEditText9 != null) {
                                                                    editable = robertoEditText9.getText();
                                                                }
                                                                if (editable != null && editable.length() != 0) {
                                                                    z10 = false;
                                                                }
                                                                if (z10) {
                                                                    RobertoEditText robertoEditText10 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog2);
                                                                    if (robertoEditText10 != null) {
                                                                        robertoEditText10.setText("");
                                                                    }
                                                                    RobertoEditText robertoEditText11 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog2);
                                                                    if (robertoEditText11 != null) {
                                                                        robertoEditText11.requestFocus();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return false;
                                                    default:
                                                        int i14 = ExperimentEditProfileActivity.P;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        if (i10 == 67) {
                                                            kotlin.jvm.internal.i.d(keyEvent);
                                                            if (keyEvent.getAction() == 0) {
                                                                RobertoEditText robertoEditText12 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog4);
                                                                if (robertoEditText12 != null) {
                                                                    editable = robertoEditText12.getText();
                                                                }
                                                                if (editable != null && editable.length() != 0) {
                                                                    z10 = false;
                                                                }
                                                                if (z10) {
                                                                    RobertoEditText robertoEditText13 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog3);
                                                                    if (robertoEditText13 != null) {
                                                                        robertoEditText13.setText("");
                                                                    }
                                                                    RobertoEditText robertoEditText14 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog3);
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
                                    RobertoEditText robertoEditText7 = (RobertoEditText) experimentEditProfileActivity.r0().findViewById(R.id.etOTPDialog4);
                                    if (robertoEditText7 != null) {
                                        robertoEditText7.setOnKeyListener(new View.OnKeyListener() { // from class: so.j
                                            @Override // android.view.View.OnKeyListener
                                            public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                                                int i11 = r2;
                                                boolean z10 = true;
                                                Editable editable = null;
                                                ExperimentEditProfileActivity this$0 = experimentEditProfileActivity;
                                                switch (i11) {
                                                    case 0:
                                                        int i12 = ExperimentEditProfileActivity.P;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        if (i10 == 67) {
                                                            kotlin.jvm.internal.i.d(keyEvent);
                                                            if (keyEvent.getAction() == 0) {
                                                                RobertoEditText robertoEditText62 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog2);
                                                                if (robertoEditText62 != null) {
                                                                    editable = robertoEditText62.getText();
                                                                }
                                                                if (editable != null && editable.length() != 0) {
                                                                    z10 = false;
                                                                }
                                                                if (z10) {
                                                                    RobertoEditText robertoEditText72 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog1);
                                                                    if (robertoEditText72 != null) {
                                                                        robertoEditText72.setText("");
                                                                    }
                                                                    RobertoEditText robertoEditText8 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog1);
                                                                    if (robertoEditText8 != null) {
                                                                        robertoEditText8.requestFocus();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return false;
                                                    case 1:
                                                        int i13 = ExperimentEditProfileActivity.P;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        if (i10 == 67) {
                                                            kotlin.jvm.internal.i.d(keyEvent);
                                                            if (keyEvent.getAction() == 0) {
                                                                RobertoEditText robertoEditText9 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog3);
                                                                if (robertoEditText9 != null) {
                                                                    editable = robertoEditText9.getText();
                                                                }
                                                                if (editable != null && editable.length() != 0) {
                                                                    z10 = false;
                                                                }
                                                                if (z10) {
                                                                    RobertoEditText robertoEditText10 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog2);
                                                                    if (robertoEditText10 != null) {
                                                                        robertoEditText10.setText("");
                                                                    }
                                                                    RobertoEditText robertoEditText11 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog2);
                                                                    if (robertoEditText11 != null) {
                                                                        robertoEditText11.requestFocus();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return false;
                                                    default:
                                                        int i14 = ExperimentEditProfileActivity.P;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        if (i10 == 67) {
                                                            kotlin.jvm.internal.i.d(keyEvent);
                                                            if (keyEvent.getAction() == 0) {
                                                                RobertoEditText robertoEditText12 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog4);
                                                                if (robertoEditText12 != null) {
                                                                    editable = robertoEditText12.getText();
                                                                }
                                                                if (editable != null && editable.length() != 0) {
                                                                    z10 = false;
                                                                }
                                                                if (z10) {
                                                                    RobertoEditText robertoEditText13 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog3);
                                                                    if (robertoEditText13 != null) {
                                                                        robertoEditText13.setText("");
                                                                    }
                                                                    RobertoEditText robertoEditText14 = (RobertoEditText) this$0.r0().findViewById(R.id.etOTPDialog3);
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
                                    RobertoEditText robertoEditText8 = (RobertoEditText) experimentEditProfileActivity.r0().findViewById(R.id.etOTPDialog1);
                                    if (robertoEditText8 != null) {
                                        robertoEditText8.addTextChangedListener(new t(experimentEditProfileActivity, uVar));
                                    }
                                    RobertoEditText robertoEditText9 = (RobertoEditText) experimentEditProfileActivity.r0().findViewById(R.id.etOTPDialog2);
                                    if (robertoEditText9 != null) {
                                        robertoEditText9.addTextChangedListener(new u(experimentEditProfileActivity, uVar));
                                    }
                                    RobertoEditText robertoEditText10 = (RobertoEditText) experimentEditProfileActivity.r0().findViewById(R.id.etOTPDialog3);
                                    if (robertoEditText10 != null) {
                                        robertoEditText10.addTextChangedListener(new v(experimentEditProfileActivity, uVar));
                                    }
                                    RobertoEditText robertoEditText11 = (RobertoEditText) experimentEditProfileActivity.r0().findViewById(R.id.etOTPDialog4);
                                    if (robertoEditText11 != null) {
                                        robertoEditText11.addTextChangedListener(new w(experimentEditProfileActivity, uVar));
                                    }
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) experimentEditProfileActivity.r0().findViewById(R.id.ivOTPDialogCloseCta);
                                    if (appCompatImageView != null) {
                                        appCompatImageView.setOnClickListener(new g(experimentEditProfileActivity, 8));
                                    }
                                    RobertoTextView robertoTextView2 = (RobertoTextView) experimentEditProfileActivity.r0().findViewById(R.id.tvOTPDialogResend);
                                    if (robertoTextView2 != null) {
                                        robertoTextView2.setPaintFlags(((RobertoTextView) experimentEditProfileActivity.r0().findViewById(R.id.tvOTPDialogResend)).getPaintFlags() | 8);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) experimentEditProfileActivity.r0().findViewById(R.id.tvOTPDialogResend);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setOnClickListener(new g(experimentEditProfileActivity, 9));
                                    }
                                    RobertoButton robertoButton = (RobertoButton) experimentEditProfileActivity.r0().findViewById(R.id.btnOTPDialogCTA);
                                    if (robertoButton != null) {
                                        robertoButton.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(experimentEditProfileActivity, R.color.campaignLightBlue40Opacity)));
                                    }
                                    RobertoButton robertoButton2 = (RobertoButton) experimentEditProfileActivity.r0().findViewById(R.id.btnOTPDialogCTA);
                                    if (robertoButton2 != null) {
                                        robertoButton2.setOnClickListener(new ho.o(uVar, 2, experimentEditProfileActivity));
                                    }
                                    experimentEditProfileActivity.r0().setOnDismissListener(new hk.f(experimentEditProfileActivity, 2));
                                    experimentEditProfileActivity.r0().show();
                                    String str = gk.a.f16573a;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("source", "profile_section");
                                    hs.k kVar = hs.k.f19476a;
                                    gk.a.b(bundle, "auth_verify_num_click");
                                } else {
                                    kotlin.jvm.internal.i.q("editProfileViewModel");
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.i.q("editProfileViewModel");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("editProfileViewModel");
                            throw null;
                        }
                    }
                } else {
                    kotlin.jvm.internal.i.q("editProfileViewModel");
                    throw null;
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(experimentEditProfileActivity.f11566v, e10);
            }
        }
        return hs.k.f19476a;
    }
}
