package com.theinnerhour.b2b.model;

import java.util.ArrayList;
/* loaded from: classes2.dex */
public class OfflineAsset {
    private String courseId;
    private int downloadedBits;
    private String fileUrl;
    private boolean isDownloaded;
    private boolean isDownloading;
    private ArrayList<String> metaInfo;
    private int originalFileSize;
    private String tag;

    public OfflineAsset(String str, String str2, String str3) {
        this.isDownloading = false;
        this.downloadedBits = -1;
        this.originalFileSize = -1;
        this.courseId = str;
        this.tag = str2;
        this.fileUrl = str3;
        this.isDownloaded = false;
        this.metaInfo = new ArrayList<>();
    }

    public String getCourseId() {
        return this.courseId;
    }

    public int getDownloadedBits() {
        return this.downloadedBits;
    }

    public String getFileName() {
        String[] split = getFileUrl().split("/");
        return split[split.length - 1];
    }

    public String getFileUrl() {
        return this.fileUrl;
    }

    public boolean getIsDownloading() {
        return this.isDownloading;
    }

    public ArrayList<String> getMetaInfo() {
        return this.metaInfo;
    }

    public int getOriginalFileSize() {
        return this.originalFileSize;
    }

    public String getTag() {
        return this.tag;
    }

    public boolean isDownloaded() {
        return this.isDownloaded;
    }

    public void setCourseId(String str) {
        this.courseId = str;
    }

    public void setDownloaded(boolean z10) {
        this.isDownloaded = z10;
    }

    public void setDownloadedBits(int i6) {
        this.downloadedBits = i6;
    }

    public void setDownloading(boolean z10) {
        this.isDownloading = z10;
    }

    public void setFileUrl(String str) {
        this.fileUrl = str;
    }

    public void setMetaInfo(ArrayList<String> arrayList) {
        this.metaInfo = arrayList;
    }

    public void setOriginalFileSize(int i6) {
        this.originalFileSize = i6;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public OfflineAsset(String str, String str2, String str3, Boolean bool) {
        this.isDownloading = false;
        this.downloadedBits = -1;
        this.originalFileSize = -1;
        this.courseId = str;
        this.tag = str2;
        this.fileUrl = str3;
        this.isDownloaded = false;
        this.metaInfo = new ArrayList<>();
        this.isDownloading = true;
    }

    public OfflineAsset(String str, ArrayList<String> arrayList, String str2) {
        this.isDownloading = false;
        this.downloadedBits = -1;
        this.originalFileSize = -1;
        this.courseId = str;
        this.tag = "";
        this.fileUrl = str2;
        this.isDownloaded = false;
        this.metaInfo = arrayList;
    }

    public OfflineAsset(String str) {
        this.isDownloading = false;
        this.downloadedBits = -1;
        this.originalFileSize = -1;
        this.fileUrl = str;
        this.isDownloaded = false;
    }
}
