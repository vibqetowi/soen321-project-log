package ao;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bo.c;
import bo.d;
import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.telecommunications.model.CommercialsPackageModel;
import com.theinnerhour.b2b.components.telecommunications.model.OnlineOfferingModel;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.DomainAreaPackagesModel;
import com.theinnerhour.b2b.model.ExperiencePackagesModel;
import com.theinnerhour.b2b.model.LanguagePackagesModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import hs.k;
import is.u;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.i;
import nn.g;
import ss.p;
/* compiled from: MatchingResultAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.e<C0046b> {
    public final p<String, String, k> A;
    public final String B = LogHelper.INSTANCE.makeLogTag("ExpertCareInfoProvidersAdapter");

    /* renamed from: x  reason: collision with root package name */
    public final List<TherapistPackagesModel> f3361x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f3362y;

    /* renamed from: z  reason: collision with root package name */
    public final p<String, String, k> f3363z;

    /* compiled from: MatchingResultAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.e<C0045a> {

        /* renamed from: x  reason: collision with root package name */
        public final ArrayList<String> f3364x;

        /* compiled from: MatchingResultAdapter.kt */
        /* renamed from: ao.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0045a extends RecyclerView.c0 {
            public C0045a(View view) {
                super(view);
            }
        }

        public a(ArrayList<String> arrayList) {
            this.f3364x = arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int f() {
            return this.f3364x.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void n(C0045a c0045a, int i6) {
            ((RobertoTextView) c0045a.f2751a.findViewById(R.id.tvRowProviderExpertiseLabel)).setText(this.f3364x.get(i6));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.c0 p(int i6, RecyclerView parent) {
            i.g(parent, "parent");
            return new C0045a(e.h(parent, R.layout.row_matching_result_expertise_item, parent, false, "from(parent.context).inf…tise_item, parent, false)"));
        }
    }

    /* compiled from: MatchingResultAdapter.kt */
    /* renamed from: ao.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0046b extends RecyclerView.c0 {
        public C0046b(View view) {
            super(view);
        }
    }

    public b(ArrayList arrayList, boolean z10, c cVar, d dVar) {
        this.f3361x = arrayList;
        this.f3362y = z10;
        this.f3363z = cVar;
        this.A = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f3361x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(C0046b c0046b, int i6) {
        Integer num;
        String str;
        String str2;
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList<String> medium;
        ArrayList<String> medium2;
        ArrayList<String> medium3;
        View view = c0046b.f2751a;
        try {
            final TherapistPackagesModel therapistPackagesModel = (TherapistPackagesModel) u.j2(i6, this.f3361x);
            if (therapistPackagesModel != null) {
                view.setOnClickListener(new View.OnClickListener(this) { // from class: ao.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ b f3359v;

                    {
                        this.f3359v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i10 = r3;
                        TherapistPackagesModel it = therapistPackagesModel;
                        b this$0 = this.f3359v;
                        switch (i10) {
                            case 0:
                                i.g(this$0, "this$0");
                                i.g(it, "$it");
                                String uuid = it.getUuid();
                                i.f(uuid, "it.uuid");
                                this$0.f3363z.invoke(uuid, it.getFirstname() + ' ' + it.getLastname());
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
                Glide.g(view.getContext()).p("https:" + therapistPackagesModel.getImage()).B((ShapeableImageView) view.findViewById(R.id.clRowProviderImage));
                boolean z13 = true;
                ((RobertoTextView) view.findViewById(R.id.clRowProviderName)).setText(view.getContext().getString(R.string.profileNewSessionsName, therapistPackagesModel.getFirstname(), therapistPackagesModel.getLastname()));
                RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.clRowProviderInfo);
                Context context = view.getContext();
                Object[] objArr = new Object[1];
                ExperiencePackagesModel experience = therapistPackagesModel.getExperience();
                if (experience != null) {
                    num = Integer.valueOf(experience.getYear());
                } else {
                    num = null;
                }
                objArr[0] = String.valueOf(num);
                robertoTextView.setText(context.getString(R.string.onBoardingListExperienceInfo, objArr));
                RobertoTextView robertoTextView2 = (RobertoTextView) view.findViewById(R.id.clRowProviderPrice);
                OnlineOfferingModel onlineOffering = therapistPackagesModel.getOnlineOffering();
                if (onlineOffering != null) {
                    str = onlineOffering.getDisplay_text();
                } else {
                    str = null;
                }
                robertoTextView2.setText(str);
                ArrayList<LanguagePackagesModel> languages = therapistPackagesModel.getLanguages();
                String str3 = "";
                if (languages == null) {
                    str2 = "";
                } else {
                    str2 = "";
                    int i10 = 0;
                    for (Object obj : languages) {
                        int i11 = i10 + 1;
                        if (i10 >= 0) {
                            str2 = str2 + ((LanguagePackagesModel) obj).getName();
                            ArrayList<LanguagePackagesModel> languages2 = therapistPackagesModel.getLanguages();
                            i.d(languages2);
                            if (i10 != languages2.size() - 1 && (!n.B0(str2))) {
                                str2 = str2 + ", ";
                            }
                            i10 = i11;
                        } else {
                            ca.a.t1();
                            throw null;
                        }
                    }
                }
                ((RobertoTextView) view.findViewById(R.id.tvRowProviderLanguages)).setText(str2);
                ArrayList arrayList = new ArrayList();
                ArrayList<DomainAreaPackagesModel> domainareas = therapistPackagesModel.getDomainareas();
                i.f(domainareas, "it.domainareas");
                for (DomainAreaPackagesModel domainAreaPackagesModel : domainareas) {
                    arrayList.add(domainAreaPackagesModel.getName());
                }
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rvRowTcProviderExpertise);
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
                }
                RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.rvRowTcProviderExpertise);
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(new a(arrayList));
                }
                CommercialsPackageModel commercials = therapistPackagesModel.getCommercials();
                if (commercials != null && (medium3 = commercials.getMedium()) != null && medium3.contains("live")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    str3 = "Video";
                }
                CommercialsPackageModel commercials2 = therapistPackagesModel.getCommercials();
                if (commercials2 != null && (medium2 = commercials2.getMedium()) != null && medium2.contains("voice")) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if (n.B0(str3)) {
                        str3 = "Voice";
                    } else {
                        str3 = str3 + ", Voice";
                    }
                }
                CommercialsPackageModel commercials3 = therapistPackagesModel.getCommercials();
                if (commercials3 != null && (medium = commercials3.getMedium()) != null && medium.contains("chat")) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (n.B0(str3)) {
                        str3 = "Chat";
                    } else {
                        str3 = str3 + ", Chat";
                    }
                }
                ((RobertoTextView) view.findViewById(R.id.tvRowProviderSessions)).setText(str3);
                ((RobertoTextView) view.findViewById(R.id.tvRowProviderBookCta)).setOnClickListener(new View.OnClickListener(this) { // from class: ao.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ b f3359v;

                    {
                        this.f3359v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i102 = r3;
                        TherapistPackagesModel it = therapistPackagesModel;
                        b this$0 = this.f3359v;
                        switch (i102) {
                            case 0:
                                i.g(this$0, "this$0");
                                i.g(it, "$it");
                                String uuid = it.getUuid();
                                i.f(uuid, "it.uuid");
                                this$0.f3363z.invoke(uuid, it.getFirstname() + ' ' + it.getLastname());
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
                    ((RobertoTextView) view.findViewById(R.id.tvRowProviderNextSessionInfo)).setText(format);
                }
                String video = therapistPackagesModel.getVideo();
                if (video != null && !n.B0(video)) {
                    z13 = false;
                }
                if (!z13) {
                    ((ShapeableImageView) view.findViewById(R.id.clRowProviderImage)).setOnClickListener(new g(3, view, therapistPackagesModel, this));
                    ((AppCompatImageView) view.findViewById(R.id.ivRowProviderVideoPlay)).setVisibility(0);
                    return;
                }
                ((ShapeableImageView) view.findViewById(R.id.clRowProviderImage)).setOnClickListener(null);
                ((AppCompatImageView) view.findViewById(R.id.ivRowProviderVideoPlay)).setVisibility(8);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.B, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        return new C0046b(e.h(parent, R.layout.row_matching_result_item, parent, false, "from(parent.context).inf…sult_item, parent, false)"));
    }
}
