package com.mmacodes.antiphishing.model.ipqs;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class DomainAge implements Parcelable {
    private String human;
    private Long timestamp;
    private Date iso;

    protected DomainAge(Parcel in) {
        human = in.readString();
        if (in.readByte() == 0) {
            timestamp = null;
        } else {
            timestamp = in.readLong();
        }
    }

    public static final Creator<DomainAge> CREATOR = new Creator<DomainAge>() {
        @Override
        public DomainAge createFromParcel(Parcel in) {
            return new DomainAge(in);
        }

        @Override
        public DomainAge[] newArray(int size) {
            return new DomainAge[size];
        }
    };

    public String getHuman() {
        return human;
    }

    public void setHuman(String human) {
        this.human = human;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Date getIso() {
        return iso;
    }

    public void setIso(Date iso) {
        this.iso = iso;
    }

    @Override
    public String toString() {
        return "DomainAge{" +
                "human='" + human + '\'' +
                ", timestamp=" + timestamp +
                ", iso=" + iso +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(human);
        if (timestamp == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(timestamp);
        }
    }
}
