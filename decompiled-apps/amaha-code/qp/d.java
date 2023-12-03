package qp;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.f;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.telecommunications.model.OnlineOfferingModel;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.DomainAreaPackagesModel;
import com.theinnerhour.b2b.model.EducationPackagesModel;
import com.theinnerhour.b2b.model.ExperiencePackagesModel;
import com.theinnerhour.b2b.model.LanguagePackagesModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import gv.r;
import hs.k;
import is.u;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.i;
import ss.q;
/* compiled from: DashboardProviderEntryVariantEAdapter.kt */
/* loaded from: classes2.dex */
public final class d extends RecyclerView.e<a> {
    public final q<String, String, Integer, k> A;
    public final String B;
    public final Context C;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<TherapistPackagesModel> f29998x;

    /* renamed from: y  reason: collision with root package name */
    public final q<String, String, Integer, k> f29999y;

    /* renamed from: z  reason: collision with root package name */
    public final q<String, String, Integer, k> f30000z;

    /* compiled from: DashboardProviderEntryVariantEAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public final AppCompatImageView A;
        public final AppCompatImageView B;
        public final RobertoTextView C;
        public final RobertoTextView D;
        public final RobertoTextView E;

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f30001u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f30002v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f30003w;

        /* renamed from: x  reason: collision with root package name */
        public final RobertoTextView f30004x;

        /* renamed from: y  reason: collision with root package name */
        public final RobertoTextView f30005y;

