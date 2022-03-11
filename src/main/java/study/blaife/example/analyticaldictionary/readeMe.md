## 字典项解析

业务内容如下：  
- 字典表内容如下：
  
  |字典类型 `key_no`|字典编号 `key_value`|具体含义 `caption`|
  |:---:|:---:|:---:|
  |1035|JO|约旦|
  |1035|JP|日本|
  |1035|KE|肯尼亚|
  |1035|KG|吉尔吉斯斯坦|
  |1035|KH|柬埔寨|
  |1035|KI|基里巴斯|
  |1002|1|内资企业|
  |1002|2|中外合资企业|
  |1002|3|外资企业|
  |1002|4|其他|
- 业务数据表内容如下：
  
  |公司名称 `company_name`|公司所在地 `company_site`|公司性质 `company_nature`|
  |:---:|:---:|:---:|
  |公司A|JO|1|
  |公司B|JP|3|
  |公司C|KG|2|
  |公司D|KI|4|
  |公司E|KG|2|
  |公司F|KI|1|
  |公司G|JO|3|
  |公司H|KH|4|

### 任务要求

模拟从数据库中查出，并设置其字典项中文内容，使用一个工具类确保在不同表中都可以使用。


### 思路

- 存储业务数据表内容及字典项编号和对应字段值
- 从数据库中获取所有需要的字典内容
- 通过反射获取实体列表中的内容，并通过字典项Map获取其对应解释，填入实体中的对应字段中




