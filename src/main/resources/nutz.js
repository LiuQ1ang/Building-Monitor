var ioc = {
	dataSource : {
		type : "com.alibaba.druid.pool.DruidDataSource",
		events : {
			depose : 'close'
		},
		fields : {
			driverClassName : "com.mysql.jdbc.Driver",
			url : "jdbc:mysql://localhost:3306/buildingmonitor",
			username : "root",
			password : "kismet"
		}
	},
	dao : {  
        type : "org.nutz.dao.impl.NutDao",  
        args : [ {  
            refer : "dataSource"  
        } ]  
    },
    accountService : {
		type : "com.ca.impl.service.AccountServiceImpl",
		fields : {
			dao : {
				refer : 'dao'
			}
		}
	},
	acountController : {
		type : "com.ca.controller.AcountController",
		fields : {
			accountService : {
				refer : 'accountService'
			}
		}
	},
	dataService : {
		type : "com.ca.impl.service.DataServiceImpl",
		fields : {
			dao : {
				refer : 'dao'
			}
		}
	},
	dataController : {
		type : "com.ca.controller.DataController",
		fields : {
			dataService : {
				refer : 'dataService'
			}
		}
	}
}