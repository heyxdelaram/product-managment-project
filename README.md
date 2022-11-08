## A Factory Product Management System
###### Application Instructions :bookmark_tabs:

A food production factory has 5 types of products:
- Canned
- Home Hygienics
- Dairy
- Snacks
- Protein

Each production line works in a different building. The main warehouse is inside the factory and it has 5 storage rooms. However, there's no refrigerator to keep the perishable goods and they have to send these products with cars that have refrigerators implemented in them.

Imperishable goods need a maximum storage day labeled on them.

Perishable goods need maximum and minimum temperatures labeled on them.

The workflow goes like this:

The Marketing and Sales team starts to brainstorm and plan with the financial manager on what goods to produce according to customer demands.

The technical supervisor of each line is responsible for producing the products that have been submitted in the system.

These products are transported to the warehouses and the warehouse supervisor has to 
record the products that have been received and stored in the warehouse.

Marketing and Sales Team:

They find what goods are in demand according to customer demands, market analysis, etc. They predict the number and type of these products. This team should be able to record their orders. 

The order statuses are separated into three groups by the technical supervisor:

- In queue = products that will be produced soon
- In production = products that are currently being produced 
- Done and delivered = products that have been produced and delivered to the warehouse

Technical Supervisor:

The person that must manage the production line based on the initial materials and orders, which are the ones that the marketing team recorded in the system. They start the work day with the production line by running the system. Every day at 2 pm, they print the production invoice until that time and give it to the warehouse manager to deliver them to the warehouse so that they can change the order status for the sales and marketing team.

Warehouse Manager:

Based on the printed invoice and the received products, they check if the number of products in the invoice and the ones in the warehouse are equal or not, if so, they verify the invoice.

Every product has a name, code, production date, and expiration date. The price and storage conditions vary for each product type.

- name
- code
- price
- perishable/imperishable
- address

Each box contains 24 goods.

Transportation outside the factory is done in two ways. Dairy products(Perishable goods) need a refrigerator-implemented truck and carry up to 5 tons. The rest of the products are transported via normal trucks with a tolerance of 10 tons.

