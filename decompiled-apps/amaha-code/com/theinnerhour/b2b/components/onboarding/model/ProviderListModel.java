package com.theinnerhour.b2b.components.onboarding.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.model.EducationPackagesModel;
import com.theinnerhour.b2b.model.ExperiencePackagesModel;
import com.theinnerhour.b2b.model.LanguagePackagesModel;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import pl.a;
import v.g;
/* compiled from: ProviderModel.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\t\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u001d\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\tHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u0089\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R.\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR.\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001c¨\u00066"}, d2 = {"Lcom/theinnerhour/b2b/components/onboarding/model/ProviderListModel;", "", "firstname", "", "lastname", "image", "educations", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/EducationPackagesModel;", "Lkotlin/collections/ArrayList;", "experience", "Lcom/theinnerhour/b2b/model/ExperiencePackagesModel;", "languages", "Lcom/theinnerhour/b2b/model/LanguagePackagesModel;", SessionManager.KEY_UUID, "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/theinnerhour/b2b/model/ExperiencePackagesModel;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getEducations", "()Ljava/util/ArrayList;", "setEducations", "(Ljava/util/ArrayList;)V", "getExperience", "()Lcom/theinnerhour/b2b/model/ExperiencePackagesModel;", "setExperience", "(Lcom/theinnerhour/b2b/model/ExperiencePackagesModel;)V", "getFirstname", "()Ljava/lang/String;", "setFirstname", "(Ljava/lang/String;)V", "getImage", "setImage", "getLanguages", "setLanguages", "getLastname", "setLastname", "getType", "setType", "getUuid", "setUuid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ProviderListModel {
    private ArrayList<EducationPackagesModel> educations;
    private ExperiencePackagesModel experience;
    private String firstname;
    private String image;
    private ArrayList<LanguagePackagesModel> languages;
    private String lastname;
    private String type;
    private String uuid;

    public ProviderListModel(String str, String str2, String str3, ArrayList<EducationPackagesModel> arrayList, ExperiencePackagesModel experiencePackagesModel, ArrayList<LanguagePackagesModel> arrayList2, String uuid, String type) {
        i.g(uuid, "uuid");
        i.g(type, "type");
        this.firstname = str;
        this.lastname = str2;
        this.image = str3;
        this.educations = arrayList;
        this.experience = experiencePackagesModel;
        this.languages = arrayList2;
        this.uuid = uuid;
        this.type = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProviderListModel copy$default(ProviderListModel providerListModel, String str, String str2, String str3, ArrayList arrayList, ExperiencePackagesModel experiencePackagesModel, ArrayList arrayList2, String str4, String str5, int i6, Object obj) {
        String str6;
        String str7;
        String str8;
        ArrayList<EducationPackagesModel> arrayList3;
        ExperiencePackagesModel experiencePackagesModel2;
        ArrayList<LanguagePackagesModel> arrayList4;
        String str9;
        String str10;
        if ((i6 & 1) != 0) {
            str6 = providerListModel.firstname;
        } else {
            str6 = str;
        }
        if ((i6 & 2) != 0) {
            str7 = providerListModel.lastname;
        } else {
            str7 = str2;
        }
        if ((i6 & 4) != 0) {
            str8 = providerListModel.image;
        } else {
            str8 = str3;
        }
        if ((i6 & 8) != 0) {
            arrayList3 = providerListModel.educations;
        } else {
            arrayList3 = arrayList;
        }
        if ((i6 & 16) != 0) {
            experiencePackagesModel2 = providerListModel.experience;
        } else {
            experiencePackagesModel2 = experiencePackagesModel;
        }
        if ((i6 & 32) != 0) {
            arrayList4 = providerListModel.languages;
        } else {
            arrayList4 = arrayList2;
        }
        if ((i6 & 64) != 0) {
            str9 = providerListModel.uuid;
        } else {
            str9 = str4;
        }
        if ((i6 & 128) != 0) {
            str10 = providerListModel.type;
        } else {
            str10 = str5;
        }
        return providerListModel.copy(str6, str7, str8, arrayList3, experiencePackagesModel2, arrayList4, str9, str10);
    }

    public final String component1() {
        return this.firstname;
    }

    public final String component2() {
        return this.lastname;
    }

    public final String component3() {
        return this.image;
    }

    public final ArrayList<EducationPackagesModel> component4() {
        return this.educations;
    }

    public final ExperiencePackagesModel component5() {
        return this.experience;
    }

    public final ArrayList<LanguagePackagesModel> component6() {
        return this.languages;
    }

    public final String component7() {
        return this.uuid;
    }

    public final String component8() {
        return this.type;
    }

    public final ProviderListModel copy(String str, String str2, String str3, ArrayList<EducationPackagesModel> arrayList, ExperiencePackagesModel experiencePackagesModel, ArrayList<LanguagePackagesModel> arrayList2, String uuid, String type) {
        i.g(uuid, "uuid");
        i.g(type, "type");
        return new ProviderListModel(str, str2, str3, arrayList, experiencePackagesModel, arrayList2, uuid, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderListModel)) {
            return false;
        }
        ProviderListModel providerListModel = (ProviderListModel) obj;
        if (i.b(this.firstname, providerListModel.firstname) && i.b(this.lastname, providerListModel.lastname) && i.b(this.image, providerListModel.image) && i.b(this.educations, providerListModel.educations) && i.b(this.experience, providerListModel.experience) && i.b(this.languages, providerListModel.languages) && i.b(this.uuid, providerListModel.uuid) && i.b(this.type, providerListModel.type)) {
            return true;
        }
        return false;
    }

    public final ArrayList<EducationPackagesModel> getEducations() {
        return this.educations;
    }

    public final ExperiencePackagesModel getExperience() {
        return this.experience;
    }

    public final String getFirstname() {
        return this.firstname;
    }

    public final String getImage() {
        return this.image;
    }

    public final ArrayList<LanguagePackagesModel> getLanguages() {
        return this.languages;
    }

    public final String getLastname() {
        return this.lastname;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.firstname;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.lastname;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.image;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        ArrayList<EducationPackagesModel> arrayList = this.educations;
        if (arrayList == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = arrayList.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        ExperiencePackagesModel experiencePackagesModel = this.experience;
        if (experiencePackagesModel == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = experiencePackagesModel.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        ArrayList<LanguagePackagesModel> arrayList2 = this.languages;
        if (arrayList2 != null) {
            i6 = arrayList2.hashCode();
        }
        return this.type.hashCode() + a.c(this.uuid, (i14 + i6) * 31, 31);
    }

    public final void setEducations(ArrayList<EducationPackagesModel> arrayList) {
        this.educations = arrayList;
    }

    public final void setExperience(ExperiencePackagesModel experiencePackagesModel) {
        this.experience = experiencePackagesModel;
    }

    public final void setFirstname(String str) {
        this.firstname = str;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final void setLanguages(ArrayList<LanguagePackagesModel> arrayList) {
        this.languages = arrayList;
    }

    public final void setLastname(String str) {
        this.lastname = str;
    }

    public final void setType(String str) {
        i.g(str, "<set-?>");
        this.type = str;
    }

    public final void setUuid(String str) {
        i.g(str, "<set-?>");
        this.uuid = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProviderListModel(firstname=");
        sb2.append(this.firstname);
        sb2.append(", lastname=");
        sb2.append(this.lastname);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", educations=");
        sb2.append(this.educations);
        sb2.append(", experience=");
        sb2.append(this.experience);
        sb2.append(", languages=");
        sb2.append(this.languages);
        sb2.append(", uuid=");
        sb2.append(this.uuid);
        sb2.append(", type=");
        return g.c(sb2, this.type, ')');
    }
}
