import transaction from 'app/entities/transaction/transaction.reducer';
import product from 'app/entities/product/product.reducer';
import client from 'app/entities/client/client.reducer';
/* jhipster-needle-add-reducer-import - JHipster will add reducer here */

const entitiesReducers = {
  transaction,
  product,
  client,
  /* jhipster-needle-add-reducer-combine - JHipster will add reducer here */
};

export default entitiesReducers;
