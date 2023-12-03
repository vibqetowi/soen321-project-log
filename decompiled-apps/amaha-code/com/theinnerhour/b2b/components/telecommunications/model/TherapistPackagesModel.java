package com.theinnerhour.b2b.components.telecommunications.model;

import com.theinnerhour.b2b.model.DomainAreaPackagesModel;
import com.theinnerhour.b2b.model.EducationPackagesModel;
import com.theinnerhour.b2b.model.ExperiencePackagesModel;
import com.theinnerhour.b2b.model.LanguagePackagesModel;
import java.io.Serializable;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class TherapistPackagesModel implements Serializable {
    private String about;
    private String earliest_available_date;
    private String earliest_available_datetime;
    private String firebaseid;
    private String firstname;
    private String gender;

    /* renamed from: id  reason: collision with root package name */
    private int f11662id;
    private String image;
    private String lastname;
    private int no_of_conversations;
    private int no_of_votes;
    private int rating;
    private String registration_number;
    private String uuid;
    private String video;
    private String video_thumb;
    ArrayList<LanguagePackagesModel> languages = new ArrayList<>();
    ArrayList<EducationPackagesModel> educations = new ArrayList<>();
    ArrayList<DomainAreaPackagesModel> domainareas = new ArrayList<>();
    ExperiencePackagesModel experience = new ExperiencePackagesModel();
    boolean is_inhouse = false;
    boolean is_recommended = false;
    CommercialsPackageModel commercials = new CommercialsPackageModel();
    OnlineOfferingModel online_offering = new OnlineOfferingModel();
    StripDetailsModel strip_details = new StripDetailsModel();

    public String getAbout() {
        return this.about;
    }

    public CommercialsPackageModel getCommercials() {
        return this.commercials;
    }

    public ArrayList<DomainAreaPackagesModel> getDomainareas() {
        return this.domainareas;
    }

    public String getEarliest_available_date() {
        return this.earliest_available_date;
    }

    public String getEarliest_available_datetime() {
        return this.earliest_available_datetime;
    }

    public ArrayList<EducationPackagesModel> getEducations() {
        return this.educations;
    }

    public ExperiencePackagesModel getExperience() {
        return this.experience;
    }

    public String getFirebaseid() {
        return this.firebaseid;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getGender() {
        return this.gender;
    }

    public int getId() {
        return this.f11662id;
    }

    public String getImage() {
        return this.image;
    }

    public ArrayList<LanguagePackagesModel> getLanguages() {
        return this.languages;
    }

    public String getLastname() {
        return this.lastname;
    }

    public int getNo_of_conversations() {
        return this.no_of_conversations;
    }

    public int getNo_of_votes() {
        return this.no_of_votes;
    }

    public OnlineOfferingModel getOnlineOffering() {
        return this.online_offering;
    }

    public int getRating() {
        return this.rating;
    }

    public String getRegistration_number() {
        return this.registration_number;
    }

    public StripDetailsModel getStripDetails() {
        return this.strip_details;
    }

    public String getUuid() {
        return this.uuid;
    }

    public String getVideo() {
        return this.video;
    }

    public String getVideo_thumb() {
        return this.video_thumb;
    }

    public boolean isIs_inhouse() {
        return this.is_inhouse;
    }

    public boolean isIs_recommended() {
        return this.is_recommended;
    }

    public void setAbout(String str) {
        this.about = str;
    }

    public void setCommercials(CommercialsPackageModel commercialsPackageModel) {
        this.commercials = commercialsPackageModel;
    }

    public void setDomainareas(ArrayList<DomainAreaPackagesModel> arrayList) {
        this.domainareas = arrayList;
    }

    public void setEarliest_available_date(String str) {
        this.earliest_available_date = str;
    }

    public void setEarliest_available_datetime(String str) {
        this.earliest_available_datetime = str;
    }

    public void setEducations(ArrayList<EducationPackagesModel> arrayList) {
        this.educations = arrayList;
    }

    public void setExperience(ExperiencePackagesModel experiencePackagesModel) {
        this.experience = experiencePackagesModel;
    }

    public void setFirebaseid(String str) {
        this.firebaseid = str;
    }

    public void setFirstname(String str) {
        this.firstname = str;
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public void setId(int i6) {
        this.f11662id = i6;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setIs_inhouse(boolean z10) {
        this.is_inhouse = z10;
    }

    public void setIs_recommended(boolean z10) {
        this.is_recommended = z10;
    }

    public void setLanguages(ArrayList<LanguagePackagesModel> arrayList) {
        this.languages = arrayList;
    }

    public void setLastname(String str) {
        this.lastname = str;
    }

    public void setNo_of_conversations(int i6) {
        this.no_of_conversations = i6;
    }

    public void setNo_of_votes(int i6) {
        this.no_of_votes = i6;
    }

    public void setOnlineOffering(OnlineOfferingModel onlineOfferingModel) {
        this.online_offering = onlineOfferingModel;
    }

    public void setRating(int i6) {
        this.rating = i6;
    }

    public void setRegistration_number(String str) {
        this.registration_number = str;
    }

    public void setStripDetails(StripDetailsModel stripDetailsModel) {
        this.strip_details = stripDetailsModel;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setVideo(String str) {
        this.video = str;
    }

    public void setVideo_thumb(String str) {
        this.video_thumb = str;
    }
}
