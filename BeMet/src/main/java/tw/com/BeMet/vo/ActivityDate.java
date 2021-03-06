package tw.com.BeMet.vo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "activity_date", schema = "dbo", catalog = "BeMet")
public class ActivityDate {
    private Integer activityDateNo;
    private Integer activityNo;
    private Date startDate;
    private Date endDate;
    private Date createDate;
    private Date modifyDate;
    private Timeline timelineByActivityNo;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "activity_date_no")
    public Integer getActivityDateNo() {
        return activityDateNo;
    }

    public void setActivityDateNo(Integer activityDateNo) {
        this.activityDateNo = activityDateNo;
    }


    @Basic
    @Column(name = "activity_no")
    public Integer getActivityNo() {
        return activityNo;
    }

    public void setActivityNo(Integer activityNo) {
        this.activityNo = activityNo;
    }


    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modify_date")
    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start_date")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end_date")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActivityDate that = (ActivityDate) o;
        if (activityDateNo != null ? !activityDateNo.equals(that.activityDateNo) : that.activityDateNo != null) {
            return false;
        }
        if (activityNo != null ? !activityNo.equals(that.activityNo) : that.activityNo != null) {
            return false;
        }
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) {
            return false;
        }
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = activityDateNo != null ? activityDateNo.hashCode() : 0;
        result = 31 * result + (activityNo != null ? activityNo.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        return result;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "activity_no", referencedColumnName = "timeline_no", nullable = false, insertable = false, updatable = false)
    public Timeline getTimelineByActivityNo() {
        return timelineByActivityNo;
    }

    public void setTimelineByActivityNo(Timeline timelineByActivityNo) {
        this.timelineByActivityNo = timelineByActivityNo;
    }
}
