package org.anti.seckill.domain;

import java.util.Date;

public class PromoDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promo_info.id
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promo_info.promo_name
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    private String promoName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promo_info.start_time
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promo_info.item_id
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    private Integer itemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promo_info.promo_item_price
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    private Double promoItemPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promo_info.end_time
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    private Date endTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promo_info.id
     *
     * @return the value of promo_info.id
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promo_info.id
     *
     * @param id the value for promo_info.id
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promo_info.promo_name
     *
     * @return the value of promo_info.promo_name
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    public String getPromoName() {
        return promoName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promo_info.promo_name
     *
     * @param promoName the value for promo_info.promo_name
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    public void setPromoName(String promoName) {
        this.promoName = promoName == null ? null : promoName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promo_info.start_time
     *
     * @return the value of promo_info.start_time
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promo_info.start_time
     *
     * @param startTime the value for promo_info.start_time
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promo_info.item_id
     *
     * @return the value of promo_info.item_id
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promo_info.item_id
     *
     * @param itemId the value for promo_info.item_id
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promo_info.promo_item_price
     *
     * @return the value of promo_info.promo_item_price
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    public Double getPromoItemPrice() {
        return promoItemPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promo_info.promo_item_price
     *
     * @param promoItemPrice the value for promo_info.promo_item_price
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    public void setPromoItemPrice(Double promoItemPrice) {
        this.promoItemPrice = promoItemPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promo_info.end_time
     *
     * @return the value of promo_info.end_time
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promo_info.end_time
     *
     * @param endTime the value for promo_info.end_time
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}