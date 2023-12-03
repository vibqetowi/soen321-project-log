package com.theinnerhour.b2b.model;

import java.io.Serializable;
/* loaded from: classes2.dex */
public class TypeOfPackageModel implements Serializable {
    int chatvalidity;
    String chatvaliditylabel;
    String created_at;
    int flatprice;
    int flatusdprice;
    int freesessions;

    /* renamed from: id  reason: collision with root package name */
    int f11770id;
    int livesessions;
    int offeredpackage_id;
    boolean orgoffered = false;
    String packagetype;
    int paidsessions;
    int psychiatrist_id;
    int sessionduration;
    String sessionvaliditylabel;
    int therapist_id;
    String title;
    int transaction_id;

    public int getChatvalidity() {
        return this.chatvalidity;
    }

    public String getChatvaliditylabel() {
        return this.chatvaliditylabel;
    }

    public String getCreated_at() {
        return this.created_at;
    }

    public int getFlatprice() {
        return this.flatprice;
    }

    public int getFlatusdprice() {
        return this.flatusdprice;
    }

    public int getFreesessions() {
        return this.freesessions;
    }

    public int getId() {
        return this.f11770id;
    }

    public int getLivesessions() {
        return this.livesessions;
    }

    public int getOfferedpackage_id() {
        return this.offeredpackage_id;
    }

    public String getPackagetype() {
        return this.packagetype;
    }

    public int getPaidsessions() {
        return this.paidsessions;
    }

    public int getPsychiatrist_id() {
        return this.psychiatrist_id;
    }

    public int getSessionduration() {
        return this.sessionduration;
    }

    public String getSessionvaliditylabel() {
        return this.sessionvaliditylabel;
    }

    public int getTherapist_id() {
        return this.therapist_id;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTransaction_id() {
        return this.transaction_id;
    }

    public boolean isOrgoffered() {
        return this.orgoffered;
    }

    public void setChatvalidity(int i6) {
        this.chatvalidity = i6;
    }

    public void setChatvaliditylabel(String str) {
        this.chatvaliditylabel = str;
    }

    public void setCreated_at(String str) {
        this.created_at = str;
    }

    public void setFlatprice(int i6) {
        this.flatprice = i6;
    }

    public void setFlatusdprice(int i6) {
        this.flatusdprice = i6;
    }

    public void setFreesessions(int i6) {
        this.freesessions = i6;
    }

    public void setId(int i6) {
        this.f11770id = i6;
    }

    public void setLivesessions(int i6) {
        this.livesessions = i6;
    }

    public void setOfferedpackage_id(int i6) {
        this.offeredpackage_id = i6;
    }

    public void setOrgoffered(boolean z10) {
        this.orgoffered = z10;
    }

    public void setPackagetype(String str) {
        this.packagetype = str;
    }

    public void setPaidsessions(int i6) {
        this.paidsessions = i6;
    }

    public void setPsychiatrist_id(int i6) {
        this.psychiatrist_id = i6;
    }

    public void setSessionduration(int i6) {
        this.sessionduration = i6;
    }

    public void setSessionvaliditylabel(String str) {
        this.sessionvaliditylabel = str;
    }

    public void setTherapist_id(int i6) {
        this.therapist_id = i6;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTransaction_id(int i6) {
        this.transaction_id = i6;
    }
}
