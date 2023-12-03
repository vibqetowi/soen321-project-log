package com.theinnerhour.b2b.model;

import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import java.io.Serializable;
import tf.b;
/* loaded from: classes2.dex */
public class UpcomingSessionModel implements Serializable {
    @b("booking_code")
    int booking_code;
    String bookingtype;
    @b("date")
    String date;
    @b("datetime_at_customer_timezone")
    Datetime_at_customer_timezone_model datetime_at_customer_timezone_model;
    @b("duration")
    int duration;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    int f11771id;
    String join_url;
    String openTokToken;
    @b("psychiatrist_id")
    int psychiatristId;
    @b("remainingtime")
    int remainingTime;
    @b("sessionkey")
    String sessionKey;
    @b("slot")
    String slot;
    @b("status")
    String status;
    TypeOfPackageModel subscribedpackage;
    @b("subscribedpackage_id")
    int subscribedpackageId;
    @b("summary")
    String summary;
    TherapistPackagesModel therapist;
    @b("therapist_id")
    int therapistId;
    @b("typeofsession")
    String typeOfSession;
    @b("user_id")
    int userId;

    public int getBooking_code() {
        return this.booking_code;
    }

    public String getBookingtype() {
        return this.bookingtype;
    }

    public String getDate() {
        return this.date;
    }

    public Datetime_at_customer_timezone_model getDatetime_at_customer_timezone_model() {
        return this.datetime_at_customer_timezone_model;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getId() {
        return this.f11771id;
    }

    public String getJoin_url() {
        return this.join_url;
    }

    public String getOpenTokToken() {
        return this.openTokToken;
    }

    public int getPsychiatristId() {
        return this.psychiatristId;
    }

    public int getRemainingTime() {
        return this.remainingTime;
    }

    public String getSessionKey() {
        return this.sessionKey;
    }

    public String getSlot() {
        return this.slot;
    }

    public String getStatus() {
        return this.status;
    }

    public TypeOfPackageModel getSubscribedpackage() {
        return this.subscribedpackage;
    }

    public int getSubscribedpackageId() {
        return this.subscribedpackageId;
    }

    public String getSummary() {
        return this.summary;
    }

    public TherapistPackagesModel getTherapist() {
        return this.therapist;
    }

    public int getTherapistId() {
        return this.therapistId;
    }

    public String getTypeOfSession() {
        return this.typeOfSession;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setBooking_code(int i6) {
        this.booking_code = i6;
    }

    public void setBookingtype(String str) {
        this.bookingtype = str;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setDatetime_at_customer_timezone_model(Datetime_at_customer_timezone_model datetime_at_customer_timezone_model) {
        this.datetime_at_customer_timezone_model = datetime_at_customer_timezone_model;
    }

    public void setDuration(int i6) {
        this.duration = i6;
    }

    public void setId(int i6) {
        this.f11771id = i6;
    }

    public void setJoin_url(String str) {
        this.join_url = str;
    }

    public void setOpenTokToken(String str) {
        this.openTokToken = str;
    }

    public void setPsychiatristId(int i6) {
        this.psychiatristId = i6;
    }

    public void setRemainingTime(int i6) {
        this.remainingTime = i6;
    }

    public void setSessionKey(String str) {
        this.sessionKey = str;
    }

    public void setSlot(String str) {
        this.slot = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setSubscribedpackage(TypeOfPackageModel typeOfPackageModel) {
        this.subscribedpackage = typeOfPackageModel;
    }

    public void setSubscribedpackageId(int i6) {
        this.subscribedpackageId = i6;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public void setTherapist(TherapistPackagesModel therapistPackagesModel) {
        this.therapist = therapistPackagesModel;
    }

    public void setTherapistId(int i6) {
        this.therapistId = i6;
    }

    public void setTypeOfSession(String str) {
        this.typeOfSession = str;
    }

    public void setUserId(int i6) {
        this.userId = i6;
    }
}
