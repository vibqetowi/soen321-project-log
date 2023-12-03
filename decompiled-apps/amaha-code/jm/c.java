package jm;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bumptech.glide.Glide;
import com.bumptech.glide.f;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.network.model.AddonProfileDetails;
import com.theinnerhour.b2b.network.model.ProviderDetailHolderModel;
import com.theinnerhour.b2b.network.model.Testimonials;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import hs.k;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.u;
import ss.l;
import t0.j0;
/* compiled from: InAppPromptsElementsUtils.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22470a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22471b;

    /* compiled from: InAppPromptsElementsUtils.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.r {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LinearLayout f22472a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f22473b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ProviderDetailHolderModel f22474c;

        public a(LinearLayout linearLayout, RecyclerView recyclerView, ProviderDetailHolderModel providerDetailHolderModel) {
            this.f22472a = linearLayout;
            this.f22473b = recyclerView;
            this.f22474c = providerDetailHolderModel;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void a(int i6, RecyclerView recyclerView) {
            LinearLayoutManager linearLayoutManager;
            int i10;
            String str;
            int i11;
            i.g(recyclerView, "recyclerView");
            if (i6 == 0) {
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                String str2 = null;
                if (layoutManager instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) layoutManager;
                } else {
                    linearLayoutManager = null;
                }
                int i12 = 0;
                if (linearLayoutManager != null) {
                    i10 = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                } else {
                    i10 = 0;
                }
                LinearLayout linearLayout = this.f22472a;
                if (linearLayout != null) {
                    Iterator<View> it = f6.b.B0(linearLayout).iterator();
                    while (true) {
                        j0 j0Var = (j0) it;
                        if (!j0Var.hasNext()) {
                            break;
                        }
                        Object next = j0Var.next();
                        int i13 = i12 + 1;
                        if (i12 >= 0) {
                            View view = (View) next;
                            Context context = this.f22473b.getContext();
                            if (i12 == i10) {
                                i11 = R.drawable.background_solid_amaha_dark_grey_corner_8dp;
                            } else {
                                i11 = R.drawable.background_stroke_amaha_dark_grey_corner_8dp;
                            }
                            Object obj = g0.a.f16164a;
                            view.setBackground(a.c.b(context, i11));
                            i12 = i13;
                        } else {
                            ca.a.t1();
                            throw null;
                        }
                    }
                }
                if (i10 >= 0) {
                    String str3 = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    ProviderDetailHolderModel providerDetailHolderModel = this.f22474c;
                    String providerType = providerDetailHolderModel.getProviderType();
                    if (i.b(providerType, "couplestherapist")) {
                        str = "couples";
                    } else if (i.b(providerType, "therapist")) {
                        str = "therapy";
                    } else {
                        str = "psychiatry";
                    }
                    bundle.putString("flow", str);
                    if (i.b(providerDetailHolderModel.getProviderType(), "psychiatrist")) {
                        bundle.putString("psychiatrist_name", providerDetailHolderModel.getFirstName() + ' ' + providerDetailHolderModel.getLastName());
                        bundle.putString("psychiatrist_uuid", providerDetailHolderModel.getUuid());
                    } else {
                        bundle.putString("therapist_name", providerDetailHolderModel.getFirstName() + ' ' + providerDetailHolderModel.getLastName());
                        bundle.putString("therapist_uuid", providerDetailHolderModel.getUuid());
                    }
                    User f = defpackage.b.f(bundle, "source", "in_app_testimonial");
                    if (f != null) {
                        str2 = f.getCurrentCourseName();
                    }
                    bundle.putString("domain", str2);
                    bundle.putInt(Constants.DAYMODEL_POSITION, i10 + 1);
                    bundle.putString("platform", "android_app");
                    k kVar = k.f19476a;
                    gk.a.b(bundle, "therapy_psychiatry_testimonials_scroll");
                }
            }
        }
    }

    public c(V3DashboardActivity context) {
        i.g(context, "context");
        this.f22470a = context;
    }

    public final Dialog a() {
        WindowManager.LayoutParams layoutParams;
        UiUtils.Companion companion = UiUtils.Companion;
        Context context = this.f22470a;
        Dialog styledDialog = companion.getStyledDialog(R.layout.dialog_inapp_prompt_dialog, context, R.style.Theme_Dialog);
        Window window = styledDialog.getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
        }
        RobertoTextView robertoTextView = (RobertoTextView) styledDialog.findViewById(R.id.tvInAppPromptDialogTitle);
        if (robertoTextView != null) {
            robertoTextView.setText(context.getString(R.string.matching_drop_off_dialog_header));
        }
        RobertoTextView robertoTextView2 = (RobertoTextView) styledDialog.findViewById(R.id.tvInAppPromptDialogMessage);
        if (robertoTextView2 != null) {
            robertoTextView2.setText(context.getString(R.string.matching_drop_off_dialog_hubHeader));
        }
        RobertoTextView robertoTextView3 = (RobertoTextView) styledDialog.findViewById(R.id.tvInAppPromptDialogYes);
        if (robertoTextView3 != null) {
            robertoTextView3.setText(context.getString(R.string.yes_start));
        }
        RobertoTextView robertoTextView4 = (RobertoTextView) styledDialog.findViewById(R.id.tvInAppPromptDialogCancel);
        if (robertoTextView4 != null) {
            robertoTextView4.setText(context.getString(R.string.rateUsNo));
        }
        return styledDialog;
    }

    public final Dialog b(ProviderDetailHolderModel providerDetailHolderModel) {
        WindowManager.LayoutParams layoutParams;
        UiUtils.Companion companion = UiUtils.Companion;
        Context context = this.f22470a;
        Dialog styledDialog = companion.getStyledDialog(R.layout.dialog_inapp_profile_dropoff, context, R.style.Theme_Dialog);
        Window window = styledDialog.getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) styledDialog.findViewById(R.id.inAppPromptDialogBg);
        if (appCompatImageView != null) {
            f g5 = Glide.g(context);
            g5.p("https:" + providerDetailHolderModel.getImage()).B(appCompatImageView);
        }
        String name = providerDetailHolderModel.getName();
        RobertoTextView robertoTextView = (RobertoTextView) styledDialog.findViewById(R.id.tvInAppPromptDialogTitle);
        if (robertoTextView != null) {
            robertoTextView.setText(context.getString(R.string.inapp_video_dialog_header, name));
        }
        RobertoTextView robertoTextView2 = (RobertoTextView) styledDialog.findViewById(R.id.tvInAppPromptDialogMessage);
        if (robertoTextView2 != null) {
            robertoTextView2.setText(context.getString(R.string.inapp_video_dialog_sub_header));
        }
        return styledDialog;
    }

    public final void c(View view, ProviderDetailHolderModel providerModel, final l<? super Boolean, k> lVar, final l<? super Boolean, k> lVar2, boolean z10) {
        int i6;
        u uVar;
        String str;
        String str2;
        String str3;
        final u uVar2;
        int i10;
        String str4;
        String str5;
        int i11;
        ArrayList<Testimonials> testimonials;
        ArrayList<Testimonials> testimonials2;
        i.g(providerModel, "providerModel");
        if (view == null) {
            return;
        }
        u uVar3 = new u();
        Context context = this.f22470a;
        f g5 = Glide.g(context);
        g5.p("https:" + providerModel.getImage()).B((ImageView) view.findViewById(R.id.ivProviderVideoViewImage));
        RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvProviderVideoViewName);
        if (robertoTextView != null) {
            robertoTextView.setText(providerModel.getName());
        }
        RobertoTextView robertoTextView2 = (RobertoTextView) view.findViewById(R.id.tvProviderBookVideoViewExperience);
        if (robertoTextView2 != null) {
            robertoTextView2.setText(context.getString(R.string.telecommunicationsListExperienceInfo, String.valueOf(providerModel.getExperience().getYear())));
        }
        AddonProfileDetails addonProfileDetails = providerModel.getAddonProfileDetails();
        if (addonProfileDetails != null && (testimonials2 = addonProfileDetails.getTestimonials()) != null) {
            i6 = testimonials2.size();
        } else {
            i6 = 0;
        }
        String str6 = "source";
        String str7 = "therapist_uuid";
        if (i6 > 0 && !z10) {
            uVar3.f23466u = true;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.layoutDots);
            linearLayout.removeAllViews();
            AddonProfileDetails addonProfileDetails2 = providerModel.getAddonProfileDetails();
            if (addonProfileDetails2 != null && (testimonials = addonProfileDetails2.getTestimonials()) != null) {
                uVar = uVar3;
                i10 = testimonials.size();
            } else {
                uVar = uVar3;
                i10 = 0;
            }
            int i12 = 0;
            while (i12 < i10) {
                int i13 = i10;
                String str8 = str6;
                String str9 = str7;
                View inflate = LayoutInflater.from(context).inflate(R.layout.navigation_dot, (ViewGroup) linearLayout, false);
                if (i12 == 0) {
                    i11 = R.drawable.background_solid_amaha_dark_grey_corner_8dp;
                } else {
                    i11 = R.drawable.background_stroke_amaha_dark_grey_corner_8dp;
                }
                Object obj = g0.a.f16164a;
                inflate.setBackground(a.c.b(context, i11));
                linearLayout.addView(inflate);
                i12++;
                i10 = i13;
                str6 = str8;
                str7 = str9;
            }
            String str10 = str6;
            String str11 = str7;
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.clProviderVideoViewTestimonial);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(R.id.clProviderVideoViewConcerns);
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(8);
            }
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rvProviderVideoViewTestimonial);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.setAdapter(new gm.a(providerModel, true));
            recyclerView.i(new a(linearLayout, recyclerView, providerModel));
            if (!this.f22471b) {
                new r().a((RecyclerView) view.findViewById(R.id.rvProviderVideoViewTestimonial));
                this.f22471b = true;
            }
            String str12 = gk.a.f16573a;
            Bundle bundle = new Bundle();
            String providerType = providerModel.getProviderType();
            if (i.b(providerType, "couplestherapist")) {
                str4 = "couples";
            } else if (i.b(providerType, "therapist")) {
                str4 = "therapy";
            } else {
                str4 = "psychiatry";
            }
            bundle.putString("flow", str4);
            if (i.b(providerModel.getProviderType(), "psychiatrist")) {
                bundle.putString("psychiatrist_name", providerModel.getFirstName() + ' ' + providerModel.getLastName());
                bundle.putString("psychiatrist_uuid", providerModel.getUuid());
            } else {
                bundle.putString("therapist_name", providerModel.getFirstName() + ' ' + providerModel.getLastName());
                bundle.putString(str11, providerModel.getUuid());
            }
            User f = defpackage.b.f(bundle, str10, "in_app_testimonial");
            if (f != null) {
                str5 = f.getCurrentCourseName();
            } else {
                str5 = null;
            }
            bundle.putString("domain", str5);
            bundle.putString("platform", "android_app");
            bundle.putInt(Constants.DAYMODEL_POSITION, 0);
            k kVar = k.f19476a;
            gk.a.b(bundle, "in_app_provider_testimonial_sheet_shown");
        } else {
            uVar = uVar3;
            if (providerModel.getUserPhrases().size() > 0) {
                uVar.f23466u = true;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) view.findViewById(R.id.clProviderVideoViewTestimonial);
                if (constraintLayout3 != null) {
                    constraintLayout3.setVisibility(8);
                }
                ConstraintLayout constraintLayout4 = (ConstraintLayout) view.findViewById(R.id.clProviderVideoViewConcerns);
                if (constraintLayout4 != null) {
                    constraintLayout4.setVisibility(0);
                }
                RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.rvProviderVideoViewConcern);
                recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 1, false));
                recyclerView2.setAdapter(new gm.a(providerModel, false));
                String str13 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                String providerType2 = providerModel.getProviderType();
                if (i.b(providerType2, "couplestherapist")) {
                    str = "couples";
                } else if (i.b(providerType2, "therapist")) {
                    str = "therapy";
                } else {
                    str = "psychiatry";
                }
                bundle2.putString("flow", str);
                if (i.b(providerModel.getProviderType(), "psychiatrist")) {
                    bundle2.putString("psychiatrist_name", providerModel.getFirstName() + ' ' + providerModel.getLastName());
                    bundle2.putString("psychiatrist_uuid", providerModel.getUuid());
                } else {
                    bundle2.putString("therapist_name", providerModel.getFirstName() + ' ' + providerModel.getLastName());
                    bundle2.putString("therapist_uuid", providerModel.getUuid());
                }
                bundle2.putString("source", "in_app_video_testimonial_fallback");
                if (z10) {
                    str2 = "video";
                } else {
                    str2 = "testimonial";
                }
                User f2 = defpackage.b.f(bundle2, "reason", str2);
                if (f2 != null) {
                    str3 = f2.getCurrentCourseName();
                } else {
                    str3 = null;
                }
                bundle2.putString("domain", str3);
                bundle2.putString("platform", "android_app");
                k kVar2 = k.f19476a;
                gk.a.b(bundle2, "in_app_fallback_sheet_shown");
            }
        }
        View findViewById = view.findViewById(R.id.tvProviderVideoViewBookCta);
        if (findViewById != null) {
            uVar2 = uVar;
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: jm.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i14 = r3;
                    u isTestimonial = uVar2;
                    l onProfileClick = lVar;
                    switch (i14) {
                        case 0:
                            i.g(onProfileClick, "$onContinueClick");
                            i.g(isTestimonial, "$isTestimonial");
                            onProfileClick.invoke(Boolean.valueOf(isTestimonial.f23466u));
                            return;
                        default:
                            i.g(onProfileClick, "$onProfileClick");
                            i.g(isTestimonial, "$isTestimonial");
                            onProfileClick.invoke(Boolean.valueOf(isTestimonial.f23466u));
                            return;
                    }
                }
            });
        } else {
            uVar2 = uVar;
        }
        View findViewById2 = view.findViewById(R.id.clProviderVideoViewContainer);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: jm.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i14 = r3;
                    u isTestimonial = uVar2;
                    l onProfileClick = lVar2;
                    switch (i14) {
                        case 0:
                            i.g(onProfileClick, "$onContinueClick");
                            i.g(isTestimonial, "$isTestimonial");
                            onProfileClick.invoke(Boolean.valueOf(isTestimonial.f23466u));
                            return;
                        default:
                            i.g(onProfileClick, "$onProfileClick");
                            i.g(isTestimonial, "$isTestimonial");
                            onProfileClick.invoke(Boolean.valueOf(isTestimonial.f23466u));
                            return;
                    }
                }
            });
        }
    }
}
