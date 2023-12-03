package com.theinnerhour.b2b.model;

import java.io.Serializable;
import tf.b;
/* loaded from: classes2.dex */
public class ChatPackageModel implements Serializable {
    @b("chatvaliditylabel")
    String chatvaliditylabel;
    @b("created_at")
    String created_at;
    @b("discount")
    String discount;
    @b("flatprice")
    String flatprice;
    @b("freesessions")
    int freeSessions;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    int f11759id;
    @b("livesessions")
    int liveSessions;
    @b("organisation_id")
    String organisation_id;
    @b("packagetype")
    String packageType;
    @b("paidsessions")
    int paidSessions;
    @b("sessionduration")
    int sessionDuration;
    @b("therapist_id")
    int therapistId;
    @b("title")
    String title;

    public String getChatvaliditylabel() {
        return this.chatvaliditylabel;
    }

    public String getCreated_at() {
        return this.created_at;
    }

    public String getDiscount() {
        return this.discount;
    }

    public String getFlatprice() {
        return this.flatprice;
    }

    public int getFreeSessions() {
        return this.freeSessions;
    }

    public int getId() {
        return this.f11759id;
    }

    public int getLiveSessions() {
        return this.liveSessions;
    }

    public String getOrganisation_id() {
        return this.organisation_id;
    }

    public String getPackageType() {
        return this.packageType;
    }

    public int getPaidSessions() {
        return this.paidSessions;
    }

    public int getSessionDuration() {
        return this.sessionDuration;
    }

    public int getTherapistId() {
        return this.therapistId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setChatvaliditylabel(String str) {
        this.chatvaliditylabel = str;
    }

    public void setCreated_at(String str) {
        this.created_at = str;
    }

    public void setDiscount(String str) {
        this.discount = str;
    }

    public void setFlatprice(String str) {
        this.flatprice = str;
    }

    public void setFreeSessions(int i6) {
        this.freeSessions = i6;
    }

    public void setId(int i6) {
        this.f11759id = i6;
    }

    public void setLiveSessions(int i6) {
        this.liveSessions = i6;
    }

    public void setOrganisation_id(String str) {
        this.organisation_id = str;
    }

    public void setPackageType(String str) {
        this.packageType = str;
    }

    public void setPaidSessions(int i6) {
        this.paidSessions = i6;
    }

    public void setSessionDuration(int i6) {
        this.sessionDuration = i6;
    }

    public void setTherapistId(int i6) {
        this.therapistId = i6;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
