package org.anti.seckill.mapper;

import org.anti.seckill.domain.PromoDO;

public interface PromoDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo_info
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo_info
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    int insert(PromoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo_info
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    int insertSelective(PromoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo_info
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    PromoDO selectByPrimaryKey(Integer id);

    PromoDO selectByItemId(Integer itemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo_info
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    int updateByPrimaryKeySelective(PromoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo_info
     *
     * @mbg.generated Tue May 04 14:18:43 JST 2021
     */
    int updateByPrimaryKey(PromoDO record);
}