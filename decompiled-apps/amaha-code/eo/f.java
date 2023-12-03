package eo;

import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.onboarding.model.Commercials;
import com.theinnerhour.b2b.components.onboarding.model.Domainareas;
import com.theinnerhour.b2b.components.onboarding.model.Educations;
import com.theinnerhour.b2b.components.onboarding.model.Experience;
import com.theinnerhour.b2b.components.onboarding.model.Languages;
import com.theinnerhour.b2b.components.onboarding.model.MatchingFlowUserResponseModel;
import com.theinnerhour.b2b.components.onboarding.model.MatchingProviderList;
import com.theinnerhour.b2b.components.onboarding.model.MatchingResponse;
import com.theinnerhour.b2b.components.onboarding.model.OnlineOffering;
import com.theinnerhour.b2b.components.onboarding.model.ProviderListModel;
import com.theinnerhour.b2b.components.onboarding.model.StripDetails;
import com.theinnerhour.b2b.components.telecommunications.model.CommercialsPackageModel;
import com.theinnerhour.b2b.components.telecommunications.model.OnlineOfferingModel;
import com.theinnerhour.b2b.components.telecommunications.model.StripDetailsModel;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.DomainAreaPackagesModel;
import com.theinnerhour.b2b.model.EducationPackagesModel;
import com.theinnerhour.b2b.model.ExperiencePackagesModel;
import com.theinnerhour.b2b.model.LanguagePackagesModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import hs.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
/* compiled from: OnboardingFlowViewModel.kt */
/* loaded from: classes2.dex */
public final class f extends l0 {
    public j<String, String, Integer> A;
    public j<String, String, Integer> B;
    public j<String, String, Integer> C;
    public boolean D;

    /* renamed from: y  reason: collision with root package name */
    public List<j<String, String, Integer>> f14444y;

    /* renamed from: z  reason: collision with root package name */
    public List<j<String, String, Integer>> f14445z;

    /* renamed from: x  reason: collision with root package name */
    public final String f14443x = LogHelper.INSTANCE.makeLogTag("OnboardingFlowViewModel");
    public final p001do.a E = new p001do.a();
    public final w<SingleUseEvent<ArrayList<TherapistPackagesModel>>> F = new w<>();
    public final w<SingleUseEvent<Boolean>> G = new w<>();
    public final w<SingleUseEvent<ArrayList<ProviderListModel>>> H = new w<>();
    public final w<SingleUseEvent<ArrayList<ProviderListModel>>> I = new w<>();
    public final w<SingleUseEvent<MatchingFlowUserResponseModel>> J = new w<>();
    public final ArrayList<j<String, String, Integer>> K = ca.a.k(new j("Anxiety", "anxiety", Integer.valueOf((int) R.drawable.ic_on_boarding_anxiety)), new j("Depression", Constants.COURSE_DEPRESSION, Integer.valueOf((int) R.drawable.ic_on_boarding_depression)), new j("Stress", Constants.COURSE_STRESS, Integer.valueOf((int) R.drawable.ic_on_boarding_stress)), new j("Anger", Constants.COURSE_ANGER, Integer.valueOf((int) R.drawable.ic_on_boarding_anger)), new j("Grief", "grief", Integer.valueOf((int) R.drawable.ic_on_boarding_grief)), new j("Overthinking", "overthinking", Integer.valueOf((int) R.drawable.ic_on_boarding_overthinking)), new j("Self-esteem Issues", "self-esteem-issues", Integer.valueOf((int) R.drawable.ic_on_boarding_self_esteem_issues)), new j("OCD", Constants.COURSE_OCD, Integer.valueOf((int) R.drawable.ic_on_boarding_ocd)), new j("Sexual Dysfunction", "sexual-dysfunction", Integer.valueOf((int) R.drawable.ic_on_boarding_sexual_dysfunction)), new j("Loneliness", "loneliness", Integer.valueOf((int) R.drawable.ic_on_boarding_loneliness)), new j("Loss of Motivation", "loss-of-motivation", Integer.valueOf((int) R.drawable.ic_on_boarding_loss_of_motivation)), new j("Bipolar Affective Disorder", "bipolar-affective-disorder", Integer.valueOf((int) R.drawable.ic_on_boarding_bipolar_affective_disorder)), new j("Addiction", "addiction", Integer.valueOf((int) R.drawable.ic_on_boarding_addiction)), new j("General Well Being", "general-well-being", Integer.valueOf((int) R.drawable.ic_on_boarding_general_well_being)), new j("Negative Thinking", "negative-thinking", Integer.valueOf((int) R.drawable.ic_on_boarding_negative_thinking)), new j("Sleep Disturbances", "sleep-disturbances", Integer.valueOf((int) R.drawable.ic_on_boarding_sleep_disturbances)));
    public final ArrayList<j<String, String, Integer>> L = ca.a.k(new j("English", "english", null), new j("Hindi", "hindi", null), new j("Marathi", "marathi", null), new j("Urdu", "urdu", null), new j("Kannada", "kannada", null), new j("Malayalam", "malayalam", null), new j("Telugu", "telugu", null), new j("Punjabi", "punjabi", null), new j("Gujarati", "gujarati", null), new j("Tamil", "tamil", null));
    public final ArrayList<j<String, String, Integer>> M = ca.a.k(new j("2 weeks and less", "2_weeks_and_less", null), new j("Last 1 month", "last_1_month", null), new j("1-3 months", "1_3_months", null), new j("3-6 months", "3_6_months", null), new j("6 months - 1 year", "6_months_1_year", null), new j("More than a year", "more_than_a_year", null));
    public final ArrayList<j<String, String, Integer>> N = ca.a.k(new j("Not difficult at all", "not_difficult", Integer.valueOf((int) R.drawable.ic_on_boarding_difficulty_1)), new j("Somewhat difficult", "somewhat_difficult", Integer.valueOf((int) R.drawable.ic_on_boarding_difficulty_2)), new j("Very difficult", "very_difficult", Integer.valueOf((int) R.drawable.ic_on_boarding_difficulty_3)), new j("Extremely difficult", "extremely_difficult", Integer.valueOf((int) R.drawable.ic_on_boarding_difficulty_4)), new j("I cannot manage my responsibilities anymore", "i_cannot_manage_my_responsibilities_anymore", Integer.valueOf((int) R.drawable.ic_on_boarding_difficulty_5)));
    public final ArrayList<j<String, String, Integer>> O = ca.a.k(new j("18-25 years", "18 - 25 years", null), new j("26-33 years", "26 - 33 years", null), new j("34-41 years", "34 - 41 years", null), new j("42-49 years", "42 - 49 years", null), new j("50 years & above", "50 years & above", null));

