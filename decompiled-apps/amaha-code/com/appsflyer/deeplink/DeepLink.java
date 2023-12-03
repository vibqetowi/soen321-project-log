package com.appsflyer.deeplink;

import com.theinnerhour.b2b.utils.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class DeepLink {
    public final JSONObject AFKeystoreWrapper;

    private DeepLink(JSONObject jSONObject) {
        this.AFKeystoreWrapper = jSONObject;
    }

    public static DeepLink AFInAppEventType(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("custom_params");
        if (optJSONObject != null) {
            jSONObject.remove("custom_params");
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, optJSONObject.opt(next));
            }
        }
        return new DeepLink(jSONObject);
    }

    public static DeepLink AFKeystoreWrapper(Map<String, String> map) {
        Set<String> keySet = map.keySet();
        keySet.removeAll(Arrays.asList("install_time", "pid", "c", "af_prt", "af_mp", "clickid", "af_siteid", "af_sub_siteid", "af_click_lookback", "af_viewthrough_lookback", "af_keywords", "af_cost_model", "af_cost_currency", "af_cost_value", "af_r", "af_web_dp", "af_force_deeplink", "af_ref", "is_incentivized", "af_param_forwarding", "is_retargeting", "af_reengagement_window", "is_branded_link", "is_universal_link", "af_generated_clk", "transaction_id", "af_fp_lookback_window", "af_vt_fp_lookback_window", "af_fp_priority", "af_generate_clk", "af_inactivity_window", "af_ol_red", "af_attr", "af_ol_lp", "af_blank_red", "af_source", "af_lp_src", "af_src_browser", "af_tranid", "af_wrt_clk", "af_ua", "af_ip", "af_lang", "advertising_id", "sha1_advertising_id", "md5_advertising_id", "android_id", "sha1_android_id", "md5_android_id", "imei", "sha1_imei", "md5_imei", "oaid", "sha1_oaid", "md5_oaid", "af_android_url", "sha1_el", "fire_advertising_id", "sha1_fire_advertising_id", "idfa", "md5_idfa", "af_ios_url", "af_ios_fallback", "sha1_idfa", "mac", "sha1_mac", "af_banner", "af_slk_web_endpoint", "af_chrome_lp", "af_android_custom_url", "af_ios_custom_url", "af_enc_data", "engmnt_source", "redirect_response_data", "shortlink", "advertiserId", "sha1_advertiserId", "advertiser_id", "sha1_advertiser_id", "muid", "idfv", "md5_idfv", "sha1_idfv", "af_installpostback", "http_referrer", "af_model", "af_os", "md5_advertiserId", "af_video_total_length", "af_video_played_length", "af_playable_played_length", "af_ad_time_viewed", "af_ad_displayed_percent", "af_audio_total_length", "af_audio_played_length", "af_status", "af_web_id", "af_deeplink"));
        HashMap hashMap = new HashMap();
        for (String str : keySet) {
            hashMap.put(str, map.get(str));
        }
        return AFInAppEventType(new JSONObject(hashMap));
    }

    public String getAfSub1() {
        Object opt = this.AFKeystoreWrapper.opt("af_sub1");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    public String getAfSub2() {
        Object opt = this.AFKeystoreWrapper.opt("af_sub2");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    public String getAfSub3() {
        Object opt = this.AFKeystoreWrapper.opt("af_sub3");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    public String getAfSub4() {
        Object opt = this.AFKeystoreWrapper.opt("af_sub4");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    public String getAfSub5() {
        Object opt = this.AFKeystoreWrapper.opt("af_sub5");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    public String getCampaign() {
        Object opt = this.AFKeystoreWrapper.opt("campaign");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    public String getCampaignId() {
        Object opt = this.AFKeystoreWrapper.opt(Constants.CAMPAIGN_ID);
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    public JSONObject getClickEvent() {
        return this.AFKeystoreWrapper;
    }

    public String getClickHttpReferrer() {
        Object opt = this.AFKeystoreWrapper.opt("click_http_referrer");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    public String getDeepLinkValue() {
        Object opt = this.AFKeystoreWrapper.opt("deep_link_value");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    public String getMatchType() {
        Object opt = this.AFKeystoreWrapper.opt("match_type");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    public String getMediaSource() {
        Object opt = this.AFKeystoreWrapper.opt("media_source");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    public String getStringValue(String str) {
        Object opt = this.AFKeystoreWrapper.opt(str);
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        if (opt == null) {
            return null;
        }
        return String.valueOf(opt);
    }

    public Boolean isDeferred() {
        Object opt = this.AFKeystoreWrapper.opt("is_deferred");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (Boolean) opt;
    }

    public String toString() {
        return this.AFKeystoreWrapper.toString();
    }
}
