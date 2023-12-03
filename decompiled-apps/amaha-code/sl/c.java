package sl;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.telecommunications.model.OnlineOfferingModel;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.DomainAreaPackagesModel;
import com.theinnerhour.b2b.model.LanguagePackagesModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import gv.r;
import hs.k;
import is.u;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.i;
import ss.p;
import tl.s;
import tl.t;
/* compiled from: ExpertCareInfoProvidersAdapter.kt */
/* loaded from: classes2.dex */
public final class c extends RecyclerView.e<a> {
    public final p<String, String, k> A;
    public final String B;

    /* renamed from: x  reason: collision with root package name */
    public final List<TherapistPackagesModel> f31652x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f31653y;

    /* renamed from: z  reason: collision with root package name */
    public final p<String, String, k> f31654z;

    /* compiled from: ExpertCareInfoProvidersAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public final RobertoTextView A;
        public final RobertoTextView B;
        public final ConstraintLayout C;
        public final RobertoTextView D;
        public final RobertoTextView E;
        public final RobertoTextView F;
        public final AppCompatImageView G;

        /* renamed from: u  reason: collision with root package name */
        public final AppCompatImageView f31655u;

        /* renamed from: v  reason: collision with root package name */
        public final ConstraintLayout f31656v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f31657w;

        /* renamed from: x  reason: collision with root package name */
        public final RobertoTextView f31658x;

        /* renamed from: y  reason: collision with root package name */
        public final RobertoTextView f31659y;

        /* renamed from: z  reason: collision with root package name */
        public final RobertoTextView f31660z;