    public static final void e(f fVar, MatchingResponse matchingResponse, boolean z10) {
        int i6;
        int i10;
        int i11;
        String str;
        String str2;
        Integer minimumFee;
        ArrayList<String> medium;
        Integer coupleHourlyFee;
        Integer hourlyFee;
        Integer year;
        fVar.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            if (matchingResponse.getList().size() > 0) {
                Iterator<MatchingProviderList> it = matchingResponse.getList().iterator();
                while (it.hasNext()) {
                    MatchingProviderList next = it.next();
                    TherapistPackagesModel therapistPackagesModel = new TherapistPackagesModel();
                    therapistPackagesModel.setFirstname(next.getFirstname());
                    therapistPackagesModel.setLastname(next.getLastname());
                    therapistPackagesModel.setUuid(next.getUuid());
                    therapistPackagesModel.setImage(next.getImage());
                    therapistPackagesModel.setEarliest_available_date(next.getEarliestAvailableDate());
                    therapistPackagesModel.setEarliest_available_datetime(next.getEarliestAvailableDatetime());
                    therapistPackagesModel.setVideo(next.getVideo());
                    therapistPackagesModel.setVideo_thumb(next.getVideoThumb());
                    therapistPackagesModel.setId(next.getId());
                    ArrayList<LanguagePackagesModel> arrayList2 = new ArrayList<>();
                    Iterator<Languages> it2 = next.getLanguages().iterator();
                    while (it2.hasNext()) {
                        Languages next2 = it2.next();
                        arrayList2.add(new LanguagePackagesModel(next2.getId(), next2.getName()));
                    }
                    therapistPackagesModel.setLanguages(arrayList2);
                    ArrayList<EducationPackagesModel> arrayList3 = new ArrayList<>();
                    if (next.getEducations() != null) {
                        Iterator<Educations> it3 = next.getEducations().iterator();
                        while (it3.hasNext()) {
                            Educations next3 = it3.next();
                            EducationPackagesModel educationPackagesModel = new EducationPackagesModel();
                            educationPackagesModel.setDegree(next3.getDegree());
                            educationPackagesModel.setMajor(next3.getMajor());
                            arrayList3.add(educationPackagesModel);
                        }
                    }
                    therapistPackagesModel.setEducations(arrayList3);
                    ArrayList<DomainAreaPackagesModel> arrayList4 = new ArrayList<>();
                    if (next.getDomainareas() != null) {
                        Iterator<Domainareas> it4 = next.getDomainareas().iterator();
                        while (it4.hasNext()) {
                            Domainareas next4 = it4.next();
                            arrayList4.add(new DomainAreaPackagesModel(next4.getId(), next4.getName()));
                        }
                    }
                    therapistPackagesModel.setDomainareas(arrayList4);
                    ExperiencePackagesModel experiencePackagesModel = new ExperiencePackagesModel();
                    Experience experience = next.getExperience();
                    int i12 = 0;
                    if (experience != null && (year = experience.getYear()) != null) {
                        i6 = year.intValue();
                    } else {
                        i6 = 0;
                    }
                    experiencePackagesModel.setYear(i6);
                    therapistPackagesModel.setExperience(experiencePackagesModel);
                    therapistPackagesModel.setIs_inhouse(next.isInhouse());
                    therapistPackagesModel.setIs_recommended(next.isRecommended());
                    CommercialsPackageModel commercialsPackageModel = new CommercialsPackageModel();
                    Commercials commercials = next.getCommercials();
                    if (commercials != null && (hourlyFee = commercials.getHourlyFee()) != null) {
                        i10 = hourlyFee.intValue();
                    } else {
                        i10 = 0;
                    }
                    commercialsPackageModel.setHourly_fee(i10);
                    Commercials commercials2 = next.getCommercials();
                    if (commercials2 != null && (coupleHourlyFee = commercials2.getCoupleHourlyFee()) != null) {
                        i11 = coupleHourlyFee.intValue();
                    } else {
                        i11 = 0;
                    }
                    commercialsPackageModel.setCouple_hourly_fee(i11);
                    Commercials commercials3 = next.getCommercials();
                    if (commercials3 != null && (medium = commercials3.getMedium()) != null) {
                        commercialsPackageModel.getMedium().addAll(medium);
                    }
                    therapistPackagesModel.setCommercials(commercialsPackageModel);
                    OnlineOfferingModel onlineOfferingModel = new OnlineOfferingModel();
                    OnlineOffering onlineOffering = next.getOnlineOffering();
                    if (onlineOffering != null && (minimumFee = onlineOffering.getMinimumFee()) != null) {
                        i12 = minimumFee.intValue();
                    }
                    onlineOfferingModel.setMinimum_fee(i12);
                    OnlineOffering onlineOffering2 = next.getOnlineOffering();
                    String str3 = null;
                    if (onlineOffering2 != null) {
                        str = onlineOffering2.getDisplayText();
                    } else {
                        str = null;
                    }
                    onlineOfferingModel.setDisplay_text(str);
                    therapistPackagesModel.setOnlineOffering(onlineOfferingModel);
                    StripDetailsModel stripDetailsModel = new StripDetailsModel();
                    StripDetails stripDetails = next.getStripDetails();
                    if (stripDetails != null) {
                        str2 = stripDetails.getTagStrip();
                    } else {
                        str2 = null;
                    }
                    stripDetailsModel.setTagStrip(str2);
                    StripDetails stripDetails2 = next.getStripDetails();
                    if (stripDetails2 != null) {
                        str3 = stripDetails2.getDiscountStrip();
                    }
                    stripDetailsModel.setDiscountStrip(str3);
                    therapistPackagesModel.setStripDetails(stripDetailsModel);
                    arrayList.add(therapistPackagesModel);
                }
                fVar.g(matchingResponse, z10);
                if (!z10) {
                    fVar.F.i(new SingleUseEvent<>(arrayList));
                    return;
                }
                return;
            }
            fVar.G.i(new SingleUseEvent<>(Boolean.TRUE));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(fVar.f14443x, "exception in parsing therapist response", e10);
        }
    }

    public final void f() {
        String j02;
        p001do.a aVar = this.E;
        aVar.getClass();
        try {
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference(Constants.FIREBASE_USER_COURSES_NODE.concat(j02));
                i.f(reference, "getInstance().getReferen…_USER_COURSES_NODE}$uid\")");
                reference.keepSynced(true);
                reference.addListenerForSingleValueEvent(new p001do.c(reference));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(aVar.f13174a, e10);
        }
    }

    public final void g(MatchingResponse matchingResponse, boolean z10) {
        int i6;
        Integer year;
        try {
            ArrayList<ProviderListModel> arrayList = new ArrayList<>();
            if (matchingResponse.getList().size() > 0) {
                Iterator<MatchingProviderList> it = matchingResponse.getList().iterator();
                while (it.hasNext()) {
                    MatchingProviderList next = it.next();
                    ArrayList arrayList2 = new ArrayList();
                    if (next.getLanguages() != null) {
                        Iterator<Languages> it2 = next.getLanguages().iterator();
                        while (it2.hasNext()) {
                            Languages next2 = it2.next();
                            arrayList2.add(new LanguagePackagesModel(next2.getId(), next2.getName()));
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    if (next.getEducations() != null) {
                        Iterator<Educations> it3 = next.getEducations().iterator();
                        while (it3.hasNext()) {
                            Educations next3 = it3.next();
                            EducationPackagesModel educationPackagesModel = new EducationPackagesModel();
                            educationPackagesModel.setDegree(next3.getDegree());
                            educationPackagesModel.setMajor(next3.getMajor());
                            arrayList3.add(educationPackagesModel);
                        }
                    }
                    String firstname = next.getFirstname();
                    String lastname = next.getLastname();
                    String uuid = next.getUuid();
                    String image = next.getImage();
                    ExperiencePackagesModel experiencePackagesModel = new ExperiencePackagesModel();
                    Experience experience = next.getExperience();
                    if (experience != null && (year = experience.getYear()) != null) {
                        i6 = year.intValue();
                    } else {
                        i6 = 0;
                    }
                    experiencePackagesModel.setYear(i6);
                    arrayList.add(new ProviderListModel(firstname, lastname, image, arrayList3, experiencePackagesModel, arrayList2, uuid, "therapist"));
                }
                ApplicationPersistence.getInstance().setMatchingTherapistsSP(arrayList);
                if (z10) {
                    this.H.i(new SingleUseEvent<>(arrayList));
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f14443x, "exception in parsing therapist response", e10);
        }
    }
}
