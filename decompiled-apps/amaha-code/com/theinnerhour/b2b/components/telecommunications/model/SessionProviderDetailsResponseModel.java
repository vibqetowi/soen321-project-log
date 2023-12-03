package com.theinnerhour.b2b.components.telecommunications.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.telecommunications.model.ProviderDetailModel;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import kotlin.Metadata;
import sf.o;
import tf.b;
/* compiled from: SessionProviderDetailsResponseModel.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\b\u0018\u00010\u0007R\u00020\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0018\u00010\u0007R\u00020\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR \u0010\u000e\u001a\b\u0018\u00010\u0007R\u00020\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/SessionProviderDetailsResponseModel;", "", "Lsf/o;", "customer", "Lsf/o;", "getCustomer", "()Lsf/o;", "Lcom/theinnerhour/b2b/components/telecommunications/model/SessionProviderDetailsResponseModel$ProviderModel;", "therapist", "Lcom/theinnerhour/b2b/components/telecommunications/model/SessionProviderDetailsResponseModel$ProviderModel;", "getTherapist", "()Lcom/theinnerhour/b2b/components/telecommunications/model/SessionProviderDetailsResponseModel$ProviderModel;", "couplesTherapist", "getCouplesTherapist", "psychiatrist", "getPsychiatrist", "<init>", "()V", "CustomerInfo", "ProviderModel", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SessionProviderDetailsResponseModel {
    @b("couplestherapist")
    private final ProviderModel couplesTherapist;
    @b("customer")
    private final o customer;
    @b("psychiatrist")
    private final ProviderModel psychiatrist;
    @b("therapist")
    private final ProviderModel therapist;

    /* compiled from: SessionProviderDetailsResponseModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/SessionProviderDetailsResponseModel$CustomerInfo;", "", "(Lcom/theinnerhour/b2b/components/telecommunications/model/SessionProviderDetailsResponseModel;)V", "about", "", "getAbout", "()Ljava/lang/String;", SessionManager.KEY_EMAIL, "getEmail", "firebaseId", "getFirebaseId", SessionManager.KEY_FIRSTNAME, "getFirstName", "image", "getImage", SessionManager.KEY_LASTNAME, "getLastName", SessionManager.KEY_UUID, "getUuid", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public final class CustomerInfo {
        @b("about")
        private final String about;
        @b(SessionManager.KEY_EMAIL)
        private final String email;
        @b("firebaseid")
        private final String firebaseId;
        @b("firstname")
        private final String firstName;
        @b("image")
        private final String image;
        @b("lastname")
        private final String lastName;
        @b(SessionManager.KEY_UUID)
        private final String uuid;

        public CustomerInfo() {
        }

        public final String getAbout() {
            return this.about;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getFirebaseId() {
            return this.firebaseId;
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final String getImage() {
            return this.image;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public final String getUuid() {
            return this.uuid;
        }
    }

    /* compiled from: SessionProviderDetailsResponseModel.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R2\u0010\u0011\u001a\u001e\u0012\b\u0012\u00060\u0012R\u00020\t\u0018\u00010\rj\u000e\u0012\b\u0012\u00060\u0012R\u00020\t\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0006R\u001c\u0010\u0016\u001a\b\u0018\u00010\u0017R\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0006R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0006R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0006R\u0018\u0010 \u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0006R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0006R\u001a\u0010$\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b$\u0010&R*\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0010R\u0018\u0010*\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0006R\u0018\u0010,\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0006¨\u0006."}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/SessionProviderDetailsResponseModel$ProviderModel;", "", "(Lcom/theinnerhour/b2b/components/telecommunications/model/SessionProviderDetailsResponseModel;)V", "about", "", "getAbout", "()Ljava/lang/String;", "commercials", "Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$CommercialInfo;", "Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel;", "getCommercials", "()Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$CommercialInfo;", "domainAreas", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getDomainAreas", "()Ljava/util/ArrayList;", "educations", "Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$EducationInfo;", "getEducations", SessionManager.KEY_EMAIL, "getEmail", "experience", "Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$Experience;", "getExperience", "()Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$Experience;", "firebaseId", "getFirebaseId", SessionManager.KEY_FIRSTNAME, "getFirstName", "gender", "getGender", "id", "getId", "image", "getImage", "isApproved", "", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "languages", "getLanguages", SessionManager.KEY_LASTNAME, "getLastName", SessionManager.KEY_UUID, "getUuid", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public final class ProviderModel {
        @b("about")
        private final String about;
        @b("commercials")
        private final ProviderDetailModel.CommercialInfo commercials;
        @b("domainareas")
        private final ArrayList<String> domainAreas;
        @b("educations")
        private final ArrayList<ProviderDetailModel.EducationInfo> educations;
        @b(SessionManager.KEY_EMAIL)
        private final String email;
        @b("experience")
        private final ProviderDetailModel.Experience experience;
        @b("firebaseid")
        private final String firebaseId;
        @b("firstname")
        private final String firstName;
        @b("gender")
        private final String gender;
        @b("id")

        /* renamed from: id  reason: collision with root package name */
        private final String f11661id;
        @b("image")
        private final String image;
        @b("isapproved")
        private final Boolean isApproved;
        @b("languages")
        private final ArrayList<String> languages;
        @b("lastname")
        private final String lastName;
        @b(SessionManager.KEY_UUID)
        private final String uuid;

        public ProviderModel() {
        }

        public final String getAbout() {
            return this.about;
        }

        public final ProviderDetailModel.CommercialInfo getCommercials() {
            return this.commercials;
        }

        public final ArrayList<String> getDomainAreas() {
            return this.domainAreas;
        }

        public final ArrayList<ProviderDetailModel.EducationInfo> getEducations() {
            return this.educations;
        }

        public final String getEmail() {
            return this.email;
        }

        public final ProviderDetailModel.Experience getExperience() {
            return this.experience;
        }

        public final String getFirebaseId() {
            return this.firebaseId;
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final String getGender() {
            return this.gender;
        }

        public final String getId() {
            return this.f11661id;
        }

        public final String getImage() {
            return this.image;
        }

        public final ArrayList<String> getLanguages() {
            return this.languages;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public final String getUuid() {
            return this.uuid;
        }

        public final Boolean isApproved() {
            return this.isApproved;
        }
    }

    public final ProviderModel getCouplesTherapist() {
        return this.couplesTherapist;
    }

    public final o getCustomer() {
        return this.customer;
    }

    public final ProviderModel getPsychiatrist() {
        return this.psychiatrist;
    }

    public final ProviderModel getTherapist() {
        return this.therapist;
    }
}
