package com.theinnerhour.b2b.model;

import com.theinnerhour.b2b.utils.LogHelper;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/* loaded from: classes2.dex */
public class MessageModel implements Serializable {
    String from_id;

    /* renamed from: id  reason: collision with root package name */
    String f11767id;
    private String msg;
    int msgType;
    String name;
    String timestamp;
    String to_id;
    final String strDateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    final String strDateFormat2 = "yyyy-MM-dd'T'HH:mm:ss.SSS+05:30";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS+05:30");
    SimpleDateFormat displayDateFormat = new SimpleDateFormat("dd-MM-yyyy  HH:mm:ss");
    SimpleDateFormat displayDateFormat2 = new SimpleDateFormat("EEEE");
    SimpleDateFormat displayDateFormat3 = new SimpleDateFormat("HH:mm:ss");

    public MessageModel() {
    }

    public static boolean isBeforeDay(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            if (calendar.get(0) < calendar2.get(0)) {
                return true;
            }
            if (calendar.get(0) > calendar2.get(0)) {
                return false;
            }
            if (calendar.get(1) < calendar2.get(1)) {
                return true;
            }
            if (calendar.get(1) > calendar2.get(1) || calendar.get(6) >= calendar2.get(6)) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("The dates must not be null");
    }

    public static boolean isSameDay(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            if (calendar.get(0) != calendar2.get(0) || calendar.get(1) != calendar2.get(1) || calendar.get(6) != calendar2.get(6)) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("The dates must not be null");
    }

    public static boolean isToday(Calendar calendar) {
        return isSameDay(calendar, Calendar.getInstance());
    }

    public static boolean isWithinDays(Calendar calendar, int i6) {
        if (calendar != null) {
            Calendar calendar2 = Calendar.getInstance();
            Calendar calendar3 = Calendar.getInstance();
            calendar3.add(6, -i6);
            if (isBeforeDay(calendar, calendar2) && !isBeforeDay(calendar, calendar3)) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public String getFrom_id() {
        return this.from_id;
    }

    public String getId() {
        return this.f11767id;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public String getName() {
        return this.name;
    }

    public String getTimestamp() {
        String str = this.timestamp;
        if (str != null && !str.equals("null")) {
            return this.timestamp;
        }
        String format = this.displayDateFormat.format(Calendar.getInstance().getTime());
        this.timestamp = format;
        return format;
    }

    public String getTo_id() {
        return this.to_id;
    }

    public void setFrom_id(String str) {
        this.from_id = str;
    }

    public void setId(String str) {
        this.f11767id = str;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setMsgType(int i6) {
        this.msgType = i6;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
        if (str != null && !str.equals("null")) {
            try {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(this.simpleDateFormat.parse(str));
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(this.simpleDateFormat.getCalendar().getTime());
                if (isToday(calendar)) {
                    this.timestamp = "Today " + this.displayDateFormat3.format(calendar.getTime());
                } else if (isBeforeDay(calendar, calendar2)) {
                    this.timestamp = "Yesterday " + this.displayDateFormat3.format(calendar.getTime());
                } else if (isWithinDays(calendar, 7)) {
                    this.timestamp = "Last " + this.displayDateFormat2.format(calendar.getTime()) + " " + this.displayDateFormat3.format(calendar.getTime());
                } else {
                    this.timestamp = this.displayDateFormat.format(calendar.getTime());
                }
                return;
            } catch (ParseException e10) {
                LogHelper.INSTANCE.e(e10);
                try {
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.setTime(this.simpleDateFormat2.parse(str));
                    Calendar calendar4 = Calendar.getInstance();
                    calendar4.setTime(this.simpleDateFormat.getCalendar().getTime());
                    if (isToday(calendar3)) {
                        this.timestamp = "Today " + this.displayDateFormat3.format(calendar3.getTime());
                    } else if (isBeforeDay(calendar3, calendar4)) {
                        this.timestamp = "Yesterday " + this.displayDateFormat3.format(calendar3.getTime());
                    } else if (isWithinDays(calendar3, 7)) {
                        this.timestamp = "Last " + this.displayDateFormat2.format(calendar3.getTime());
                    } else {
                        this.timestamp = this.displayDateFormat.format(calendar3.getTime());
                    }
                    return;
                } catch (ParseException e11) {
                    LogHelper.INSTANCE.e(e11);
                    return;
                }
            }
        }
        this.timestamp = this.displayDateFormat.format(Calendar.getInstance().getTime());
    }

    public void setTo_id(String str) {
        this.to_id = str;
    }

    public MessageModel(String str, String str2, String str3, String str4, String str5, int i6) {
        this.msg = str;
        this.from_id = str2;
        this.to_id = str3;
        this.timestamp = str4;
        this.name = str5;
        this.msgType = i6;
    }
}
