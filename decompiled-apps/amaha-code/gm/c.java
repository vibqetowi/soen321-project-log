package gm;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.EducationPackagesModel;
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
import java.util.Locale;
import kotlin.jvm.internal.i;
import ss.s;
/* compiled from: MatchingCompletedProviderListAdapter.kt */
/* loaded from: classes2.dex */
public final class c extends RecyclerView.e<a> {
    public final String A = LogHelper.INSTANCE.makeLogTag("MatchingCompletedProviderListAdapter");

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<TherapistPackagesModel> f16619x;

    /* renamed from: y  reason: collision with root package name */
    public final s<String, String, Integer, String, Boolean, k> f16620y;

    /* renamed from: z  reason: collision with root package name */
    public final s<String, String, Integer, String, Boolean, k> f16621z;

    /* compiled from: MatchingCompletedProviderListAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public c(ArrayList arrayList, hm.b bVar, hm.c cVar) {
        this.f16619x = arrayList;
        this.f16620y = bVar;
        this.f16621z = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f16619x.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01d7 A[Catch: Exception -> 0x029c, TryCatch #0 {Exception -> 0x029c, blocks: (B:3:0x0006, B:5:0x0010, B:7:0x007e, B:9:0x0088, B:12:0x00a2, B:13:0x00a8, B:15:0x00ae, B:17:0x00b6, B:20:0x00c7, B:23:0x00d6, B:25:0x00eb, B:27:0x00f2, B:29:0x0103, B:30:0x0106, B:32:0x0108, B:34:0x011a, B:35:0x011f, B:37:0x0125, B:39:0x012d, B:41:0x0150, B:43:0x0157, B:45:0x0168, B:46:0x016b, B:47:0x016c, B:49:0x017e, B:50:0x01b6, B:52:0x01bc, B:59:0x01d7, B:61:0x028a, B:60:0x0238), top: B:66:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0238 A[Catch: Exception -> 0x029c, TryCatch #0 {Exception -> 0x029c, blocks: (B:3:0x0006, B:5:0x0010, B:7:0x007e, B:9:0x0088, B:12:0x00a2, B:13:0x00a8, B:15:0x00ae, B:17:0x00b6, B:20:0x00c7, B:23:0x00d6, B:25:0x00eb, B:27:0x00f2, B:29:0x0103, B:30:0x0106, B:32:0x0108, B:34:0x011a, B:35:0x011f, B:37:0x0125, B:39:0x012d, B:41:0x0150, B:43:0x0157, B:45:0x0168, B:46:0x016b, B:47:0x016c, B:49:0x017e, B:50:0x01b6, B:52:0x01bc, B:59:0x01d7, B:61:0x028a, B:60:0x0238), top: B:66:0x0006 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(a aVar, final int i6) {
        Integer num;
        String str;
        boolean z10;
        View view = aVar.f2751a;
        try {
            final TherapistPackagesModel therapistPackagesModel = (TherapistPackagesModel) u.j2(i6, this.f16619x);
            if (therapistPackagesModel != null) {
                view.setOnClickListener(new View.OnClickListener(this) { // from class: gm.b

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ c f16616v;

                    {
                        this.f16616v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i10 = r4;
                        int i11 = i6;
                        TherapistPackagesModel it = therapistPackagesModel;
                        c this$0 = this.f16616v;
                        switch (i10) {
                            case 0:
                                i.g(this$0, "this$0");
                                i.g(it, "$it");
                                s<String, String, Integer, String, Boolean, k> sVar = this$0.f16620y;
                                String uuid = it.getUuid();
                                i.f(uuid, "it.uuid");
                                Integer valueOf = Integer.valueOf(i11);
                                String earliest_available_datetime = it.getEarliest_available_datetime();
                                i.f(earliest_available_datetime, "it.earliest_available_datetime");
                                sVar.y(uuid, it.getFirstname() + ' ' + it.getLastname(), valueOf, earliest_available_datetime, Boolean.valueOf(it.isIs_inhouse()));
                                return;
                            default:
                                i.g(this$0, "this$0");
                                i.g(it, "$it");
                                s<String, String, Integer, String, Boolean, k> sVar2 = this$0.f16621z;
                                String uuid2 = it.getUuid();
                                i.f(uuid2, "it.uuid");
                                Integer valueOf2 = Integer.valueOf(i11);
                                String earliest_available_datetime2 = it.getEarliest_available_datetime();
                                i.f(earliest_available_datetime2, "it.earliest_available_datetime");
                                sVar2.y(uuid2, it.getFirstname() + ' ' + it.getLastname(), valueOf2, earliest_available_datetime2, Boolean.valueOf(it.isIs_inhouse()));
                                return;
                        }
                    }
                });
                Glide.g(view.getContext()).p("https:" + therapistPackagesModel.getImage()).B((ShapeableImageView) view.findViewById(R.id.clRowProviderImage));
                ((RobertoTextView) view.findViewById(R.id.tvRowTcProviderName)).setText(view.getContext().getString(R.string.profileNewSessionsName, therapistPackagesModel.getFirstname(), therapistPackagesModel.getLastname()));
                RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvRowProviderExperience);
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
                ArrayList<EducationPackagesModel> educations = therapistPackagesModel.getEducations();
                String str2 = "";
                if (educations == null) {
                    str = "";
                } else {
                    str = "";
                    int i10 = 0;
                    for (Object obj : educations) {
                        int i11 = i10 + 1;
                        if (i10 >= 0) {
                            EducationPackagesModel educationPackagesModel = (EducationPackagesModel) obj;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            String degree = educationPackagesModel.getDegree();
                            if (degree == null) {
                                degree = "";
                            }
                            sb2.append(degree);
                            sb2.append(' ');
                            String major = educationPackagesModel.getMajor();
                            if (major == null) {
                                major = "";
                            }
                            sb2.append(major);
                            str = sb2.toString();
                            ArrayList<EducationPackagesModel> educations2 = therapistPackagesModel.getEducations();
                            i.d(educations2);
                            if (i10 != educations2.size() - 1 && (!n.B0(str))) {
                                str = str + ", ";
                            }
                            i10 = i11;
                        } else {
                            ca.a.t1();
                            throw null;
                        }
                    }
                }
                ((RobertoTextView) view.findViewById(R.id.tvRowProviderEducation)).setText(str);
                ArrayList<LanguagePackagesModel> languages = therapistPackagesModel.getLanguages();
                if (languages != null) {
                    int i12 = 0;
                    for (Object obj2 : languages) {
                        int i13 = i12 + 1;
                        if (i12 >= 0) {
                            str2 = str2 + ((LanguagePackagesModel) obj2).getName();
                            ArrayList<LanguagePackagesModel> languages2 = therapistPackagesModel.getLanguages();
                            i.d(languages2);
                            if (i12 != languages2.size() - 1 && (!n.B0(str2))) {
                                str2 = str2 + ", ";
                            }
                            i12 = i13;
                        } else {
                            ca.a.t1();
                            throw null;
                        }
                    }
                }
                ((RobertoTextView) view.findViewById(R.id.tvRowProviderLanguages)).setText(str2);
                if (therapistPackagesModel.getEarliest_available_datetime() != null) {
                    DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
                    Locale locale = Locale.ENGLISH;
                    LocalDateTime parse = LocalDateTime.parse(therapistPackagesModel.getEarliest_available_datetime(), ofPattern.withLocale(locale));
                    i.f(parse, "parse(it.earliest_available_datetime, dateFormat)");
                    String format = parse.format(DateTimeFormatter.ofPattern("EEE, dd MMM hh:mm a").withLocale(locale));
                    i.f(format, "bookingDate.format(requiredFormat)");
                    ((RobertoTextView) view.findViewById(R.id.tvRowProviderNextAvailable)).setText(format);
                }
                String about = therapistPackagesModel.getAbout();
                if (about != null && about.length() != 0) {
                    z10 = false;
                    if (z10) {
                        ((ShimmerFrameLayout) view.findViewById(R.id.shimmerProviderDescriptionLine1)).c();
                        ((ShimmerFrameLayout) view.findViewById(R.id.shimmerProviderDescriptionLine2)).c();
                        ((ShimmerFrameLayout) view.findViewById(R.id.shimmerProviderDescriptionLine3)).c();
                        ((ShimmerFrameLayout) view.findViewById(R.id.shimmerProviderDescriptionLine4)).c();
                        ((ShimmerFrameLayout) view.findViewById(R.id.shimmerProviderDescriptionLine1)).setVisibility(8);
                        ((ShimmerFrameLayout) view.findViewById(R.id.shimmerProviderDescriptionLine2)).setVisibility(8);
                        ((ShimmerFrameLayout) view.findViewById(R.id.shimmerProviderDescriptionLine3)).setVisibility(8);
                        ((ShimmerFrameLayout) view.findViewById(R.id.shimmerProviderDescriptionLine4)).setVisibility(8);
                        ((RobertoTextView) view.findViewById(R.id.tvRowTcProviderDescription)).setVisibility(0);
                        ((RobertoTextView) view.findViewById(R.id.tvRowTcProviderDescription)).setText(therapistPackagesModel.getAbout());
                    } else {
                        ((RobertoTextView) view.findViewById(R.id.tvRowTcProviderDescription)).setVisibility(4);
                        ((ShimmerFrameLayout) view.findViewById(R.id.shimmerProviderDescriptionLine1)).setVisibility(0);
                        ((ShimmerFrameLayout) view.findViewById(R.id.shimmerProviderDescriptionLine2)).setVisibility(0);
                        ((ShimmerFrameLayout) view.findViewById(R.id.shimmerProviderDescriptionLine3)).setVisibility(0);
                        ((ShimmerFrameLayout) view.findViewById(R.id.shimmerProviderDescriptionLine4)).setVisibility(0);
                        ((ShimmerFrameLayout) view.findViewById(R.id.shimmerProviderDescriptionLine1)).b();
                        ((ShimmerFrameLayout) view.findViewById(R.id.shimmerProviderDescriptionLine2)).b();
                        ((ShimmerFrameLayout) view.findViewById(R.id.shimmerProviderDescriptionLine3)).b();
                        ((ShimmerFrameLayout) view.findViewById(R.id.shimmerProviderDescriptionLine4)).b();
                    }
                    ((RobertoTextView) view.findViewById(R.id.tvRowProviderBookCta)).setOnClickListener(new View.OnClickListener(this) { // from class: gm.b

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ c f16616v;

                        {
                            this.f16616v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i102 = r4;
                            int i112 = i6;
                            TherapistPackagesModel it = therapistPackagesModel;
                            c this$0 = this.f16616v;
                            switch (i102) {
                                case 0:
                                    i.g(this$0, "this$0");
                                    i.g(it, "$it");
                                    s<String, String, Integer, String, Boolean, k> sVar = this$0.f16620y;
                                    String uuid = it.getUuid();
                                    i.f(uuid, "it.uuid");
                                    Integer valueOf = Integer.valueOf(i112);
                                    String earliest_available_datetime = it.getEarliest_available_datetime();
                                    i.f(earliest_available_datetime, "it.earliest_available_datetime");
                                    sVar.y(uuid, it.getFirstname() + ' ' + it.getLastname(), valueOf, earliest_available_datetime, Boolean.valueOf(it.isIs_inhouse()));
                                    return;
                                default:
                                    i.g(this$0, "this$0");
                                    i.g(it, "$it");
                                    s<String, String, Integer, String, Boolean, k> sVar2 = this$0.f16621z;
                                    String uuid2 = it.getUuid();
                                    i.f(uuid2, "it.uuid");
                                    Integer valueOf2 = Integer.valueOf(i112);
                                    String earliest_available_datetime2 = it.getEarliest_available_datetime();
                                    i.f(earliest_available_datetime2, "it.earliest_available_datetime");
                                    sVar2.y(uuid2, it.getFirstname() + ' ' + it.getLastname(), valueOf2, earliest_available_datetime2, Boolean.valueOf(it.isIs_inhouse()));
                                    return;
                            }
                        }
                    });
                }
                z10 = true;
                if (z10) {
                }
                ((RobertoTextView) view.findViewById(R.id.tvRowProviderBookCta)).setOnClickListener(new View.OnClickListener(this) { // from class: gm.b

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ c f16616v;

                    {
                        this.f16616v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i102 = r4;
                        int i112 = i6;
                        TherapistPackagesModel it = therapistPackagesModel;
                        c this$0 = this.f16616v;
                        switch (i102) {
                            case 0:
                                i.g(this$0, "this$0");
                                i.g(it, "$it");
                                s<String, String, Integer, String, Boolean, k> sVar = this$0.f16620y;
                                String uuid = it.getUuid();
                                i.f(uuid, "it.uuid");
                                Integer valueOf = Integer.valueOf(i112);
                                String earliest_available_datetime = it.getEarliest_available_datetime();
                                i.f(earliest_available_datetime, "it.earliest_available_datetime");
                                sVar.y(uuid, it.getFirstname() + ' ' + it.getLastname(), valueOf, earliest_available_datetime, Boolean.valueOf(it.isIs_inhouse()));
                                return;
                            default:
                                i.g(this$0, "this$0");
                                i.g(it, "$it");
                                s<String, String, Integer, String, Boolean, k> sVar2 = this$0.f16621z;
                                String uuid2 = it.getUuid();
                                i.f(uuid2, "it.uuid");
                                Integer valueOf2 = Integer.valueOf(i112);
                                String earliest_available_datetime2 = it.getEarliest_available_datetime();
                                i.f(earliest_available_datetime2, "it.earliest_available_datetime");
                                sVar2.y(uuid2, it.getFirstname() + ' ' + it.getLastname(), valueOf2, earliest_available_datetime2, Boolean.valueOf(it.isIs_inhouse()));
                                return;
                        }
                    }
                });
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        return new a(e.h(parent, R.layout.row_matching_completed_provider_list_item, parent, false, "from(parent.context)\n   …list_item, parent, false)"));
    }
}