        public a(View view) {
            super(view);
            this.f31655u = (AppCompatImageView) view.findViewById(R.id.clRowTcProviderListImage);
            this.f31656v = (ConstraintLayout) view.findViewById(R.id.clRowTcProviderListRecommendedTag);
            this.f31657w = (RobertoTextView) view.findViewById(R.id.clRowTcProviderListName);
            this.f31658x = (RobertoTextView) view.findViewById(R.id.clRowTcProviderListInfo);
            this.f31659y = (RobertoTextView) view.findViewById(R.id.clRowTcProviderListPrice);
            this.f31660z = (RobertoTextView) view.findViewById(R.id.tvRowTcProviderLanguages);
            this.A = (RobertoTextView) view.findViewById(R.id.tvRowTcProviderExpertise);
            this.B = (RobertoTextView) view.findViewById(R.id.tvRowTcProviderSessions);
            this.C = (ConstraintLayout) view.findViewById(R.id.clRowTcProviderDiscount);
            this.D = (RobertoTextView) view.findViewById(R.id.tvRowTcProviderDiscount);
            this.E = (RobertoTextView) view.findViewById(R.id.tvRowTcProviderBookCta);
            this.F = (RobertoTextView) view.findViewById(R.id.tvRowTcProviderNextSessionInfo);
            this.G = (AppCompatImageView) view.findViewById(R.id.ivRowTcProviderVideoPlay);
        }
    }

    public c(List list, boolean z10, s sVar, t tVar) {
        i.g(list, "list");
        this.f31652x = list;
        this.f31653y = z10;
        this.f31654z = sVar;
        this.A = tVar;
        this.B = LogHelper.INSTANCE.makeLogTag("ExpertCareInfoProvidersAdapter");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f31652x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        int i10;
        String str;
        String str2;
        boolean z10;
        CharSequence charSequence;
        a aVar2 = aVar;
        AppCompatImageView appCompatImageView = aVar2.f31655u;
        View view = aVar2.f2751a;
        try {
            final TherapistPackagesModel therapistPackagesModel = (TherapistPackagesModel) u.j2(i6, this.f31652x);
            if (therapistPackagesModel != null) {
                view.setOnClickListener(new View.OnClickListener(this) { // from class: sl.b

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ c f31650v;

                    {
                        this.f31650v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i11 = r3;
                        TherapistPackagesModel it = therapistPackagesModel;
                        c this$0 = this.f31650v;
                        switch (i11) {
                            case 0:
                                i.g(this$0, "this$0");
                                i.g(it, "$it");
                                String uuid = it.getUuid();
                                i.f(uuid, "it.uuid");
                                this$0.f31654z.invoke(uuid, it.getFirstname() + ' ' + it.getLastname());
                                return;
                            default:
                                i.g(this$0, "this$0");
                                i.g(it, "$it");
                                String uuid2 = it.getUuid();
                                i.f(uuid2, "it.uuid");
                                this$0.A.invoke(uuid2, it.getFirstname() + ' ' + it.getLastname());
                                return;
                        }
                    }
                });
                Glide.g(view.getContext()).p("https:" + therapistPackagesModel.getImage()).B(appCompatImageView);
                ConstraintLayout constraintLayout = aVar2.f31656v;
                if (constraintLayout != null) {
                    if (therapistPackagesModel.isIs_recommended()) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    constraintLayout.setVisibility(i10);
                }
                boolean z11 = true;
                aVar2.f31657w.setText(view.getContext().getString(R.string.profileNewSessionsName, therapistPackagesModel.getFirstname(), therapistPackagesModel.getLastname()));
                aVar2.f31658x.setText(view.getContext().getString(R.string.telecommunicationsListExperienceInfo, String.valueOf(therapistPackagesModel.getExperience().getYear())));
                RobertoTextView robertoTextView = aVar2.f31659y;
                OnlineOfferingModel onlineOffering = therapistPackagesModel.getOnlineOffering();
                if (onlineOffering != null) {
                    str = onlineOffering.getDisplay_text();
                } else {
                    str = null;
                }
                robertoTextView.setText(str);
                ArrayList<LanguagePackagesModel> languages = therapistPackagesModel.getLanguages();
                String str3 = "";
                if (languages == null) {
                    str2 = "";
                } else {
                    str2 = "";
                    int i11 = 0;
                    for (Object obj : languages) {
                        int i12 = i11 + 1;
                        if (i11 >= 0) {
                            str2 = str2 + ((LanguagePackagesModel) obj).getName();
                            ArrayList<LanguagePackagesModel> languages2 = therapistPackagesModel.getLanguages();
                            i.d(languages2);
                            if (i11 != languages2.size() - 1 && (!n.B0(str2))) {
                                str2 = str2 + ", ";
                            }
                            i11 = i12;
                        } else {
                            ca.a.t1();
                            throw null;
                        }
                    }
                }
                aVar2.f31660z.setText(str2);
                ArrayList arrayList = new ArrayList();
                ArrayList<DomainAreaPackagesModel> domainareas = therapistPackagesModel.getDomainareas();
                i.f(domainareas, "it.domainareas");
                for (DomainAreaPackagesModel domainAreaPackagesModel : domainareas) {
                    arrayList.add(domainAreaPackagesModel.getName());
                }
                aVar2.A.setText(u.m2(arrayList, null, null, null, d.f31661u, 31));
                if (therapistPackagesModel.getCommercials().getMedium().contains("live")) {
                    str3 = "Video";
                }
                if (therapistPackagesModel.getCommercials().getMedium().contains("voice")) {
                    if (n.B0(str3)) {
                        str3 = "Voice";
                    } else {
                        str3 = str3 + ", Voice";
                    }
                }
                if (therapistPackagesModel.getCommercials().getMedium().contains("chat")) {
                    if (n.B0(str3)) {
                        str3 = "Chat";
                    } else {
                        str3 = str3 + ", Chat";
                    }
                }
                aVar2.B.setText(str3);
                String discountStrip = therapistPackagesModel.getStripDetails().getDiscountStrip();
                if (discountStrip != null && !n.B0(discountStrip)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ConstraintLayout constraintLayout2 = aVar2.C;
                if (z10) {
                    constraintLayout2.setVisibility(4);
                } else {
                    RobertoTextView robertoTextView2 = aVar2.D;
                    String discountStrip2 = therapistPackagesModel.getStripDetails().getDiscountStrip();
                    if (discountStrip2 != null) {
                        charSequence = r.i1(ca.a.Z(discountStrip2));
                    } else {
                        charSequence = null;
                    }
                    robertoTextView2.setText(charSequence);
                    constraintLayout2.setVisibility(0);
                }
                aVar2.E.setOnClickListener(new View.OnClickListener(this) { // from class: sl.b

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ c f31650v;

                    {
                        this.f31650v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i112 = r3;
                        TherapistPackagesModel it = therapistPackagesModel;
                        c this$0 = this.f31650v;
                        switch (i112) {
                            case 0:
                                i.g(this$0, "this$0");
                                i.g(it, "$it");
                                String uuid = it.getUuid();
                                i.f(uuid, "it.uuid");
                                this$0.f31654z.invoke(uuid, it.getFirstname() + ' ' + it.getLastname());
                                return;
                            default:
                                i.g(this$0, "this$0");
                                i.g(it, "$it");
                                String uuid2 = it.getUuid();
                                i.f(uuid2, "it.uuid");
                                this$0.A.invoke(uuid2, it.getFirstname() + ' ' + it.getLastname());
                                return;
                        }
                    }
                });
                if (therapistPackagesModel.getEarliest_available_datetime() != null) {
                    DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
                    Locale locale = Locale.ENGLISH;
                    LocalDateTime parse = LocalDateTime.parse(therapistPackagesModel.getEarliest_available_datetime(), ofPattern.withLocale(locale));
                    i.f(parse, "parse(it.earliest_available_datetime, dateFormat)");
                    String format = parse.format(DateTimeFormatter.ofPattern("EEE, dd MMM hh:mm a").withLocale(locale));
                    i.f(format, "bookingDate.format(requiredFormat)");
                    aVar2.F.setText(format);
                }
                String video = therapistPackagesModel.getVideo();
                if (video != null && !n.B0(video)) {
                    z11 = false;
                }
                AppCompatImageView appCompatImageView2 = aVar2.G;
                if (!z11) {
                    appCompatImageView.setOnClickListener(new dk.t(21, this, aVar2, therapistPackagesModel));
                    appCompatImageView2.setVisibility(0);
                    return;
                }
                appCompatImageView.setOnClickListener(null);
                appCompatImageView2.setVisibility(8);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.B, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        return new a(defpackage.e.h(parent, R.layout.row_for_you_provider_card, parent, false, "from(parent.context).inf…ider_card, parent, false)"));
    }
}