        /* renamed from: z  reason: collision with root package name */
        public final AppCompatImageView f30006z;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.tvProviderName);
            i.f(findViewById, "itemView.findViewById(R.id.tvProviderName)");
            this.f30001u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvRowDbProviderEntryVar2Point1);
            i.f(findViewById2, "itemView.findViewById(R.…bProviderEntryVar2Point1)");
            this.f30002v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvRowDbProviderEntryVar2Point2);
            i.f(findViewById3, "itemView.findViewById(R.…bProviderEntryVar2Point2)");
            this.f30003w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvRowDbProviderEntryVar2Point3);
            i.f(findViewById4, "itemView.findViewById(R.…bProviderEntryVar2Point3)");
            this.f30004x = (RobertoTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.tvRowDbProviderEntryVar2Point4);
            i.f(findViewById5, "itemView.findViewById(R.…bProviderEntryVar2Point4)");
            this.f30005y = (RobertoTextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.ivRowDbProviderEntryVar2Provider);
            i.f(findViewById6, "itemView.findViewById(R.…roviderEntryVar2Provider)");
            this.f30006z = (AppCompatImageView) findViewById6;
            View findViewById7 = view.findViewById(R.id.ivProviderVideo);
            i.f(findViewById7, "itemView.findViewById(R.id.ivProviderVideo)");
            this.A = (AppCompatImageView) findViewById7;
            View findViewById8 = view.findViewById(R.id.ivVideoPlayback);
            i.f(findViewById8, "itemView.findViewById(R.id.ivVideoPlayback)");
            this.B = (AppCompatImageView) findViewById8;
            View findViewById9 = view.findViewById(R.id.tvProviderCardFooterText);
            i.f(findViewById9, "itemView.findViewById(R.…tvProviderCardFooterText)");
            this.C = (RobertoTextView) findViewById9;
            View findViewById10 = view.findViewById(R.id.tvProviderBookCta);
            i.f(findViewById10, "itemView.findViewById(R.id.tvProviderBookCta)");
            this.D = (RobertoTextView) findViewById10;
            View findViewById11 = view.findViewById(R.id.tvProviderCardRecommended);
            i.f(findViewById11, "itemView.findViewById(R.…vProviderCardRecommended)");
            this.E = (RobertoTextView) findViewById11;
        }
    }

    public d(p pVar, ArrayList providerList, q qVar, q qVar2, q qVar3) {
        i.g(providerList, "providerList");
        this.f29998x = providerList;
        this.f29999y = qVar;
        this.f30000z = qVar2;
        this.A = qVar3;
        this.B = LogHelper.INSTANCE.makeLogTag("DashboardProviderEntryVariantEAdapter");
        this.C = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        if (this.f29998x.size() > 0) {
            return 10001;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, final int i6) {
        String str;
        Integer num;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z10;
        String str6;
        a aVar2 = aVar;
        Context context = this.C;
        String str7 = "";
        AppCompatImageView appCompatImageView = aVar2.f30006z;
        View view = aVar2.f2751a;
        try {
            int size = i6 % this.f29998x.size();
            boolean z11 = true;
            int i10 = 3;
            if (size != 0) {
                if (size != 1) {
                    if (size != 2) {
                        if (size != 3) {
                        }
                        i10 = 2;
                    } else {
                        int size2 = this.f29998x.size();
                        if (size2 != 3) {
                            if (size2 != 4) {
                                i10 = 4;
                            }
                        }
                    }
                    i10 = 0;
                } else {
                    int size3 = this.f29998x.size();
                    if (size3 != 3) {
                        if (size3 != 4) {
                        }
                        i10 = 1;
                    }
                    i10 = 2;
                }
            } else {
                int size4 = this.f29998x.size();
                if (size4 != 3) {
                    if (size4 != 4) {
                    }
                    i10 = 0;
                }
                i10 = 1;
            }
            final TherapistPackagesModel therapistPackagesModel = (TherapistPackagesModel) u.j2(i10, this.f29998x);
            if (therapistPackagesModel != null) {
                RobertoTextView robertoTextView = aVar2.f30001u;
                StringBuilder sb2 = new StringBuilder("");
                String firstname = therapistPackagesModel.getFirstname();
                if (firstname == null) {
                    firstname = "";
                }
                sb2.append(firstname);
                sb2.append(' ');
                String lastname = therapistPackagesModel.getLastname();
                if (lastname == null) {
                    lastname = "";
                }
                sb2.append(lastname);
                robertoTextView.setText(sb2.toString());
                ArrayList<EducationPackagesModel> educations = therapistPackagesModel.getEducations();
                if (educations == null) {
                    str = "";
                } else {
                    str = "";
                    int i11 = 0;
                    for (Object obj : educations) {
                        int i12 = i11 + 1;
                        if (i11 >= 0) {
                            EducationPackagesModel educationPackagesModel = (EducationPackagesModel) obj;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str);
                            String degree = educationPackagesModel.getDegree();
                            if (degree == null) {
                                degree = "";
                            }
                            sb3.append(degree);
                            sb3.append(' ');
                            String major = educationPackagesModel.getMajor();
                            if (major == null) {
                                major = "";
                            }
                            sb3.append(major);
                            String sb4 = sb3.toString();
                            ArrayList<EducationPackagesModel> educations2 = therapistPackagesModel.getEducations();
                            i.d(educations2);
                            if (i11 != educations2.size() - 1 && !n.B0(sb4)) {
                                str = sb4 + ", ";
                            } else {
                                str = sb4;
                            }
                            i11 = i12;
                        } else {
                            ca.a.t1();
                            throw null;
                        }
                    }
                }
                aVar2.f30002v.setText(str);
                RobertoTextView robertoTextView2 = aVar2.f30003w;
                StringBuilder sb5 = new StringBuilder();
                ExperiencePackagesModel experience = therapistPackagesModel.getExperience();
                if (experience != null) {
                    num = Integer.valueOf(experience.getYear());
                } else {
                    num = null;
                }
                sb5.append(num);
                sb5.append(" yrs. exp.");
                robertoTextView2.setText(sb5.toString());
                ArrayList<LanguagePackagesModel> languages = therapistPackagesModel.getLanguages();
                if (languages == null) {
                    str2 = "";
                } else {
                    str2 = "";
                    int i13 = 0;
                    for (Object obj2 : languages) {
                        int i14 = i13 + 1;
                        if (i13 >= 0) {
                            String str8 = str2 + ((LanguagePackagesModel) obj2).getName();
                            ArrayList<LanguagePackagesModel> languages2 = therapistPackagesModel.getLanguages();
                            i.d(languages2);
                            if (i13 != languages2.size() - 1 && (!n.B0(str8))) {
                                str8 = str8 + ", ";
                            }
                            str2 = str8;
                            i13 = i14;
                        } else {
                            ca.a.t1();
                            throw null;
                        }
                    }
                }
                aVar2.f30004x.setText(str2);
                ArrayList<DomainAreaPackagesModel> domainareas = therapistPackagesModel.getDomainareas();
                if (domainareas != null) {
                    str4 = "";
                    int i15 = 0;
                    for (Object obj3 : domainareas) {
                        int i16 = i15 + 1;
                        if (i15 >= 0) {
                            str4 = str4 + ((DomainAreaPackagesModel) obj3).getName();
                            ArrayList<DomainAreaPackagesModel> domainareas2 = therapistPackagesModel.getDomainareas();
                            i.d(domainareas2);
                            if (i15 != domainareas2.size() - 1 && (!n.B0(str4))) {
                                str4 = str4 + ", ";
                            }
                            i15 = i16;
                        } else {
                            ca.a.t1();
                            throw null;
                        }
                    }
                    str3 = null;
                } else {
                    str3 = null;
                    str4 = "";
                }
                aVar2.f30005y.setText(str4);
                OnlineOfferingModel onlineOffering = therapistPackagesModel.getOnlineOffering();
                String earliest_available_date = therapistPackagesModel.getEarliest_available_date();
                i.f(earliest_available_date, "providerData.earliest_available_date");
                String string = context.getString(R.string.providerNextAvailableSlot, v(earliest_available_date));
                i.f(string, "context.getString(R.stri…earliest_available_date))");
                if (onlineOffering != null) {
                    str5 = onlineOffering.getDisplay_text();
                } else {
                    str5 = str3;
                }
                if (str5 != null && str5.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                RobertoTextView robertoTextView3 = aVar2.C;
                if (z10) {
                    robertoTextView3.setText(string);
                } else {
                    Object[] objArr = new Object[2];
                    if (onlineOffering != null) {
                        str6 = onlineOffering.getDisplay_text();
                    } else {
                        str6 = str3;
                    }
                    if (str6 != null) {
                        str7 = str6;
                    }
                    objArr[0] = str7;
                    objArr[1] = string;
                    robertoTextView3.setText(context.getString(R.string.learningHubExperimentSubHeader, objArr));
                }
                f g5 = Glide.g(view.getContext());
                g5.getClass();
                g5.b(new f.b(appCompatImageView));
                Glide.g(view.getContext()).p("https:" + therapistPackagesModel.getImage()).B(appCompatImageView);
                boolean isIs_recommended = therapistPackagesModel.isIs_recommended();
                RobertoTextView robertoTextView4 = aVar2.E;
                if (isIs_recommended) {
                    robertoTextView4.setVisibility(0);
                    robertoTextView4.setText(view.getContext().getString(R.string.telecommunicationsListRecommended));
                } else {
                    robertoTextView4.setVisibility(8);
                }
                String video = therapistPackagesModel.getVideo();
                if (video != null && video.length() != 0) {
                    z11 = false;
                }
                AppCompatImageView appCompatImageView2 = aVar2.B;
                AppCompatImageView appCompatImageView3 = aVar2.A;
                if (z11) {
                    appCompatImageView3.setVisibility(8);
                    appCompatImageView2.setVisibility(8);
                } else {
                    f g10 = Glide.g(view.getContext());
                    g10.getClass();
                    g10.b(new f.b(appCompatImageView3));
                    Glide.g(view.getContext()).p(therapistPackagesModel.getVideo_thumb()).B(appCompatImageView3);
                    appCompatImageView3.setVisibility(0);
                    appCompatImageView2.setVisibility(0);
                }
                final int i17 = i10;
                appCompatImageView3.setOnClickListener(new View.OnClickListener(this) { // from class: qp.c

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ d f29994v;

                    {
                        this.f29994v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i18 = r5;
                        int i19 = 0;
                        int i20 = i6;
                        int i21 = i17;
                        TherapistPackagesModel providerData = therapistPackagesModel;
                        d this$0 = this.f29994v;
                        switch (i18) {
                            case 0:
                                i.g(this$0, "this$0");
                                i.g(providerData, "$providerData");
                                int size5 = this$0.f29998x.size();
                                if (size5 != 3) {
                                    if (size5 != 4) {
                                        if (i21 != 0) {
                                            if (i21 != 1) {
                                                if (i21 != 2) {
                                                    if (i21 != 3) {
                                                        i19 = 3;
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                } else {
                                                    i19 = 4;
                                                }
                                            } else {
                                                i19 = 1;
                                            }
                                        }
                                    } else {
                                        i19 = i20 % this$0.f29998x.size();
                                    }
                                } else {
                                    i19 = i21;
                                }
                                String uuid = providerData.getUuid();
                                i.f(uuid, "providerData.uuid");
                                String video2 = providerData.getVideo();
                                i.f(video2, "providerData.video");
                                this$0.f30000z.invoke(uuid, video2, Integer.valueOf(i19));
                                return;
                            case 1:
                                i.g(this$0, "this$0");
                                i.g(providerData, "$providerData");
                                int size6 = this$0.f29998x.size();
                                if (size6 != 3) {
                                    if (size6 != 4) {
                                        if (i21 != 0) {
                                            if (i21 != 1) {
                                                if (i21 != 2) {
                                                    if (i21 != 3) {
                                                        i19 = 3;
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                } else {
                                                    i19 = 4;
                                                }
                                            } else {
                                                i19 = 1;
                                            }
                                        }
                                    } else {
                                        i19 = i20 % this$0.f29998x.size();
                                    }
                                } else {
                                    i19 = i21;
                                }
                                String uuid2 = providerData.getUuid();
                                i.f(uuid2, "providerData.uuid");
                                this$0.A.invoke(uuid2, "therapist", Integer.valueOf(i19));
                                return;
                            default:
                                i.g(this$0, "this$0");
                                i.g(providerData, "$providerData");
                                int size7 = this$0.f29998x.size();
                                if (size7 != 3) {
                                    if (size7 != 4) {
                                        if (i21 != 0) {
                                            if (i21 != 1) {
                                                if (i21 != 2) {
                                                    if (i21 != 3) {
                                                        i19 = 3;
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                } else {
                                                    i19 = 4;
                                                }
                                            } else {
                                                i19 = 1;
                                            }
                                        }
                                    } else {
                                        i19 = i20 % this$0.f29998x.size();
                                    }
                                } else {
                                    i19 = i21;
                                }
                                String uuid3 = providerData.getUuid();
                                i.f(uuid3, "providerData.uuid");
                                this$0.f29999y.invoke(uuid3, providerData.getFirstname() + ' ' + providerData.getLastname(), Integer.valueOf(i19));
                                return;
                        }
                    }
                });
                final int i18 = i10;
                aVar2.D.setOnClickListener(new View.OnClickListener(this) { // from class: qp.c

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ d f29994v;

                    {
                        this.f29994v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i182 = r5;
                        int i19 = 0;
                        int i20 = i6;
                        int i21 = i18;
                        TherapistPackagesModel providerData = therapistPackagesModel;
                        d this$0 = this.f29994v;
                        switch (i182) {
                            case 0:
                                i.g(this$0, "this$0");
                                i.g(providerData, "$providerData");
                                int size5 = this$0.f29998x.size();
                                if (size5 != 3) {
                                    if (size5 != 4) {
                                        if (i21 != 0) {
                                            if (i21 != 1) {
                                                if (i21 != 2) {
                                                    if (i21 != 3) {
                                                        i19 = 3;
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                } else {
                                                    i19 = 4;
                                                }
                                            } else {
                                                i19 = 1;
                                            }
                                        }
                                    } else {
                                        i19 = i20 % this$0.f29998x.size();
                                    }
                                } else {
                                    i19 = i21;
                                }
                                String uuid = providerData.getUuid();
                                i.f(uuid, "providerData.uuid");
                                String video2 = providerData.getVideo();
                                i.f(video2, "providerData.video");
                                this$0.f30000z.invoke(uuid, video2, Integer.valueOf(i19));
                                return;
                            case 1:
                                i.g(this$0, "this$0");
                                i.g(providerData, "$providerData");
                                int size6 = this$0.f29998x.size();
                                if (size6 != 3) {
                                    if (size6 != 4) {
                                        if (i21 != 0) {
                                            if (i21 != 1) {
                                                if (i21 != 2) {
                                                    if (i21 != 3) {
                                                        i19 = 3;
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                } else {
                                                    i19 = 4;
                                                }
                                            } else {
                                                i19 = 1;
                                            }
                                        }
                                    } else {
                                        i19 = i20 % this$0.f29998x.size();
                                    }
                                } else {
                                    i19 = i21;
                                }
                                String uuid2 = providerData.getUuid();
                                i.f(uuid2, "providerData.uuid");
                                this$0.A.invoke(uuid2, "therapist", Integer.valueOf(i19));
                                return;
                            default:
                                i.g(this$0, "this$0");
                                i.g(providerData, "$providerData");
                                int size7 = this$0.f29998x.size();
                                if (size7 != 3) {
                                    if (size7 != 4) {
                                        if (i21 != 0) {
                                            if (i21 != 1) {
                                                if (i21 != 2) {
                                                    if (i21 != 3) {
                                                        i19 = 3;
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                } else {
                                                    i19 = 4;
                                                }
                                            } else {
                                                i19 = 1;
                                            }
                                        }
                                    } else {
                                        i19 = i20 % this$0.f29998x.size();
                                    }
                                } else {
                                    i19 = i21;
                                }
                                String uuid3 = providerData.getUuid();
                                i.f(uuid3, "providerData.uuid");
                                this$0.f29999y.invoke(uuid3, providerData.getFirstname() + ' ' + providerData.getLastname(), Integer.valueOf(i19));
                                return;
                        }
                    }
                });
                final int i19 = i10;
                view.setOnClickListener(new View.OnClickListener(this) { // from class: qp.c

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ d f29994v;

                    {
                        this.f29994v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i182 = r5;
                        int i192 = 0;
                        int i20 = i6;
                        int i21 = i19;
                        TherapistPackagesModel providerData = therapistPackagesModel;
                        d this$0 = this.f29994v;
                        switch (i182) {
                            case 0:
                                i.g(this$0, "this$0");
                                i.g(providerData, "$providerData");
                                int size5 = this$0.f29998x.size();
                                if (size5 != 3) {
                                    if (size5 != 4) {
                                        if (i21 != 0) {
                                            if (i21 != 1) {
                                                if (i21 != 2) {
                                                    if (i21 != 3) {
                                                        i192 = 3;
                                                    } else {
                                                        i192 = 2;
                                                    }
                                                } else {
                                                    i192 = 4;
                                                }
                                            } else {
                                                i192 = 1;
                                            }
                                        }
                                    } else {
                                        i192 = i20 % this$0.f29998x.size();
                                    }
                                } else {
                                    i192 = i21;
                                }
                                String uuid = providerData.getUuid();
                                i.f(uuid, "providerData.uuid");
                                String video2 = providerData.getVideo();
                                i.f(video2, "providerData.video");
                                this$0.f30000z.invoke(uuid, video2, Integer.valueOf(i192));
                                return;
                            case 1:
                                i.g(this$0, "this$0");
                                i.g(providerData, "$providerData");
                                int size6 = this$0.f29998x.size();
                                if (size6 != 3) {
                                    if (size6 != 4) {
                                        if (i21 != 0) {
                                            if (i21 != 1) {
                                                if (i21 != 2) {
                                                    if (i21 != 3) {
                                                        i192 = 3;
                                                    } else {
                                                        i192 = 2;
                                                    }
                                                } else {
                                                    i192 = 4;
                                                }
                                            } else {
                                                i192 = 1;
                                            }
                                        }
                                    } else {
                                        i192 = i20 % this$0.f29998x.size();
                                    }
                                } else {
                                    i192 = i21;
                                }
                                String uuid2 = providerData.getUuid();
                                i.f(uuid2, "providerData.uuid");
                                this$0.A.invoke(uuid2, "therapist", Integer.valueOf(i192));
                                return;
                            default:
                                i.g(this$0, "this$0");
                                i.g(providerData, "$providerData");
                                int size7 = this$0.f29998x.size();
                                if (size7 != 3) {
                                    if (size7 != 4) {
                                        if (i21 != 0) {
                                            if (i21 != 1) {
                                                if (i21 != 2) {
                                                    if (i21 != 3) {
                                                        i192 = 3;
                                                    } else {
                                                        i192 = 2;
                                                    }
                                                } else {
                                                    i192 = 4;
                                                }
                                            } else {
                                                i192 = 1;
                                            }
                                        }
                                    } else {
                                        i192 = i20 % this$0.f29998x.size();
                                    }
                                } else {
                                    i192 = i21;
                                }
                                String uuid3 = providerData.getUuid();
                                i.f(uuid3, "providerData.uuid");
                                this$0.f29999y.invoke(uuid3, providerData.getFirstname() + ' ' + providerData.getLastname(), Integer.valueOf(i192));
                                return;
                        }
                    }
                });
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.B, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        return new a(e.h(parent, R.layout.row_dashboard_provider_entry_layout_var_e, parent, false, "from(parent.context).inf…out_var_e, parent, false)"));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016f A[Catch: Exception -> 0x0198, TryCatch #0 {Exception -> 0x0198, blocks: (B:2:0x0000, B:6:0x0039, B:10:0x0042, B:21:0x0083, B:25:0x008f, B:26:0x0092, B:99:0x017c, B:55:0x00f1, B:59:0x00ff, B:63:0x010d, B:67:0x011b, B:71:0x0127, B:75:0x0133, B:79:0x013f, B:83:0x014b, B:87:0x0157, B:28:0x0097, B:31:0x00a1, B:34:0x00ab, B:37:0x00b5, B:40:0x00bf, B:43:0x00c9, B:46:0x00d3, B:49:0x00dd, B:52:0x00e7, B:91:0x0163, B:95:0x016f, B:13:0x006c), top: B:104:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String v(String str) {
        String str2;
        String str3;
        Calendar calendar;
        Utils utils;
        String str4;
        int hashCode;
        String str5;
        try {
            String[] strArr = (String[]) r.a1(str, new String[]{"-"}, 0, 6).toArray(new String[0]);
            String str6 = strArr[0];
            str2 = strArr[1];
            str3 = strArr[2];
            Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(str);
            calendar = Calendar.getInstance();
            calendar.setTime(parse);
            utils = Utils.INSTANCE;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.B, e10);
            return str;
        }
        if (utils.isToday(calendar)) {
            return "Today";
        }
        if (utils.isTomorrow(calendar, 1)) {
            return "Tomorrow";
        }
        if (!is.k.Q1(Integer.valueOf(Integer.parseInt(str3)), new Integer[]{11, 12, 13})) {
            int parseInt = Integer.parseInt(str3) % 10;
            if (parseInt != 1) {
                if (parseInt != 2) {
                    if (parseInt == 3) {
                        str4 = "rd";
                    }
                } else {
                    str4 = "nd";
                }
            } else {
                str4 = "st";
            }
            hashCode = str2.hashCode();
            if (hashCode == 1567) {
                if (hashCode != 1568) {
                    switch (hashCode) {
                        case com.appsflyer.R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                            if (!str2.equals("1")) {
                                str5 = "Dec";
                                break;
                            }
                            str5 = "Jan";
                            break;
                        case 50:
                            if (!str2.equals("2")) {
                                str5 = "Dec";
                                break;
                            }
                            str5 = "Feb";
                            break;
                        case com.appsflyer.R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                            if (!str2.equals("3")) {
                                str5 = "Dec";
                                break;
                            }
                            str5 = "Mar";
                            break;
                        case com.appsflyer.R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                            if (!str2.equals("4")) {
                                str5 = "Dec";
                                break;
                            }
                            str5 = "Apr";
                            break;
                        case com.appsflyer.R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                            if (!str2.equals("5")) {
                                str5 = "Dec";
                                break;
                            }
                            str5 = "May";
                            break;
                        case com.appsflyer.R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                            if (!str2.equals("6")) {
                                str5 = "Dec";
                                break;
                            }
                            str5 = "Jun";
                            break;
                        case com.appsflyer.R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                            if (!str2.equals("7")) {
                                str5 = "Dec";
                                break;
                            }
                            str5 = "Jul";
                            break;
                        case com.appsflyer.R.styleable.AppCompatTheme_colorError /* 56 */:
                            if (!str2.equals("8")) {
                                str5 = "Dec";
                                break;
                            }
                            str5 = "Aug";
                            break;
                        case com.appsflyer.R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                            if (!str2.equals("9")) {
                                str5 = "Dec";
                                break;
                            }
                            str5 = "Sep";
                            break;
                        default:
                            switch (hashCode) {
                                case 1537:
                                    if (!str2.equals("01")) {
                                        str5 = "Dec";
                                        break;
                                    }
                                    str5 = "Jan";
                                    break;
                                case 1538:
                                    if (!str2.equals("02")) {
                                        str5 = "Dec";
                                        break;
                                    }
                                    str5 = "Feb";
                                    break;
                                case 1539:
                                    if (!str2.equals("03")) {
                                        str5 = "Dec";
                                        break;
                                    }
                                    str5 = "Mar";
                                    break;
                                case 1540:
                                    if (!str2.equals("04")) {
                                        str5 = "Dec";
                                        break;
                                    }
                                    str5 = "Apr";
                                    break;
                                case 1541:
                                    if (!str2.equals("05")) {
                                        str5 = "Dec";
                                        break;
                                    }
                                    str5 = "May";
                                    break;
                                case 1542:
                                    if (!str2.equals("06")) {
                                        str5 = "Dec";
                                        break;
                                    }
                                    str5 = "Jun";
                                    break;
                                case 1543:
                                    if (!str2.equals("07")) {
                                        str5 = "Dec";
                                        break;
                                    }
                                    str5 = "Jul";
                                    break;
                                case 1544:
                                    if (!str2.equals("08")) {
                                        str5 = "Dec";
                                        break;
                                    }
                                    str5 = "Aug";
                                    break;
                                case 1545:
                                    if (!str2.equals("09")) {
                                        str5 = "Dec";
                                        break;
                                    }
                                    str5 = "Sep";
                                    break;
                                default:
                                    str5 = "Dec";
                                    break;
                            }
                    }
                    return Integer.parseInt(str3) + str4 + ' ' + str5;
                } else if (str2.equals("11")) {
                    str5 = "Nov";
                    return Integer.parseInt(str3) + str4 + ' ' + str5;
                } else {
                    str5 = "Dec";
                    return Integer.parseInt(str3) + str4 + ' ' + str5;
                }
            }
            if (str2.equals("10")) {
                str5 = "Oct";
                return Integer.parseInt(str3) + str4 + ' ' + str5;
            }
            str5 = "Dec";
            return Integer.parseInt(str3) + str4 + ' ' + str5;
            LogHelper.INSTANCE.e(this.B, e10);
            return str;
        }
        str4 = "th";
        hashCode = str2.hashCode();
        if (hashCode == 1567) {
        }
        LogHelper.INSTANCE.e(this.B, e10);
        return str;
    }
}
