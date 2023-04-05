CREATE TABLE [productlines] (
  [productLine] int,
  [textDescription] nvarchar(255),
  [htmlDescription] nvarchar(255),
  [image] nvarchar(255)
)
GO

CREATE TABLE [product] (
  [productCode] int,
  [productName] nvarchar(255),
  [productLine] nvarchar(255),
  [productScale] nvarchar(255),
  [productVendor] nvarchar(255),
  [productDescription] nvarchar(255),
  [quantityinStock] nvarchar(255),
  [buyprice] nvarchar(255),
  [MSRP] nvarchar(255)
)
GO

CREATE TABLE [orderdetails] (
  [orderNumber] int,
  [productCode] nvarchar(255),
  [quantityOrdered] nvarchar(255),
  [priceEach] nvarchar(255),
  [orderListNumber] nvarchar(255)
)
GO

CREATE TABLE [employees] (
  [employeeNumber] int,
  [lastName] nvarchar(255),
  [firstName] nvarchar(255),
  [edansion] nvarchar(255),
  [email] nvarchar(255),
  [officeCode] nvarchar(255),
  [reportsTo] nvarchar(255),
  [jobTitle] nvarchar(255)
)
GO

CREATE TABLE [customers] (
  [customersNumber] int,
  [customersName] nvarchar(255),
  [contactLastName] nvarchar(255),
  [contactFirstName] nvarchar(255),
  [phone] int,
  [addressLine1] nvarchar(255),
  [addressLine2] nvarchar(255),
  [city] nvarchar(255),
  [state] nvarchar(255),
  [postalCode] nvarchar(255),
  [country] nvarchar(255),
  [salesRepEmployeeNumber] nvarchar(255),
  [creditLimit] nvarchar(255)
)
GO

CREATE TABLE [offices] (
  [officeCode] int,
  [city] nvarchar(255),
  [phone] int,
  [addressLine1] nvarchar(255),
  [addressLine2] nvarchar(255),
  [state] nvarchar(255),
  [country] nvarchar(255),
  [postalCode] nvarchar(255),
  [territory] nvarchar(255)
)
GO

CREATE TABLE [orders] (
  [orderNumber] int,
  [orderDate] nvarchar(255),
  [requiredDate] nvarchar(255),
  [shippedDate] nvarchar(255),
  [status] nvarchar(255),
  [comments] nvarchar(255),
  [customerNumber] nvarchar(255)
)
GO

CREATE TABLE [payments] (
  [customerNumber] int,
  [checkNumber] int,
  [paymentDate] nvarchar(255),
  [amount] nvarchar(255)
)
GO

ALTER TABLE [product] ADD FOREIGN KEY ([productLine]) REFERENCES [productlines] ([htmlDescription])
GO

ALTER TABLE [orderdetails] ADD FOREIGN KEY ([quantityOrdered]) REFERENCES [product] ([productLine])
GO

ALTER TABLE [employees] ADD FOREIGN KEY ([employeeNumber]) REFERENCES [employees] ([reportsTo])
GO

ALTER TABLE [customers] ADD FOREIGN KEY ([customersNumber]) REFERENCES [employees] ([jobTitle])
GO

ALTER TABLE [employees] ADD FOREIGN KEY ([firstName]) REFERENCES [offices] ([addressLine2])
GO

ALTER TABLE [orders] ADD FOREIGN KEY ([orderDate]) REFERENCES [orderdetails] ([orderListNumber])
GO

ALTER TABLE [orders] ADD FOREIGN KEY ([status]) REFERENCES [customers] ([customersName])
GO

ALTER TABLE [payments] ADD FOREIGN KEY ([customerNumber]) REFERENCES [customers] ([postalCode])
GO
