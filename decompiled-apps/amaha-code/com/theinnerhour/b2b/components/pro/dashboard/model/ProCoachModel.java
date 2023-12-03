package com.theinnerhour.b2b.components.pro.dashboard.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import gv.n;
import gv.r;
import gv.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import pl.a;
import tf.b;
import v.h;
/* compiled from: ProCoachModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\u0018\u00002\u00020\u0001:\u000234B÷\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012&\u0010\f\u001a\"\u0012\n\u0012\b\u0018\u00010\u000eR\u00020\u0000\u0018\u00010\rj\u0010\u0012\n\u0012\b\u0018\u00010\u000eR\u00020\u0000\u0018\u0001`\u000f\u0012\f\u0010\u0010\u001a\b\u0018\u00010\u0011R\u00020\u0000\u0012\u001e\u0010\u0012\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\rj\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u000f\u0012\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00030\rj\b\u0012\u0004\u0012\u00020\u0003`\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001aJ\u0006\u00102\u001a\u00020\u0003J\u0006\u0010+\u001a\u00020\u0003R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR!\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00030\rj\b\u0012\u0004\u0012\u00020\u0003`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR1\u0010\f\u001a\"\u0012\n\u0012\b\u0018\u00010\u000eR\u00020\u0000\u0018\u00010\rj\u0010\u0012\n\u0012\b\u0018\u00010\u000eR\u00020\u0000\u0018\u0001`\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0017\u0010\u0010\u001a\b\u0018\u00010\u0011R\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR)\u0010\u0012\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\rj\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001c¨\u00065"}, d2 = {"Lcom/theinnerhour/b2b/components/pro/dashboard/model/ProCoachModel;", "", "firebaseid", "", "id", "", "image", SessionManager.KEY_EMAIL, "firstname", "lastname", "gender", "about", "educations", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/components/pro/dashboard/model/ProCoachModel$ProCoachModelEducation;", "Lkotlin/collections/ArrayList;", "experience", "Lcom/theinnerhour/b2b/components/pro/dashboard/model/ProCoachModel$ProCoachModelExperience;", "languages", "domainAreas", "proIntro", "title", "philosophy", "profileStatement", "proExperience", "designation", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/theinnerhour/b2b/components/pro/dashboard/model/ProCoachModel$ProCoachModelExperience;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAbout", "()Ljava/lang/String;", "getDesignation", "getDomainAreas", "()Ljava/util/ArrayList;", "getEducations", "getEmail", "getExperience", "()Lcom/theinnerhour/b2b/components/pro/dashboard/model/ProCoachModel$ProCoachModelExperience;", "getFirebaseid", "getFirstname", "getGender", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImage", "getLanguages", "getLastname", "getPhilosophy", "getProExperience", "getProIntro", "getProfileStatement", "getTitle", "getEducation", "ProCoachModelEducation", "ProCoachModelExperience", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ProCoachModel {
    private final String about;
    private final String designation;
    private final ArrayList<String> domainAreas;
    private final ArrayList<ProCoachModelEducation> educations;
    private final String email;
    private final ProCoachModelExperience experience;
    private final String firebaseid;
    private final String firstname;
    private final String gender;

    /* renamed from: id  reason: collision with root package name */
    private final Integer f11542id;
    private final String image;
    private final ArrayList<String> languages;
    private final String lastname;
    private final String philosophy;
    @b("pro_exp")
    private final String proExperience;
    @b("pro_intro")
    private final String proIntro;
    @b("profile_statement")
    private final String profileStatement;
    private final String title;

    /* compiled from: ProCoachModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/theinnerhour/b2b/components/pro/dashboard/model/ProCoachModel$ProCoachModelEducation;", "", "degree", "", "major", "(Lcom/theinnerhour/b2b/components/pro/dashboard/model/ProCoachModel;Ljava/lang/String;Ljava/lang/String;)V", "getDegree", "()Ljava/lang/String;", "getMajor", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public final class ProCoachModelEducation {
        private final String degree;
        private final String major;

        public ProCoachModelEducation(String str, String str2) {
            this.degree = str;
            this.major = str2;
        }

        public final String getDegree() {
            return this.degree;
        }

        public final String getMajor() {
            return this.major;
        }
    }

    /* compiled from: ProCoachModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/theinnerhour/b2b/components/pro/dashboard/model/ProCoachModel$ProCoachModelExperience;", "", "year", "", "(Lcom/theinnerhour/b2b/components/pro/dashboard/model/ProCoachModel;Ljava/lang/Integer;)V", "getYear", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public final class ProCoachModelExperience {
        private final Integer year;

        public ProCoachModelExperience(Integer num) {
            this.year = num;
        }

        public final Integer getYear() {
            return this.year;
        }
    }

    public ProCoachModel(String firebaseid, Integer num, String str, String str2, String str3, String str4, String str5, String str6, ArrayList<ProCoachModelEducation> arrayList, ProCoachModelExperience proCoachModelExperience, ArrayList<String> arrayList2, ArrayList<String> domainAreas, String proIntro, String title, String philosophy, String str7, String str8, String str9) {
        i.g(firebaseid, "firebaseid");
        i.g(domainAreas, "domainAreas");
        i.g(proIntro, "proIntro");
        i.g(title, "title");
        i.g(philosophy, "philosophy");
        this.firebaseid = firebaseid;
        this.f11542id = num;
        this.image = str;
        this.email = str2;
        this.firstname = str3;
        this.lastname = str4;
        this.gender = str5;
        this.about = str6;
        this.educations = arrayList;
        this.experience = proCoachModelExperience;
        this.languages = arrayList2;
        this.domainAreas = domainAreas;
        this.proIntro = proIntro;
        this.title = title;
        this.philosophy = philosophy;
        this.profileStatement = str7;
        this.proExperience = str8;
        this.designation = str9;
    }

    public final String getAbout() {
        return this.about;
    }

    public final String getDesignation() {
        return this.designation;
    }

    public final ArrayList<String> getDomainAreas() {
        return this.domainAreas;
    }

    public final String getEducation() {
        boolean z10;
        Character valueOf;
        String str;
        ArrayList<ProCoachModelEducation> arrayList = this.educations;
        String str2 = null;
        String str3 = "";
        if (arrayList != null) {
            for (ProCoachModelEducation proCoachModelEducation : arrayList) {
                if (proCoachModelEducation != null) {
                    str = proCoachModelEducation.getDegree();
                } else {
                    str = null;
                }
                if (str != null) {
                    StringBuilder c10 = h.c(str3);
                    c10.append(proCoachModelEducation.getDegree());
                    String sb2 = c10.toString();
                    if (proCoachModelEducation.getMajor() != null) {
                        sb2 = sb2 + ' ' + proCoachModelEducation.getMajor();
                    }
                    str3 = a.f(sb2, ", ");
                }
            }
        }
        String obj = r.i1(str3).toString();
        i.g(obj, "<this>");
        if (obj.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            valueOf = null;
        } else {
            valueOf = Character.valueOf(obj.charAt(obj.length() - 1));
        }
        if (valueOf != null) {
            str2 = valueOf.toString();
        }
        if (i.b(str2, ",")) {
            String substring = obj.substring(0, obj.length() - 1);
            i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return obj;
    }

    public final ArrayList<ProCoachModelEducation> getEducations() {
        return this.educations;
    }

    public final String getEmail() {
        return this.email;
    }

    public final ProCoachModelExperience getExperience() {
        return this.experience;
    }

    public final String getFirebaseid() {
        return this.firebaseid;
    }

    public final String getFirstname() {
        return this.firstname;
    }

    public final String getGender() {
        return this.gender;
    }

    public final Integer getId() {
        return this.f11542id;
    }

    public final String getImage() {
        return this.image;
    }

    /* renamed from: getLanguages  reason: collision with other method in class */
    public final ArrayList<String> m10getLanguages() {
        return this.languages;
    }

    public final String getLastname() {
        return this.lastname;
    }

    public final String getPhilosophy() {
        return this.philosophy;
    }

    public final String getProExperience() {
        return this.proExperience;
    }

    public final String getProIntro() {
        return this.proIntro;
    }

    public final String getProfileStatement() {
        return this.profileStatement;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getLanguages() {
        String str;
        String ch2;
        ArrayList<String> arrayList = this.languages;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String str2 = (String) obj;
                if (true ^ (str2 == null || n.B0(str2))) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            String str3 = "";
            while (it.hasNext()) {
                String str4 = (String) it.next();
                String str5 = null;
                if (str4 == null || (ch2 = Character.valueOf(s.j1(str4)).toString()) == null) {
                    str = null;
                } else {
                    Locale ENGLISH = Locale.ENGLISH;
                    i.f(ENGLISH, "ENGLISH");
                    str = ch2.toUpperCase(ENGLISH);
                    i.f(str, "this as java.lang.String).toUpperCase(locale)");
                }
                if ((str4 != null ? str4.length() : -1) > 1) {
                    StringBuilder c10 = h.c(str);
                    if (str4 != null) {
                        str5 = str4.substring(1);
                        i.f(str5, "this as java.lang.String).substring(startIndex)");
                    }
                    c10.append(str5);
                    str = c10.toString();
                }
                StringBuilder c11 = h.c(str3);
                if (!i.b(str3, "")) {
                    str = c.r(", ", str);
                }
                c11.append(str);
                str3 = c11.toString();
            }
            return str3;
        }
        return "";
    }
}
