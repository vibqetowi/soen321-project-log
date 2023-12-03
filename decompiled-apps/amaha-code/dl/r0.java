package dl;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.network.model.ProviderDetailHolderModel;
import com.theinnerhour.b2b.network.model.ProviderDetailStripDetails;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.jvm.internal.i;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class r0 extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends String, ? extends ProviderDetailHolderModel>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13104u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(V3DashboardActivity v3DashboardActivity) {
        super(1);
        this.f13104u = v3DashboardActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0107, code lost:
        if (gv.n.B0(r8) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011c, code lost:
        if (gv.n.B0(r8) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011f, code lost:
        r8 = false;
     */
    @Override // ss.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hs.k invoke(hs.f<? extends String, ? extends ProviderDetailHolderModel> fVar) {
        String str;
        ProviderDetailHolderModel providerDetailHolderModel;
        String str2;
        boolean z10;
        String str3;
        hs.f<? extends String, ? extends ProviderDetailHolderModel> fVar2 = fVar;
        String[] strArr = {"pending", "active"};
        String str4 = null;
        Bundle bundle = null;
        if (fVar2 != null) {
            str = (String) fVar2.f19464u;
        } else {
            str = null;
        }
        boolean Q1 = is.k.Q1(str, strArr);
        V3DashboardActivity v3DashboardActivity = this.f13104u;
        if (Q1) {
            if (fVar2 != null) {
                providerDetailHolderModel = (ProviderDetailHolderModel) fVar2.f19465v;
            } else {
                providerDetailHolderModel = null;
            }
            if (providerDetailHolderModel != null) {
                B b10 = fVar2.f19465v;
                kotlin.jvm.internal.i.d(b10);
                ProviderDetailHolderModel providerDetailHolderModel2 = (ProviderDetailHolderModel) b10;
                int i6 = V3DashboardActivity.f10714r1;
                ConstraintLayout constraintLayout = (ConstraintLayout) v3DashboardActivity.n0(R.id.providerBookBottomSheet);
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) v3DashboardActivity.n0(R.id.providerBookBottomSheet);
                if (constraintLayout2 != null) {
                    constraintLayout2.setOnTouchListener(new w5.h0(5));
                }
                ConstraintLayout constraintLayout3 = (ConstraintLayout) v3DashboardActivity.n0(R.id.innerContainer);
                if (constraintLayout3 != null) {
                    constraintLayout3.setPaddingRelative(0, 0, 0, (int) v3DashboardActivity.getResources().getDimension(R.dimen._100sdp));
                }
                jm.c S0 = v3DashboardActivity.S0();
                View findViewById = v3DashboardActivity.findViewById(R.id.providerBookBottomSheet);
                final x0 x0Var = new x0(v3DashboardActivity, providerDetailHolderModel2);
                final y0 y0Var = new y0(v3DashboardActivity, providerDetailHolderModel2);
                final z0 z0Var = new z0(v3DashboardActivity, providerDetailHolderModel2);
                S0.getClass();
                if (findViewById != null) {
                    Context context = S0.f22470a;
                    Glide.g(context).p("https:" + providerDetailHolderModel2.getImage()).B((ImageView) findViewById.findViewById(R.id.ivProviderBookProfileImage));
                    RobertoTextView robertoTextView = (RobertoTextView) findViewById.findViewById(R.id.tvProviderBookProfileName);
                    if (robertoTextView != null) {
                        robertoTextView.setText(providerDetailHolderModel2.getName());
                    }
                    RobertoTextView robertoTextView2 = (RobertoTextView) findViewById.findViewById(R.id.tvProviderBookProfileExperience);
                    if (robertoTextView2 != null) {
                        robertoTextView2.setText(context.getString(R.string.telecommunicationsListExperienceInfo, String.valueOf(providerDetailHolderModel2.getExperience().getYear())));
                    }
                    if (kotlin.jvm.internal.i.b(providerDetailHolderModel2.getProviderType(), "couplestherapist")) {
                        ProviderDetailStripDetails coupleStripDetails = providerDetailHolderModel2.getCoupleStripDetails();
                        if (coupleStripDetails != null) {
                            str3 = coupleStripDetails.getDiscountStrip();
                        } else {
                            str3 = null;
                        }
                        if (str3 != null) {
                        }
                        z10 = true;
                    } else {
                        ProviderDetailStripDetails stripDetails = providerDetailHolderModel2.getStripDetails();
                        if (stripDetails != null) {
                            str2 = stripDetails.getDiscountStrip();
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                        }
                        z10 = true;
                    }
                    if (z10) {
                        View findViewById2 = findViewById.findViewById(R.id.ivProviderBookDiscountIcon);
                        if (findViewById2 != null) {
                            findViewById2.setVisibility(8);
                        }
                        View findViewById3 = findViewById.findViewById(R.id.viewProviderBookDiscountBackground);
                        if (findViewById3 != null) {
                            findViewById3.setBackgroundTintList(null);
                        }
                        RobertoTextView robertoTextView3 = (RobertoTextView) findViewById.findViewById(R.id.tvProviderBookDiscountText);
                        if (robertoTextView3 != null) {
                            robertoTextView3.setText(context.getString(R.string.inapp_continue_booking));
                        }
                    } else {
                        View findViewById4 = findViewById.findViewById(R.id.ivProviderBookDiscountIcon);
                        if (findViewById4 != null) {
                            findViewById4.setVisibility(0);
                        }
                        View findViewById5 = findViewById.findViewById(R.id.viewProviderBookDiscountBackground);
                        if (findViewById5 != null) {
                            findViewById5.setBackgroundTintList(g0.a.c(R.color.amahaLightGreen, context));
                        }
                        RobertoTextView robertoTextView4 = (RobertoTextView) findViewById.findViewById(R.id.tvProviderBookDiscountText);
                        if (robertoTextView4 != null) {
                            robertoTextView4.setText(context.getString(R.string.inapp_continue_booking_discount));
                        }
                    }
                    if (providerDetailHolderModel2.getEarliestAvailableDateTime() != null) {
                        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
                        Locale locale = Locale.ENGLISH;
                        LocalDateTime parse = LocalDateTime.parse(providerDetailHolderModel2.getEarliestAvailableDateTime(), ofPattern.withLocale(locale));
                        kotlin.jvm.internal.i.f(parse, "parse(providerModel.earl…ableDateTime, dateFormat)");
                        String format = parse.format(DateTimeFormatter.ofPattern("EEE, dd MMM hh:mm a").withLocale(locale));
                        kotlin.jvm.internal.i.f(format, "bookingDate.format(requiredFormat)");
                        RobertoTextView robertoTextView5 = (RobertoTextView) findViewById.findViewById(R.id.tvProviderBookNextAvailableDate);
                        if (robertoTextView5 != null) {
                            robertoTextView5.setText(format);
                        }
                    } else {
                        RobertoTextView robertoTextView6 = (RobertoTextView) findViewById.findViewById(R.id.tvProviderBookNextAvailableHeader);
                        if (robertoTextView6 != null) {
                            robertoTextView6.setText("");
                        }
                    }
                    View findViewById6 = findViewById.findViewById(R.id.ivProviderBookDiscountDismiss);
                    if (findViewById6 != null) {
                        findViewById6.setOnClickListener(new View.OnClickListener() { // from class: jm.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i10 = r1;
                                ss.a onProviderCardClick = z0Var;
                                switch (i10) {
                                    case 0:
                                        i.g(onProviderCardClick, "$onDismissClick");
                                        onProviderCardClick.invoke();
                                        return;
                                    case 1:
                                        i.g(onProviderCardClick, "$onContinueClick");
                                        onProviderCardClick.invoke();
                                        return;
                                    default:
                                        i.g(onProviderCardClick, "$onProviderCardClick");
                                        onProviderCardClick.invoke();
                                        return;
                                }
                            }
                        });
                    }
                    View findViewById7 = findViewById.findViewById(R.id.tvProviderBookCta);
                    if (findViewById7 != null) {
                        findViewById7.setOnClickListener(new View.OnClickListener() { // from class: jm.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i10 = r1;
                                ss.a onProviderCardClick = x0Var;
                                switch (i10) {
                                    case 0:
                                        i.g(onProviderCardClick, "$onDismissClick");
                                        onProviderCardClick.invoke();
                                        return;
                                    case 1:
                                        i.g(onProviderCardClick, "$onContinueClick");
                                        onProviderCardClick.invoke();
                                        return;
                                    default:
                                        i.g(onProviderCardClick, "$onProviderCardClick");
                                        onProviderCardClick.invoke();
                                        return;
                                }
                            }
                        });
                    }
                    View findViewById8 = findViewById.findViewById(R.id.clProviderBookProfileContainer);
                    if (findViewById8 != null) {
                        findViewById8.setOnClickListener(new View.OnClickListener() { // from class: jm.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i10 = r1;
                                ss.a onProviderCardClick = y0Var;
                                switch (i10) {
                                    case 0:
                                        i.g(onProviderCardClick, "$onDismissClick");
                                        onProviderCardClick.invoke();
                                        return;
                                    case 1:
                                        i.g(onProviderCardClick, "$onContinueClick");
                                        onProviderCardClick.invoke();
                                        return;
                                    default:
                                        i.g(onProviderCardClick, "$onProviderCardClick");
                                        onProviderCardClick.invoke();
                                        return;
                                }
                            }
                        });
                    }
                }
                String str5 = gk.a.f16573a;
                km.d dVar = v3DashboardActivity.Y0;
                if (dVar != null) {
                    bundle = dVar.i(providerDetailHolderModel2);
                }
                gk.a.b(bundle, "in_app_resume_booking_sheet_shown");
                return hs.k.f19476a;
            }
        }
        if (fVar2 != null) {
            str4 = (String) fVar2.f19464u;
        }
        if (kotlin.jvm.internal.i.b(str4, Constants.SUBSCRIPTION_NONE)) {
            int i10 = V3DashboardActivity.f10714r1;
            v3DashboardActivity.G0();
        }
        return hs.k.f19476a;
    }
}
