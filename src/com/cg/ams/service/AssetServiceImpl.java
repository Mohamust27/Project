package com.cg.ams.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.cg.ams.bean.AssetAllocationBean;
import com.cg.ams.bean.AssetsBean;
import com.cg.ams.dao.AssetDaoImpl;
import com.cg.ams.dao.IAssetDao;
import com.cg.ams.exception.AMSException;

public class AssetServiceImpl implements IAssetService {
	IAssetDao assetDao = new AssetDaoImpl();
	static Logger logger = Logger.getLogger(AssetServiceImpl.class);

	@Override
	public String getuserType(String userName, String password)
			throws AMSException {
		return assetDao.getuserType(userName, password);
	}

	@Override
	public int allocateAsset(int empId, String assetname) throws AMSException {
		return assetDao.allocateAsset(empId, assetname);
	}

	@Override
	public int deallocateAsset(int empId1, String assetname1)
			throws AMSException {
		return assetDao.deallocateAsset(empId1, assetname1);
	}

	@Override
	public int insertDetails(AssetsBean assetbean) throws AMSException {
		return assetDao.insertDetails(assetbean);
	}

	/*
	 * @Override public int approve(String assetName,int empNo) throws
	 * AMSException { // TODO Auto-generated method stub return
	 * assetDao.approve(assetName,empNo); }
	 */
	@Override
	public int approve(AssetAllocationBean assetallocation) throws AMSException {
		return assetDao.approve(assetallocation);
	}

	@Override
	public int viewQuantity(String assetName) throws AMSException {
		return assetDao.viewQuantity(assetName);
	}

	@Override
	public int decrementQuantity(String assetName) throws AMSException {
		return assetDao.decrementQuantity(assetName);
	}

	@Override
	public int deleteAsset(String assetName) throws AMSException {
		return assetDao.increase(assetName);
	}

	@Override
	public int incrementQuantity(String assetName) throws AMSException {
		return assetDao.incrementQuantity(assetName);
	}

	@Override
	public int deleteRequest(int empNo) throws AMSException {
		return assetDao.deleteRequest(empNo);
	}

	@Override
	public int validAsset(String assetname) throws AMSException {
		return assetDao.validAsset(assetname);
	}

	@Override
	public int updateAsset(AssetsBean assetbean) throws AMSException {

		return assetDao.updateAsset(assetbean);
	}

	@Override
	public List<AssetAllocationBean> viewRequest() throws AMSException {
		return assetDao.viewRequest();
	}

}
